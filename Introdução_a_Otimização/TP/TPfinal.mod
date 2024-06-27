set N:={0..20};    # Conjunto de n�s (clientes e esta��es de recarga)
set V:={1..3};    # Conjunto de ve�culos

param D{N,N};  # Dist�ncia entre os n�s
param Ri{N};   # Indicador de esta��o de recarga (1 ou 0)
param Ai{N};   # Demanda dos n�s
param Ch{V};   # Capacidade de carga dos ve�culos
param Lh{V};   # Dist�ncia m�xima percorrida pelos ve�culos

var x{N,N,V} binary;  # Vari�vel bin�ria: 1 se o ve�culo h vai do n� i ao n� j
var u{N,V} integer >= 0;  # Vari�vel inteira: sequ�ncia de visita dos n�s
var phi{V,N} >=0; # Var�vel para saber se tem combustivel ou n�o

minimize TotalDistance:
    sum{h in V, i in N, j in N: i != j} (D[i,j] * x[i,j,h]);




subject to VisitOnce{i in N diff {0}: Ri[i] = 0}:
    sum{h in V, j in N: i != j} x[i,j,h] = 1;
    
subject to VisitOnce1{i in N diff {0}: Ri[i] = 0}:
    sum{h in V, j in N: i != j} x[j,i,h] = 1;

subject to AllVehiclesLeaveDepot{h in V}:
    sum{i in N diff {0}} x[0,i,h] <= 1;

subject to InAndOut{i in N, h in V}:
	sum{j in N: i != j} x[j,i,h] = sum{j in N: i != j} x[i,j,h];

subject to CapacityLimit{h in V, j in N diff {0}: Ri[j] = 0}: # faltou i != j e Ri[j]=0 e j diff {0}
    sum{i in N: i != j} Ai[j] * x[i,j,h] <= Ch[h]; # Ai[j] e n�o Ai[i]

subject to FullyChargedOnChargeStation{i in N, j in N, h in V: Ri[i] = 1}:
    phi[h, i] >= Lh[h];

subject to RemainingChargeAfterCustomer1{i in N diff {0}, j in N, h in V: Ri[i] = 0}:
    phi[h, i] <= Lh [h];

#subject to DistanceConstraint{h in V}:
#    sum{i in N, j in N diff {i}} D[i,j] * x[i,j,h] <= Lh[h];

subject to SequenceConstraint{ h in V, i in N, j in N diff {i}}:
    u[j,h] - u[i,h] >= 99999*(1 - x[i,j,h]);

#subject to SequenceConstrait12{h in V, i in N, j in N: i != j and j > 0}:
#    sum{j in N: j != i} x[i,j,1] - x[i,j,2] <= 1;

#subject to DiffenceSequenceConstrait23{i in N, j in N: i != j and j > 0}:
#	sum{j in N : j != i} x[i,j,2] <= 1 + x[i,j,3];

#subject to DiffenceSequenceConstrait13{i in N, j in N: i != j and j > 0}:
#	sum{j in N: j != i} x[i,j,3] <= 1 + x[i,j,1];

subject to RemainingChargeAfterCustomer{i in N diff {0}, j in N, h in V: i != j and Ri[i] = 0}:
    phi[h,i] - phi[h,j] * (1- Ri[j]) >= D[i,j] - 99999 *(1 - x[i,j,h]);

solve;

display x, u;

printf "Total Distance: %.2f\n", TotalDistance;

# Data
data;

param D:
       0         1         2         3         4         5         6         7         8         9         10        11        12        13        14        15        16        17        18        19        20:=
0  0.000000  0.139317  0.358307  0.437740  0.193495  0.337447  0.484769  0.199786  0.372476  0.201882  0.261700  0.209421  0.235106  0.540587  0.202192  2.811720  0.292332  0.178699  0.525199  0.330779  0.382030
1  0.139317  0.000000  0.463156  0.368905  0.235125  0.533078  0.574622  0.314066  0.363838  0.303176  0.172752  0.163643  0.554457  0.398999  0.298399  2.723076  0.235172  0.243691  0.253769  0.164903  0.248615
2  0.358307  0.463156  0.000000  0.735232  0.581995  0.111548  0.270918  0.139631  0.603872  0.492210  0.587168  0.375804  0.251875  0.771361  0.377821  3.108174  0.692806  0.196196  0.827797  0.275589  0.577083
3  0.437740  0.368905  0.735232  0.000000  0.285987  0.824400  0.719469  0.537959  0.585891  0.444738  0.517196  0.237406  0.578746  0.223134  0.488553  2.845791  0.525049  0.430815  0.338770  0.309463  0.567118
4  0.193495  0.235125  0.581995  0.285987  0.000000  0.641405  0.810566  0.345216  0.297417  0.363419  0.279390  0.408981  0.648937  0.442496  0.389066  2.812172  0.316267  0.306230  0.422101  0.313089  0.364232
5  0.337447  0.533078  0.111548  0.824400  0.641405  0.000000  0.472979  0.526702  0.693443  0.582891  0.677229  0.472139  0.156464  0.845444  0.611545  3.231905  0.649667  0.092687  0.926715  0.340137  0.716641
6  0.484769  0.574622  0.270918  0.719469  0.810566  0.472979  0.000000  0.465309  0.776990  0.679201  0.795014  0.744090  0.454713  0.812265  0.529375  3.205227  0.496382  0.336574  1.002072  0.276428  0.588978
7  0.199786  0.314066  0.139631  0.537959  0.345216  0.526702  0.465309  0.000000  0.485240  0.381003  0.471671  0.334532  0.230812  0.648161  0.405839  2.906079  0.468132  0.161850  0.654829  0.263097  0.300220
8  0.372476  0.363838  0.603872  0.585891  0.297417  0.693443  0.776990  0.485240  0.000000  0.144469  0.050630  0.454408  0.597677  0.566320  0.474601  2.519482  0.506517  0.485324  0.592600  0.538925  0.556185
9  0.201882  0.303176  0.492210  0.444738  0.363419  0.582891  0.679201  0.381003  0.144469  0.000000  0.116164  0.315792  0.454700  0.560974  0.324384  2.680890  0.302498  0.343262  0.474741  0.425522  0.447964
10 0.261700  0.172752  0.587168  0.517196  0.279390  0.677229  0.795014  0.471671  0.050630  0.116164  0.000000  0.411721  0.558792  0.520471  0.429006  2.469841  0.498698  0.429216  0.540661  0.485541  0.505619
11 0.209421  0.163643  0.375804  0.237406  0.408981  0.472139  0.744090  0.334532  0.454408  0.315792  0.411721  0.000000  0.399041  0.665996  0.444193  2.994469  0.400144  0.299007  0.316960  0.482144  0.288166
12 0.235106  0.554457  0.251875  0.578746  0.648937  0.156464  0.454713  0.230812  0.597677  0.454700  0.558792  0.399041  0.000000  0.800462  0.466548  3.144382  0.598720  0.258203  0.794196  0.215855  0.603198
13 0.540587  0.398999  0.771361  0.223134  0.442496  0.845444  0.812265  0.648161  0.566320  0.560974  0.520471  0.665996  0.800462  0.000000  0.432732  3.231105  0.249632  0.701913  0.356251  0.609448  0.597465
14 0.202192  0.298399  0.377821  0.488553  0.389066  0.611545  0.529375  0.405839  0.474601  0.324384  0.429006  0.444193  0.466548  0.432732  0.000000  2.811785  0.376299  0.294632  0.299214  0.347752  0.182696
15 2.811720  2.723076  3.108174  2.845791  2.812172  3.231905  3.205227  2.906079  2.519482  2.680890  2.469841  2.994469  3.144382  3.231105  2.811785  0.000000  2.845679  3.140654  3.004546  3.181829  3.073732
16 0.292332  0.235172  0.692806  0.525049  0.316267  0.649667  0.496382  0.468132  0.506517  0.302498  0.498698  0.400144  0.598720  0.249632  0.376299  2.845679  0.000000  0.510500  0.322038  0.516461  0.423712
17 0.178699  0.243691  0.196196  0.430815  0.306230  0.092687  0.336574  0.161850  0.485324  0.343262  0.429216  0.299007  0.258203  0.701913  0.294632  3.140654  0.510500  0.000000  0.638125  0.179266  0.447193
18 0.525199  0.253769  0.827797  0.338770  0.422101  0.926715  1.002072  0.654829  0.592600  0.474741  0.540661  0.316960  0.794196  0.356251  0.299214  3.004546  0.322038  0.638125  0.000000  0.676929  0.706693
19 0.330779  0.164903  0.275589  0.309463  0.313089  0.340137  0.276428  0.263097  0.538925  0.425522  0.485541  0.482144  0.215855  0.609448  0.347752  3.181829  0.516461  0.179266  0.676929  0.000000  0.364786
20 0.382030  0.248615  0.577083  0.567118  0.364232  0.716641  0.588978  0.300220  0.556185  0.447964  0.505619  0.288166  0.603198  0.597465  0.182696  3.073732  0.423712  0.447193  0.706693  0.364786  0.000000;


param Ri :=
0 1
1 0
2 1
3 0
4 0
5 0
6 1
7 0
8 1
9 1
10 0
11 0
12 1
13 0
14 1
15 0
16 1
17 0
18 0
19 0
20 1;


param Ai :=
0 0
1 68
2 0
3 27
4 47
5 63
6 0
7 49
8 0
9 0
10 68
11 23
12 0
13 62
14 0
15 57
16 0
17 17
18 76
19 27
20 0;

param Ch :=
1 200
2 200
3 200;

param Lh :=
1 0.6
2 0.7
3 0.8;

end;
