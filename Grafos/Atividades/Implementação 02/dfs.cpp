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
    //busca em profundidade a partir do vértice v
    void dfs(int v);
    void busca(int v, bool *explorados);
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

//criar uma pilha e empilhar o nó raiz no topo. Enquanto a pilha não estiver vazia, percorra os nós adjacentes do nó raiz. Caso um nó não seja o nó buscado, e ainda não tenha sido visitado, empilhe-o.
void Grafo::dfs(int v){

    bool explorados[n];
    // marca todos como não explorados
    for(int j = 0; j < n; j++)
        explorados[j] = false;

    busca(v, explorados);
}

void Grafo::busca(int v, bool *explorados) {

    //marque o vértice v como explorado
    explorados[v] = true;

    cout << v + 1 << " ";

    list<pair<int, int> >::iterator it;
    //enquanto existir vizinho
    for (it = adj[v].begin(); it != adj[v].end(); ++it) {
        // se ainda não foi explorado
        if (!explorados[(*it).first - 1]) {
            busca(((*it).first - 1), explorados);
        }
    }

    //se o grafo for direcionado
    for(int j = 0; j < n; j++){
        if(!explorados[j])
            busca(j, explorados);

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

    grafo.dfs(i-1);

    return 0;
}

