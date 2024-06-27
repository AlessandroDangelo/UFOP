//Nem precisa ler, a implementação está errada, só enviei para não ganhar falta

#include <iostream>
#include <utility>
#include <list>
#include <queue>

#define INFINITO 10000000

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
    void dijkstra(int v);
    void print(int *dt, int *rot, int v);
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

void Grafo::dijkstra(int v) {

    int dt[n], rot[n];
    bool explorados[n];

    //zera conteúdo
    for(int i = 0; i < n; i++)
    {
        dt[i] = INFINITO;
        rot[i] = 0;
        explorados[i] = false;
    }
    //inicia conteúdo do vértice de inicio
    dt[v] = 0;

    // fila de prioridades de pair (distancia, vértice)
    priority_queue < pair<int, int>,
            vector<pair<int, int> >, greater<pair<int, int> > > prioridades;

    // insere na fila
    prioridades.push(make_pair(dt[v], v));

    //enquanto não tiver fechado todos os vértices
    while(!prioridades.empty())
    {
        pair<int, int> p = prioridades.top(); // extrai o pair do topo
        int u = p.second; // obtém o vértice do pair
        prioridades.pop(); // remove da fila

        // verifica se o vértice não foi expandido
        if(!explorados[u])
        {
            // marca como visitado
            explorados[u] = true;

            list<pair<int, int> >::iterator it;
            // percorre os vértices vizinhos
            for(it = adj[u].begin(); it != adj[u].end(); it++)
            {
                // obtém o vértice adjacente e o peso da aresta
                int va = it->first;
                int peso = it->second;

                if(dt[va] > (dt[u] + peso)){
                    // atualiza a distância de va e insere na fila
                    dt[va] = dt[u] + peso;
                    rot[va] = u;
                    prioridades.push(make_pair(dt[va], va));
                }
            }
        }
    }

    print(dt, rot, v);
}
void Grafo::print(int *dt, int *rot, int v) {

    for(int j = 0; j < n; j++){
        if(j != (v)){
            cout << j + 1  << " (" << dt[j + 1] << ") : ";
            cout << endl;
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

    grafo.dijkstra(i-1);

    return 0;
}
