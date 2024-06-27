#include <iostream>
#include "endereco.hpp"
#include "BlocoMemoria.hpp"
#include "MMU.hpp"
using namespace std;

BlocoMemoria* buscarNasMemorias(int end, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* HD, int tamanhoCache1, int tamanhoCache2, BlocoMemoria* cache2, int tamanhoRam, int tamanhoHD, int* min1, int* min2, int* max1, int* max2, int* minR, int* maxR){
	BlocoMemoria* aux = Criar_BlocoMemoria1();
	int custo = 0, x1 = 0, x2 = 0, xR = 0;
	bool r = false;
	//imprime(cache1,tamanhoCache1);
	custo += 10;
	for(int i = 0; i < tamanhoCache1 && r != true; i++){
		if(getEndBloco(cache1,i) == end){
			setCacheHit(cache1,i,1);
			if(*max1 != 0){
				if(getTempo(cache1,i) == *min1) *min1 += 1;
				setTempo(cache1,i,max1);
			}
			else setTempo(cache1,i,min1);
			*max1 += 1;
			Retorna_BlocoMemoria(cache1,i,aux);
			r = true;
			//imprime(cache1,tamanhoCache1);
		}
	}
	if(r == false){
		custo += 100;
		for(int i = 0; i < tamanhoCache2 && r != true; i++){
			if(getEndBloco(cache2,i) == end){
				setCacheHit(cache2,i,2);
				if(*max2 != 0){
					if(getTempo(cache2,i) == *min2) *min2 += 1;
					setTempo(cache2,i,max2);
				}
				else setTempo(cache2,i,min2);
				*max2 += 1;
	//-----------------------------------------------------------------------------------------------------
				for(int j = 0; j < tamanhoCache1 && r != true; j++){//// REFAZER CRITERIO E CONTINUAR
					if(getTempo(cache1,j) == *min1){
						setTempo(cache1,j,max1);
						*max1 += 1;
						*min1 += 1;
						x1 = j;
						if(!isAtualizado(cache1,x1)){ // CUSTO DE PASSAR DA 2 PRA 1
							Atribuir_BlocoMemoria(cache1,cache2,x1,i);
							setAtualizado(cache1,x1);
						}
						else{
							Troca_BlocoMemoria(cache1,cache2,i,x1); // LEVA DA 2 PRA 1					
						}
						Retorna_BlocoMemoria(cache1,x1,aux);
						r = true;
					}
				}
			}
		}
	}
	if(r == false){
		custo += 1000;
		for(int i = 0; i < tamanhoRam && r != true; i++){
			if(getEndBloco(RAM,i) == end){
				setCacheHit(RAM,i,3);
				if(*maxR != 0){
					if(getTempo(RAM,i) == *minR) *minR += 1;
					setTempo(RAM,i,maxR);
				}
				else setTempo(RAM,i,maxR);
				*maxR += 1;
	//-------------------------------------------------------------------------------------------------------------
				for(int j = 0; j < tamanhoCache2 && r != true; j++){//// REFAZER CRITERIO E CONTINUAR
					if(getTempo(cache2,j) == *min2){
						setTempo(cache2,j,max2);
						*max2 += 1;
						*min2 += 1;
						x2 = j;
						if(!isAtualizado(cache2,x2)){
							Atribuir_BlocoMemoria(cache2,RAM,x2,i); // VERIFICAR SE ESTA CERTA A COMPARAÇAO
							setAtualizado(cache2,x2);
						}
						else{
							Troca_BlocoMemoria(cache2,RAM,i,x2); // LEVA DA 2 PRA RAM					
						}
	//-----------------------------------------------------------------------------------------------------------
						for(int j = 0; j < tamanhoCache1 && r != true; j++){//// REFAZER CRITERIO E CONTINUAR
							if(getTempo(cache1,j) == *min1){
								setTempo(cache1,j,max1);
								*max1 += 1;
								*min1 += 1;
								x1 = j;
								if(!isAtualizado(cache1,x1)){ // CUSTO DE PASSAR DA 2 PRA 1	
									Atribuir_BlocoMemoria(cache1,cache2,x1,x2);
									setAtualizado(cache1,x1);
								}
								else{
									Troca_BlocoMemoria(cache1,cache2,x2,x1); // LEVA DA 2 PRA 1				
								}
								Retorna_BlocoMemoria(cache1,x1,aux);
								r = true;
							}
						}
					}
				}
			}
		}
	}
	if(r == false){ // ----------------------------------- HD 
		custo += 10000;
		for(int i = 0; i < tamanhoHD && r != true; i++){
			if(getEndBloco(HD,i) == end){
				setCacheHit(HD,i,4);
	//-----------------------------------------------------------------------------------------------------
				for(int j = 0; j < tamanhoRam && r != true; j++){//// REFAZER CRITERIO E CONTINUAR
					if(getTempo(RAM,j) == *minR){
						setTempo(RAM,j,maxR);
						*maxR += 1;
						*minR += 1;
						xR = j;
						if(!isAtualizado(RAM,xR)){
							Atribuir_BlocoMemoria(RAM,HD,xR,i); // VERIFICAR SE ESTA CERTA A COMPARAÇAO
							setAtualizado(RAM,xR);
						}
						else{
							Troca_BlocoMemoria(RAM,HD,i,xR); // LEVA DO HD PRA RAM	//  MUDAR ORDEM DOS INDICES				
						}
	//-------------------------------------------------------------------------------------------------------
						for(int j = 0; j < tamanhoCache2 && r != true; j++){//// REFAZER CRITERIO E CONTINUAR
							if(getTempo(cache2,j) == *min2){
								setTempo(cache2,j,max2);
								*max2 += 1;
								*min2 += 1;
								x2 = j;
								if(!isAtualizado(cache2,x2)){ // CUSTO DE PASSAR DA Ram PRA 2
									Atribuir_BlocoMemoria(cache2,RAM,x2,xR);
									setAtualizado(cache2,x2);
								}
								else{
									Troca_BlocoMemoria(cache2,RAM,xR,x2); // LEVA DA Ram PRA 2			
								}
	//-------------------------------------------------------------------------------------------------------
								for(int j = 0; j < tamanhoCache1 && r != true; j++){
									if(getTempo(cache1,j) == *min1){
										setTempo(cache1,j,max1);
										*max1 += 1;
										*min1 += 1;
										x1 = j;
										if(!isAtualizado(cache1,x1)){ // CUSTO DE PASSAR DA 2 PRA 1	
											Atribuir_BlocoMemoria(cache1,cache2,x1,x2);
											setAtualizado(cache1,x1);
										}
										else{
											Troca_BlocoMemoria(cache1,cache2,x2,x1); // LEVA DA 2 PRA 1				
										}
										Retorna_BlocoMemoria(cache1,x1,aux);
										r = true;
									}
								}
							}
						}
					}
				}
			}
		}
	}
	setCusto(aux,custo);
	return aux;
	Deleta_BlocoMemoria(aux);

}
