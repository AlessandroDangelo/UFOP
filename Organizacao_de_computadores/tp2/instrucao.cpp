#include <iostream>
#include <fstream>
#include "endereco.hpp"
#include "instrucao.hpp"
using namespace std;

struct Instrucao{
 Endereco* add1;
 Endereco* add2;
 Endereco* add3;
 int opcode;
};

Instrucao* Criar_Instrucao(int tamanhoPrograma){
	Instrucao* aux = new Instrucao[tamanhoPrograma];
	for(int i = 0; i < tamanhoPrograma; i++){
		aux[i].opcode = 0;
		aux[i].add1 = novo_end();
		aux[i].add2 = novo_end();
		aux[i].add3 = novo_end();
	}
	return aux;
}

void montarInstrucoes(Instrucao* memoriaInstrucoes, int tamanhoPrograma){
	ifstream arquivo;
	int n;
	arquivo.open("instrucoes.txt");
	for(int i = 0; i < tamanhoPrograma; i++){
		arquivo >> memoriaInstrucoes[i].opcode;
		arquivo >> n;
		setEndBloco(getadd1(memoriaInstrucoes,i),n);
		arquivo >> n;
		setEndPalavra(getadd1(memoriaInstrucoes,i),n);
		arquivo >> n;
		setEndBloco(getadd2(memoriaInstrucoes,i),n);
		arquivo >> n;
		setEndPalavra(getadd2(memoriaInstrucoes,i),n);
		arquivo >> n;
		setEndBloco(getadd3(memoriaInstrucoes,i),n);
		arquivo >> n;
		setEndPalavra(getadd3(memoriaInstrucoes,i),n);
	}
	arquivo.close();

	/*for(int i = 0; i < tamanhoPrograma; i++){
		cout << memoriaInstrucoes[i].opcode << " " << getEndBloco(memoriaInstrucoes[i].add1) << " " << getEndPalavra(memoriaInstrucoes[i].add1) << " " << getEndBloco(memoriaInstrucoes[i].add2) << " " << getEndPalavra(memoriaInstrucoes[i].add2) << " " << getEndBloco(memoriaInstrucoes[i].add3) << " " << getEndPalavra(memoriaInstrucoes[i].add3) << endl;
	}*/

}

Endereco* getadd1(Instrucao* aux, int pc){
	return aux[pc].add1;
}
Endereco* getadd2(Instrucao* aux, int pc){
	return aux[pc].add2;
}
Endereco* getadd3(Instrucao* aux, int pc){
	return aux[pc].add3;
}
void setAdd1(Instrucao* aux, Endereco* add1){
	aux->add1 = add1;
}
void setAdd2(Instrucao* aux, Endereco* add2){
	aux->add2 = add2;
}
void setAdd3(Instrucao* aux, Endereco* add3){
	aux->add3 = add3;
}
int getOpcode(Instrucao* aux, int pc){
	return aux[pc].opcode;
}
void setOpcode(Instrucao* aux, int pc, int opcode){
	aux->opcode = opcode;
}

void delete_instrucao(Instrucao* n){
	delete[] n;
}