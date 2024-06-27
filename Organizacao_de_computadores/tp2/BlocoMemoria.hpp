#ifndef BLOCOMEMORIA_HPP
#define BLOCOMEMORIA_HPP

typedef struct BlocoMemoria BlocoMemoria;

void Troca_BlocoMemoria(BlocoMemoria* b1, BlocoMemoria* b2, int i, int x);
void Retorna_BlocoMemoria(BlocoMemoria* bloco, int i, BlocoMemoria* aux);

void Atribuir_BlocoMemoria(BlocoMemoria* b1, BlocoMemoria* b2);
void Atribuir_BlocoMemoria(BlocoMemoria* b1, BlocoMemoria* b2,int x,int i);

BlocoMemoria* Criar_BlocoMemoria(int tamanho);
BlocoMemoria* Criar_BlocoMemoria1();

void imprime(BlocoMemoria* memoria, int tamanho);

void Deleta_BlocoMemoria(BlocoMemoria* memoria);

int getCacheHit(BlocoMemoria* memoria);
void setCacheHit(BlocoMemoria* memoria, int i, int cacheHit);

int getCusto(BlocoMemoria* memoria);
void setCusto(BlocoMemoria* memoria, int custo);

int* getPalavras(BlocoMemoria* memoria);
void setPalavras(BlocoMemoria* memoria, int palavras[4], int indice);

int getEndBloco(BlocoMemoria* memoria, int i);
void setEndBloco(BlocoMemoria* memoria, int endBloco);

bool isAtualizado(BlocoMemoria* memoria, int i);
void setAtualizado(BlocoMemoria* memoria, int i);

int getTempo(BlocoMemoria* memoria, int i);
void setTempo(BlocoMemoria* memoria, int i, int* max);

void delete_memoria(BlocoMemoria* memoria);
#endif