#include <iostream>
#include <cstdlib>
#include <fstream>
#include "instrucao.hpp"
#include "BlocoMemoria.hpp"
#include "endereco.hpp"
#include "MMU.hpp"
using namespace std;

void montarRam(int tamanhoRam, int qdePalavrasBloco, BlocoMemoria* RAM);
void maquina(Instrucao* memoriaInstrucoes, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, int tamanhoCache1, int tamanhoCache2, int tamanhoRam);

int main(){
	const int tamanhoRam = 1000;
	const int tamanhoCache1 = 8;
	const int tamanhoCache2 = 16;
	const int tamanhoPrograma = 1000;
	const int qdePalavrasBloco = 4;

	Instrucao* memoriaInstrucoes = Criar_Instrucao(tamanhoPrograma);
	BlocoMemoria* RAM = Criar_BlocoMemoria(tamanhoRam);
	BlocoMemoria* cache1 = Criar_BlocoMemoria(tamanhoCache1);
	BlocoMemoria* cache2 = Criar_BlocoMemoria(tamanhoCache2);

	montarRam(tamanhoRam, qdePalavrasBloco, RAM);
	montarInstrucoes(memoriaInstrucoes,tamanhoPrograma);

	maquina(memoriaInstrucoes,RAM,cache1,cache2,tamanhoCache1,tamanhoCache2,tamanhoRam); // MODIFICAR

	delete_instrucao(memoriaInstrucoes);
	delete_memoria(RAM);
	delete_memoria(cache1);
	delete_memoria(cache2);

	return 0;
}

void montarRam(int tamanhoRam, int qdePalavrasBloco, BlocoMemoria* RAM){
	for(int i = 0; i < tamanhoRam; i++){
	int* palavras = new int[qdePalavrasBloco];

	for(int j = 0; j < qdePalavrasBloco; j++){
		palavras[j] = rand()%1000000;
	}
	setPalavras(RAM,palavras,i);
	}
}

void maquina(Instrucao* memoriaInstrucoes, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, int tamanhoCache1, int tamanhoCache2, int tamanhoRam){ //memoria* instrucao, int* RAM
  int PC = 0;
  int opcode = 5, custo = 0, missC1 = 0, hitC1 = 0, missC2 = 0, hitC2 = 0;
  int end1,end2,end3,conteudo1,conteudo2,soma;
  int* palavras;
  int min1 = 0, min2 = 0, max1 = 7, max2 = 15;
  
  opcode = getOpcode(memoriaInstrucoes,PC);
  
  	while(opcode != -1){
    	opcode = getOpcode(memoriaInstrucoes,PC);
    
	    if(opcode != -1){
	    	BlocoMemoria* dadoMemoriaAdd1 = buscarNasMemorias(getEndBloco(getadd1(memoriaInstrucoes,PC)), RAM, cache1, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, &min1, &min2, &max1, &max2);
			BlocoMemoria* dadoMemoriaAdd2 = buscarNasMemorias(getEndBloco(getadd2(memoriaInstrucoes,PC)), RAM, cache1, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, &min1, &min2, &max1, &max2);
			BlocoMemoria* dadoMemoriaAdd3 = buscarNasMemorias(getEndBloco(getadd3(memoriaInstrucoes,PC)), RAM, cache1, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, &min1, &min2, &max1, &max2);

			custo += getCusto(dadoMemoriaAdd1);	

			if(getCacheHit(dadoMemoriaAdd1)==1){
				hitC1++;
			}
			else if(getCacheHit(dadoMemoriaAdd1)==2){
				missC1++;
				hitC2++;
			}
			else if(getCacheHit(dadoMemoriaAdd1)==3){
				missC1++;
				missC2++;					
			}
			if(getCacheHit(dadoMemoriaAdd2)==1){
				hitC1++;
			}
			else if(getCacheHit(dadoMemoriaAdd2)==2){
				missC1++;
				hitC2++;
			}
			else if(getCacheHit(dadoMemoriaAdd2)==3){
				missC1++;
				missC2++;					
			}
			if(getCacheHit(dadoMemoriaAdd3)==1){
				hitC1++;
			}
			else if(getCacheHit(dadoMemoriaAdd3)==2){
				missC1++;
				hitC2++;
			}
			else if(getCacheHit(dadoMemoriaAdd3)==3){
				missC1++;
				missC2++;					
			}

			cout << "CUSTO DE EXECUCAO: " << custo << endl;
			cout << "CACHE 1 HIT: " << hitC1 << endl << "CACHE 1 MISS: " << missC1 << endl << "CACHE 2 HIT: " << hitC2 << endl << "CACHE 2 MISS: " << missC2 << endl; 

		   	switch(opcode){
		      case 1://SOMAR
		      	palavras = getPalavras(dadoMemoriaAdd1);
				conteudo1 = palavras[getEndPalavra(getadd1(memoriaInstrucoes,getEndBloco(getadd1(memoriaInstrucoes,PC))))];
				palavras = getPalavras(dadoMemoriaAdd2);
				conteudo2 = palavras[getEndPalavra(getadd2(memoriaInstrucoes,getEndBloco(getadd2(memoriaInstrucoes,PC))))];
				
				soma = conteudo1+conteudo2;
				cout << "SOMANDO: " << conteudo1 << " + " << conteudo2 << " = " << soma << endl;
				
				//salvando resultado na cache1
				palavras = getPalavras(dadoMemoriaAdd3);
				palavras[getEndPalavra(getadd3(memoriaInstrucoes,PC))] = soma;// VERIFICAR SE TA ATUALIZADO
		        break;
		      case 2://SUBTRAIR
		      	palavras = getPalavras(dadoMemoriaAdd1);
				conteudo1 = palavras[getEndPalavra(getadd1(memoriaInstrucoes,getEndBloco(getadd1(memoriaInstrucoes,PC))))];
				palavras = getPalavras(dadoMemoriaAdd2);
				conteudo2 = palavras[getEndPalavra(getadd2(memoriaInstrucoes,getEndBloco(getadd2(memoriaInstrucoes,PC))))];

		        soma = conteudo1 - conteudo2;
		        cout << "SUBTRAINDO: " << conteudo1 << " - " << conteudo2 << " = " << soma << endl;

		        palavras = getPalavras(dadoMemoriaAdd3);
				palavras[getEndPalavra(getadd3(memoriaInstrucoes,PC))] = soma;// VERIFICAR SE TA ATUALIZADO
		        break;
		    }
	  	}
	  	PC++;
	}
	cout << endl;
	cout << "CUSTO TOTAL: " << custo << endl;
	cout << "CACHE 1 HIT: " << hitC1 << endl << "CACHE 1 MISS: " << missC1 << endl << "CACHE 2 HIT: " << hitC2 << endl << "CACHE 2 MISS: " << missC2 << endl;
}