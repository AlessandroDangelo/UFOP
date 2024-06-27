#include <stdio.h>
#include <stdlib.h>

/*
    Multiplicando matrizes temos uma comlexidade de O(f(m)logn) , onde f(m) é o custo da multiplicação entre matrizes de ordem m,
  mas como a matriz de base é de ordem 2, então o custo da multiplicação será contante, então podemos dizer que o programa terá
  uma complexidade de O(logn).

*/
 
//multiplicar matrizes 2x2, R = A * B
void matrixMult2x2(long A[2][2], long B[2][2], long R[2][2]){
    long temp[2][2]; //Armazena temporariamente os resultados
    temp[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
    temp[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
    temp[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
    temp[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
    //Passa os resultados para R
    R[0][0] = temp[0][0];
    R[0][1] = temp[0][1];
    R[1][0] = temp[1][0];
    R[1][1] = temp[1][1];
}
 
//Calcula o n-ésimo número de Fibonacci O(log n)
long fibonacciLog(int n){
    if(n < 2){
        return n;
    }
    //Matriz de base
    long baseMatrix[2][2] = {{0,1},{1,1}};
     
    //Potenciação por quadrados
    long p[2][2] = {{1,0}, {0,1}};    
    while(n > 0){
        if((n % 2) != 0){
            matrixMult2x2(p, baseMatrix, p);
        }        
        matrixMult2x2(baseMatrix, baseMatrix, baseMatrix);
        n = n / 2;
    }
    return p[0][1];
}
 

int main() {

    printf("Fibonacci O(log n)\n");
    int n;
    scanf("%d", &n);
    printf("F%d = %d\n", n, fibonacciLog(n));
    return 0;
    
}