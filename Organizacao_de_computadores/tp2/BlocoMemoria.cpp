#include <iostream>
#include<ctime>
#include <cstdlib>
using namespace std;


struct BlocoMemoria{
	int* palavras;
	int endBloco;
	bool atualizado;
	int custo;
	int cacheHit;
	int x;
};

void Troca_BlocoMemoria(BlocoMemoria* b1, BlocoMemoria* b2, int i, int x){
	BlocoMemoria aux = b1[x];	
	b1[x].palavras = b2[i].palavras;
	b1[x].endBloco = b2[i].endBloco;
	b1[x].cacheHit = b2[i].cacheHit;
	
	b2[i].palavras = aux.palavras;
	b2[i].endBloco = aux.endBloco;
	b2[i].cacheHit = aux.cacheHit;
}

void Retorna_BlocoMemoria(BlocoMemoria* bloco, int i, BlocoMemoria* aux){
	aux->palavras = bloco[i].palavras;
	aux->endBloco = bloco[i].endBloco;
	aux->atualizado = bloco[i].atualizado;
	aux->custo = bloco[i].custo;
	aux->cacheHit = bloco[i].cacheHit;
	aux->x = bloco[i].x;
}

void Atribuir_BlocoMemoria(BlocoMemoria* b1, BlocoMemoria* b2){
	b1 = b2;
}

void Atribuir_BlocoMemoria(BlocoMemoria* b1, BlocoMemoria* b2,int x,int i){
	b1[x].palavras = b2[i].palavras;
	b1[x].endBloco = b2[i].endBloco;
	b1[x].cacheHit = b2[i].cacheHit;
}

BlocoMemoria* Criar_BlocoMemoria(int tamanho){
	BlocoMemoria* memoria = new BlocoMemoria[tamanho];
	for(int i = 0; i < tamanho; i++){
		memoria[i].palavras = new int[4];
		memoria[i].endBloco = i;
		memoria[i].atualizado = false;
		memoria[i].custo = 0;
		memoria[i].cacheHit = 0;
		memoria[i].x = i;
	}
	return memoria;
}

void imprime(BlocoMemoria* memoria, int tamanho){
	for(int i = 0; i < tamanho; i++){
		for(int j = 0; j < 4; j++){
			cout << memoria[i].palavras[j] << " ";
		}
		cout << memoria[i].endBloco << " ";
		cout << memoria[i].atualizado << " ";
		cout << memoria[i].custo << " ";
		cout << memoria[i].cacheHit << " ";
		cout << memoria[i].x << endl;
	}
	cout << endl;
}

BlocoMemoria* Criar_BlocoMemoria1(){
	BlocoMemoria* memoria = new BlocoMemoria;
	memoria->palavras = new int[4];
	memoria->endBloco = -1;
	memoria->atualizado = false;
	memoria->custo = 0;
	memoria->cacheHit = 0;
	memoria->x = time(NULL);
	return memoria;
}


void Deleta_BlocoMemoria(BlocoMemoria* memoria){
	delete memoria;
}

int getCacheHit(BlocoMemoria* memoria){
		return memoria->cacheHit;
	}

void setCacheHit(BlocoMemoria* memoria, int i, int cacheHit){
	memoria[i].cacheHit = cacheHit;
	}	

int getCusto(BlocoMemoria* memoria){
	return memoria->custo;
}

void setCusto(BlocoMemoria* memoria, int custo){
	memoria->custo = custo;
}

int* getPalavras(BlocoMemoria* memoria){
	return memoria->palavras;
}

void setPalavras(BlocoMemoria* memoria, int palavras[4], int indice){
	memoria[indice].palavras = palavras;
}

int getEndBloco(BlocoMemoria* memoria, int i){
	return memoria[i].endBloco;
}

void setEndBloco(BlocoMemoria* memoria, int endBloco){
	memoria->endBloco = endBloco;
}

bool isAtualizado(BlocoMemoria* memoria, int i){
	return memoria->atualizado;
}

void setAtualizado(BlocoMemoria* memoria, int i){
	memoria[i].atualizado = !memoria[i].atualizado;
}

int getTempo(BlocoMemoria* memoria, int i){
	return memoria[i].x;
}

void setTempo(BlocoMemoria* memoria,int i, int* max){
	memoria[i].x = *max;
}

void delete_memoria(BlocoMemoria* memoria){
	delete[] memoria;
}