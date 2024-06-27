#include <iostream>
#include <utility>
#include <list>
#include <queue>

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
    //busca em largura a partir do vértice v
    void bfs(int v);
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

void Grafo::bfs(int v){

    //Marque todos os vértices como não visitados
    bool visitados[n];
    for(int i = 0; i < n; i++)
        visitados[i] = false;

    //crie uma fila vazia
    list<int> fila;

    // marque v como explorado e adicione-o na fila
    visitados[v] = true;
    fila.push_back(v);

    // enquanto tiver elementos na fila
    while(!fila.empty()){

        v = fila.front();
        cout << v + 1 << " ";
        //remove v da lista
        fila.pop_front();

        //para todo vértice vizinho de v
        list<pair<int, int> >::iterator it;
        for (it = adj[v].begin(); it != adj[v].end(); ++it)
        {
            //se não foi explorado, explore
            if (!visitados[(*it).first - 1])
            {
                //marque como visitado
                visitados[(*it).first - 1] = true;
                //insira na lista
                fila.push_back((*it).first - 1);
            }
        }
    }
}

int main() {
    
    //quantidade de vertíces, quantidade de arestas, valor binário para indicar se é D ou ND e um índice do vértice (enumerados de 1 a n) a partir do qual será realizada a busca
    int n = 0, m = 0, b = -1, i = 0;

    cin >> n >> m >> b >> i;
    //validação da entrada
    while(n <= 0 || m < 0 || b < 0 || b > 1 || i < 1 || i > n){
        cout << "Entrada invalida! Tente novamente." << endl;
        cin >> n >> m >> b >> i;
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

    grafo.bfs(i-1);

    return 0;
}
