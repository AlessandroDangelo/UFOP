#include <iostream>
#include <utility>
#include <list>

using namespace std;


class Grafo {
    //numero de vértices
    int n;
    //numero de arestas
    int m;
    //grafo direcionado ou não
    int b;
    //ponteiro para um array contendo as listas de adjacências
    list<pair<int, int> > *adj;

public:
    Grafo (int n, int m, int b);
    void addAresta(int vo, int vd, int peso);
    void imprimeGrafo();
};

Grafo::Grafo(int n, int m, int b) {
    this->n = n;
    this->m = m;
    this->b = b;
    adj = new list<pair<int, int> >[n];
}

void Grafo::addAresta(int vo, int vd, int p) {
    //adiciona vértice de destino a lista de adjacentes do vértice de origem
    adj[vo-1].push_back(make_pair(vd, p));

    //se for não direcionado, adiciona a adjacencia no vertice de saida tb
    if(this->b == 0)
        adj[vd-1].push_back(make_pair(vo, p));
}

void Grafo::imprimeGrafo() {

    //imprima O VALOR DE n e m e texto pro valor binário
    cout << this->n << " " << this->m << " ";
    if(this->b == 1)
        cout << "DIRECIONADO";
    else
        cout << "NÃO DIRECIONADO";
    cout << endl;

    //imprima em linhas separadas as adjacências de cada vértice, indicando para cada uma delas o vértice de origem (enumerados de 1 a n), o vértice de destino e o peso da aresta/arco
    for(int i = 0; i < n ; i++){
        list<pair<int, int> >::iterator it;
        for(it = adj[i].begin(); it != adj[i].end(); ++it){
            cout << i+1 << " " << it->first << " " << it->second;
            cout << endl;
        }
    }
}

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
    Grafo grafo(n, m, b);

    //entrada de arestas
    int count = 0;
    int vo, vd, peso;
    while(count < m){
        cin >> vo >> vd >> peso;
        grafo.addAresta(vo, vd, peso);
        count++;
    }

    grafo.imprimeGrafo();

    return 0;
}
