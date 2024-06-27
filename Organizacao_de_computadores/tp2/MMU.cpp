#include <iostream>
#include "endereco.hpp"
#include "BlocoMemoria.hpp"
#include "MMU.hpp"
using namespace std;

BlocoMemoria* buscarNasMemorias(int end, BlocoMemoria* RAM, BlocoMemoria* cache1, int tamanhoCache1, int tamanhoCache2, BlocoMemoria* cache2, int tamanhoRam,int* min1, int* min2, int* max1, int* max2){
	BlocoMemoria* aux = Criar_BlocoMemoria1();
	int custo = 0, x1 = 0, x2 = 0;
	bool r = false;
	
	custo += 10;
	for(int i = 0; i < tamanhoCache1 && r != true; i++){
		if(getEndBloco(cache1,i) == end){
			setCacheHit(cache1,i,1);
			setTempo(cache1,i,max1);
			*max1 += 1;
			Retorna_BlocoMemoria(cache1,i,aux);
			r = true;
		}
	}
	if(r == false){
		custo += 100;
		for(int i = 0; i < tamanhoCache2 && r != true; i++){
			if(getEndBloco(cache2,i) == end){
				setCacheHit(cache2,i,2);
				setTempo(cache2,i,max2);
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
	//-----------------------------------------------------------------------------------------------------
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
	setCusto(aux,custo);
	return aux;
	Deleta_BlocoMemoria(aux);

}
