#include <iostream>
#include <list>

using namespace std;

int main() {
    //quantidade de vertíces, quantidade de arestas, valor binário para indicar se é D ou ND
    int n = 0, m = 0, b = -1;

    cin >> n >> m >> b;
    //validação da entrada
    while(n <= 0 || m < 0 || b < 0 || b > 1){
        cout << "Entrada invalida! Tente novamente." << endl;
        cin >> n >> m >> b;
    }
    
    //Cria grafo de n vértices;
    int grafo[n][n];

    //zera todas as adjacências
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++)
            grafo[i][j] = 0;
    }

    //entrada de arestas
    int count = 0;
    int vo, vd, peso;
    while(count < m){
        cin >> vo >> vd >> peso;
        grafo[vo-1][vd-1] = peso;
        //se for não direcionado, adiciona a adjacencia no vertice de saida tb
        if(b == 0)
            grafo[vd-1][vo-1] = peso;
        count++;
    }

    //imprima O VALOR DE n e m e texto pro valor binário
    cout << n << " " << m << " ";
    if(b == 1)
        cout << "DIRECIONADO";
    else
        cout << "NÃO DIRECIONADO";
    cout << endl;

    //imprima em linhas separadas as adjacências de cada vértice, indicando para cada uma delas o vértice de origem (enumerados de 1 a n), o vértice de destino e o peso da aresta/arco
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(grafo[i][j] != 0){
                cout << i+1 << " " << j + 1 << " " << grafo[i][j] << endl;
            }
        }
    }

    return 0;
}
