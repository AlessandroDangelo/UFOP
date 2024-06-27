#include <iostream>
#include <cstdlib>
#include <fstream>
#include "instrucao.hpp"
#include "BlocoMemoria.hpp"
#include "endereco.hpp"
#include "MMU.hpp"
using namespace std;

void montarHD(int tamanhoHD, int qdePalavrasBloco, BlocoMemoria* HD);
void MontarMultiplicacao(BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, BlocoMemoria* HD, int tamanhoCache1, int tamanhoCache2, int tamanhoRam, int tamanhoHD, Instrucao* Registrador);
void maquina(Instrucao* memoriaInstrucoes, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, BlocoMemoria* HD, int tamanhoCache1, int tamanhoCache2, int tamanhoRam, int tamanhoHD, Instrucao* Registrador);

int main(){
	const int tamanhoHD = 10000;
	const int tamanhoRam = 1000;
	const int tamanhoCache1 = 8;
	const int tamanhoCache2 = 16;
	const int tamanhoPrograma = 1000;
	const int qdePalavrasBloco = 4;

	Instrucao* Registrador = Criar_Instrucao();

	Instrucao* memoriaInstrucoes = Criar_Instrucao(tamanhoPrograma);
	BlocoMemoria* RAM = Criar_BlocoMemoria(tamanhoRam);
	BlocoMemoria* cache1 = Criar_BlocoMemoria(tamanhoCache1);
	BlocoMemoria* cache2 = Criar_BlocoMemoria(tamanhoCache2);
	BlocoMemoria* HD = Criar_BlocoMemoria(tamanhoHD);

	montarHD(tamanhoHD, qdePalavrasBloco, HD);
	montarInstrucoes(memoriaInstrucoes,tamanhoPrograma); // HD ---------------------------------------

	maquina(memoriaInstrucoes,RAM,cache1,cache2,HD,tamanhoCache1,tamanhoCache2,tamanhoRam,tamanhoHD,Registrador); // MODIFICAR

	delete_instrucao(memoriaInstrucoes);
	delete_memoria(RAM);
	delete_memoria(cache1);
	delete_memoria(cache2);

	return 0;
}

void montarHD(int tamanhoHD, int qdePalavrasBloco, BlocoMemoria* HD){
	for(int i = 0; i < tamanhoHD; i++){
	int* palavras = new int[qdePalavrasBloco];

	for(int j = 0; j < qdePalavrasBloco; j++){
		palavras[j] = rand()%10000;
	}
	setPalavras(HD,palavras,i);
	}
}

/*void MontarMultiplicacao(BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, BlocoMemoria* HD, int tamanhoCache1, int tamanhoCache2, int tamanhoRam, int tamanhoHD, Instrucao* Registrador){
	int multiplicador, multiplicando;
	cout << "VALORES A MULTIPLICAR: " << endl;
	cin >> multiplicador >> multiplicando;

	Instrucao* inst = Criar_Instrucao(2);

	setOpcode(inst,0,1);
	setAdd1(inst,getadd1(memoriaInstrucoes,PC),0);
	setAdd2(inst,getadd2(memoriaInstrucoes,PC),0);
	setAdd3(inst,getadd3(memoriaInstrucoes,PC),0);

	setOpcode(inst,1,-1);
	setAdd1(inst,getadd1(memoriaInstrucoes,PC),1);
	setAdd2(inst,getadd2(memoriaInstrucoes,PC),1);
	setAdd3(inst,getadd3(memoriaInstrucoes,PC),1);

	maquina(inst,RAM,cache1,cache2,HD,tamanhoCache1,tamanhoCache2,tamanhoRam,tamanhoHD,Registrador);
	cout << endl << "FINALIZANDO MULTIPLICACAO !!!" << endl;
	delete_instrucao(inst);
}*/

void maquina(Instrucao* memoriaInstrucoes, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, BlocoMemoria* HD, int tamanhoCache1, int tamanhoCache2, int tamanhoRam, int tamanhoHD, Instrucao* Registrador){ //memoria* instrucao, int* RAM
  int PC = 0;
  int interrupcao = 0; // --------------- VARIAVEL QUE GERA A INTERRUPÇÃO -------------------------------
  int opcode = 5, custo = 0, missC1 = 0, hitC1 = 0, missC2 = 0, hitC2 = 0, missRam = 0, hitRam = 0;
  int end1,end2,end3,conteudo1,conteudo2,soma;
  int* palavras;
  int min1 = 0, min2 = 0, max1 = 0, max2 = 0, minR = 0, maxR = 0; // -------- PQ ESSES VALORES ? -----------------------------------
  
  opcode = getOpcode(memoriaInstrucoes,PC);
  
  	while(opcode != -1){
    	opcode = getOpcode(memoriaInstrucoes,PC);
    
	    if(opcode != -1){
	    	BlocoMemoria* dadoMemoriaAdd1 = buscarNasMemorias(getEndBloco(getadd1(memoriaInstrucoes,PC)), RAM, cache1, HD, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, tamanhoHD, &min1, &min2, &max1, &max2, &minR, &maxR);
			BlocoMemoria* dadoMemoriaAdd2 = buscarNasMemorias(getEndBloco(getadd2(memoriaInstrucoes,PC)), RAM, cache1, HD, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, tamanhoHD, &min1, &min2, &max1, &max2, &minR, &maxR);
			BlocoMemoria* dadoMemoriaAdd3 = buscarNasMemorias(getEndBloco(getadd3(memoriaInstrucoes,PC)), RAM, cache1, HD, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, tamanhoHD, &min1, &min2, &max1, &max2, &minR, &maxR);

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
				hitRam++;					
			}
			else if(getCacheHit(dadoMemoriaAdd1)==4){ // MISS QUANDO ACESSA HD IGUAL NA RAM ---> COLOCAR HIT NA RAM TB -------------
				missC1++;
				missC2++;	
				missRam++;	
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
				hitRam++; // VERIFICAR SE É NECESSARIO -------------------------					
			}
			else if(getCacheHit(dadoMemoriaAdd2)==4){
				missC1++;
				missC2++;
				missRam++; // VERIFICAR SE É NECESSARIO ------------------------					
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
				hitRam++;					
			}
			else if(getCacheHit(dadoMemoriaAdd3)==4){
				missC1++;
				missC2++;			
				missRam++;		
			}

			cout << "CUSTO DE EXECUCAO: " << custo << endl;
			cout << "CACHE 1 HIT: " << hitC1 << endl << "CACHE 1 MISS: " << missC1 << endl << "CACHE 2 HIT: " << hitC2 << endl << "CACHE 2 MISS: " << missC2 << endl << "Ram HIT: " << hitRam << endl << "Ram MISS: " << missRam << endl;

			//cout << "ENDERECO:\nopcode = " << getOpcode(memoriaInstrucoes,PC) << " end 1 = " << getEndBloco(getadd1(memoriaInstrucoes,PC)) << " end 2 = " << getEndBloco(getadd2(memoriaInstrucoes,PC)) << " end 3 = " << getEndBloco(getadd3(memoriaInstrucoes,PC)) << "\n" << " end p1 = " << getEndPalavra(getadd1(memoriaInstrucoes,PC)) << " end p2 = " << getEndPalavra(getadd2(memoriaInstrucoes,PC)) << " end p3 = " << getEndPalavra(getadd3(memoriaInstrucoes,PC)) << endl << endl;


			if(interrupcao == 4){
				setOpcode(Registrador,getOpcode(memoriaInstrucoes,PC));
				setAdd1(Registrador,getadd1(memoriaInstrucoes,PC));
				setAdd2(Registrador,getadd2(memoriaInstrucoes,PC));
				setAdd3(Registrador,getadd3(memoriaInstrucoes,PC));

				//MontarMultiplicacao(RAM,cache1,cache2,HD,tamanhoCache1,tamanhoCache2,tamanhoRam,tamanhoHD,Registrador);
				cout << endl << "CHEGOU AQUI " << /*getOpcode(Registrador) <<*/ endl;
			}			
			if(getOpcode(Registrador) != 0){
				cout << "COMECOU:\nopcode = " << getOpcode(Registrador) << " end 1 = " << getEndBloco(getadd1(Registrador)) << " end 2 = " << getEndBloco(getadd2(Registrador)) << " end 3 = " << getEndBloco(getadd3(Registrador)) << "\n" << " end p1 = " << getEndPalavra(getadd1(Registrador)) << " end p2 = " << getEndPalavra(getadd2(Registrador)) << " end p3 = " << getEndPalavra(getadd3(Registrador)) << endl << endl;
				int t;
				cin >> t;
				opcode = getOpcode(Registrador);

				BlocoMemoria* dadoMemoriaAdd1 = buscarNasMemorias(getEndBloco(getadd1(Registrador)), RAM, cache1, HD, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, tamanhoHD, &min1, &min2, &max1, &max2, &minR, &maxR);
				BlocoMemoria* dadoMemoriaAdd2 = buscarNasMemorias(getEndBloco(getadd2(Registrador)), RAM, cache1, HD, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, tamanhoHD, &min1, &min2, &max1, &max2, &minR, &maxR);
				BlocoMemoria* dadoMemoriaAdd3 = buscarNasMemorias(getEndBloco(getadd3(Registrador)), RAM, cache1, HD, tamanhoCache1, tamanhoCache2, cache2, tamanhoRam, tamanhoHD, &min1, &min2, &max1, &max2, &minR, &maxR);
			
				setOpcode(Registrador,0);
				cout << "ACABOU" << endl << endl;
			}
			
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
	  	interrupcao = rand()%1000000000;
	}
	cout << endl;
	cout << "CUSTO TOTAL: " << custo << endl;
	cout << "CACHE 1 HIT: " << hitC1 << endl << "CACHE 1 MISS: " << missC1 << endl << "CACHE 2 HIT: " << hitC2 << endl << "CACHE 2 MISS: " << missC2 << endl << "Ram HIT: " << hitRam << endl << "Ram MISS: " << missRam << endl;
}