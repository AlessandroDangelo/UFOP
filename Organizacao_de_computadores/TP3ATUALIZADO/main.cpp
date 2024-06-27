#include <iostream>
#include <cmath>
#include <bits/stdc++.h>
#include "endereco.hpp"
#include "instrucao.hpp"
#include "blocoMemoria.hpp"
#include "mmu.hpp"
#include "maquina.hpp"

using namespace std;

int main(int argc, char const *argv[]){

			int tamanhoRam;
			int tamanhoHD;

			int *tamanhoCache;
			int qtdCaches = 2;

			int tamanhoPrograma;
			int qdePalavrasBloco;
			int menu = 0;
			bool devmode = 0;

			cout<<"\t\t\t\t\t======================"<<endl;
			cout<<"\t\t\t\t\t||SIMULADOR DE CACHE||"<<endl;
			cout<<"\t\t\t\t\t======================"<<endl;

	while(menu!=-1){
		cout<<endl<<"\t\t\t\t\t||=======MENU=======||"<<endl;
		cout<<"| -1 Para Sair |::| 0 Para Configurar variaveis da cache |::| 1 Para Carregar Valores Default |"<<endl;
		cout<<"\nOpcao: ";
		cin>>menu;
		if(menu==420){

			menu = 0;
			devmode = true;
			cout<<endl<<"\t\t\t\t\tM0D0 D353NV0LV3D0R AT1VAD0"<<endl;

		}
		switch(menu){

			case 0:{

				cout<<"\nNúmero de Caches<--------------->(default: 2 | maximo: 3):";
				cin>>qtdCaches;
				tamanhoCache = new int[qtdCaches];
				for (int i = 0; i < qtdCaches; i++)
				{
					cout<<"Tamanho da Cache "<<i + 1<<"<--------------->(default: "<<(8 * (pow(2,i)))<<"):";
					cin>>tamanhoCache[i];
				}
				
				tamanhoPrograma = 49984;
				qdePalavrasBloco = 4;
				tamanhoRam = 1024;
				tamanhoHD = 4096;

				if(devmode){

					cout<<"Tamanho da RAM<------------------->(NAO RECOMENDADO MUDAR default: 1024):";
					cin>>tamanhoRam;
					cout<<"Tamanho do HD<-------------------->(NAO RECOMENDADO MUDAR default: 4096):";
					cin>>tamanhoHD;
					cout<<"Tamanho do programa<-------------->(NAO RECOMENDADO MUDAR default: 49984):";
					cin>>tamanhoPrograma;
					cout<<"Quantidade de Palavras no Bloco<-->(NAO RECOMENDADO MUDAR default: 4):";
					cin>>qdePalavrasBloco;

				}
				break;

			}

			default:{

				tamanhoRam = 1024;
				tamanhoHD = 4096;

				qtdCaches = 2;
				tamanhoCache = new int[qtdCaches];
				for (int i = 0; i < qtdCaches; i++)
				{
					tamanhoCache[i] = 8 * pow(2, i);
				}

				tamanhoPrograma = 49984;
				qdePalavrasBloco = 4;

				break;
			}

		}
		if(menu!=-1){
			Instrucao **memoriaInstrucoes = new Instrucao*[tamanhoPrograma];

			for(int i=0; i<tamanhoPrograma; i++){
				memoriaInstrucoes[i] = gerarInst();
			}

			BlocoMemoria **ram = new BlocoMemoria*[tamanhoRam];
			for(int i=0; i<tamanhoRam; i++){
				ram[i] = gerarBM();
			}

			BlocoMemoria **HD = new BlocoMemoria*[tamanhoHD];
			for (int i = 0; i < tamanhoHD; i++)
			{
				HD[i] = gerarBM();
			}
			

			BlocoMemoria ***cache;
			cache = new BlocoMemoria**[qtdCaches];
			for (int i = 0; i < qtdCaches; i++)
			{
				cache[i] = new BlocoMemoria*[tamanhoCache[i]];
				for (int j = 0; j < tamanhoCache[i]; j++)
				{
					cache[i][j] = gerarBM();
				}	
			}


					montarMemoria(ram, tamanhoRam, 4);
					montarMemoria(HD, tamanhoHD, qdePalavrasBloco);
					for (int i = 0; i < qtdCaches; i++)
					{
						montarMemoriaVazia(tamanhoCache[i], cache[i]);
					}
					carregarInstrucoesTXT(memoriaInstrucoes);
					
					maquina(memoriaInstrucoes, HD, ram, tamanhoRam, cache, tamanhoCache, qtdCaches);

					 // deleteBM(cache2, tamanhoCache2);
					 // deleteBM(cache1, tamanhoCache1);
					 // deleteBM(ram, tamanhoRam);
					 // deleteInst(memoriaInstrucoes, tamanhoPrograma);

					cout<<"terminou\n";
				cout<<"---------------------"<<endl<<endl;
		}
	}

	return 0;
}
