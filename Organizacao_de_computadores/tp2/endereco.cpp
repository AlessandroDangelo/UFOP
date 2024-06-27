#include <iostream>
using namespace std;

struct Endereco{
	int endBloco;
	int endPalavra;
};

Endereco* novo_end(){
	Endereco* aux = new Endereco;
	return aux;
}

int getEndBloco(Endereco* aux){
	return aux->endBloco;
}

void setEndBloco(Endereco* aux, int endBloco){
	aux->endBloco = endBloco;
}

int getEndPalavra(Endereco* aux){
	return aux->endPalavra;
}

void setEndPalavra(Endereco* aux, int endPalavra){
	aux->endPalavra = endPalavra;
}