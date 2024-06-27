#include "mmu.hpp"
using namespace std;

int associativo (BlocoMemoria** mem, Endereco *e, int tam){
  for (int i = 0; i < tam; i++){

    if (getEndBlocoBM( mem[i] ) == getEndBloco(e))
      return i;
  }
  return -1;
}

int getLowestHit(BlocoMemoria** memoria, int tam){
	int lowest = 999999;
	int position = 0;
  	for (int i = 0; i < tam; i++){
    	if (lowest > getVezesUsado(memoria[i])){
      	lowest = getVezesUsado(memoria[i]);
      	position = i;
    }
  }

  	return position;
}

BlocoMemoria *buscarNasMemorias(Endereco *e, BlocoMemoria** HD ,BlocoMemoria **ram, int tamRam, BlocoMemoria** cache[], int tamanhoCache[], int qtdCache)
{
		//acesso associativo a memoria
	int* posicaoCache = new int[qtdCache];
	for (int i = 0; i < qtdCache; i++)
	{
		posicaoCache[i] = associativo(cache[i], e, tamanhoCache[i]);
	}
	int posicaoRam = associativo(ram, e, tamRam);

	int* positionLowest = new int[qtdCache + 1];
	for (int i = 0; i <= qtdCache; i++)
	{
		if(i == qtdCache)
			positionLowest[i] = getLowestHit(ram, tamRam);
		positionLowest[i] = getLowestHit(cache[i], tamanhoCache[i]);
	}
	
	
		int custo =0;

	for (int i = 0; i <= qtdCache + 1; i++)
	{
			if (i == 0 && posicaoCache[i] != -1){
			custo+=10;

			incVezesUsado(cache[i][posicaoCache[i]]);
			setCusto     (cache[i][posicaoCache[i]],custo);
			setCacheHit  (cache[i][posicaoCache[i]],i+1);
			setAtualizado(cache[i][posicaoCache[i]]);

			return cache[i][posicaoCache[i]];
		}else if(i < qtdCache && posicaoCache[i] != -1){

			switch (i)
			{
			case 1:
				custo += 30;
				break;
			case 2:
				custo += 90;
			
			default:
				break;
			}
			
			incVezesUsado(cache[i][posicaoCache[i]]);
			setCusto     (cache[i][posicaoCache[i]],custo);
			setCacheHit  (cache[i][posicaoCache[i]],i+1);
			setAtualizado(cache[i][posicaoCache[i]]);

			positionLowest[i] = posicaoCache[i];

			return testaCache(positionLowest, ram, cache, tamanhoCache, i, qtdCache, custo);
		}else if(i == qtdCache && posicaoRam != -1){
			//buscar na ram E O REPASSAR A C3 (se tiver) DEPOIS C2 E DEPOIS A C1
			custo +=1110;

			if(!isAtualizado(cache[i-1][positionLowest[i-1]])){
				cache[i-1][positionLowest[i-1]] = ram[ getEndBloco(e) ];
				incVezesUsado(cache[i-1][positionLowest[i-1]]);
				setCacheHit(cache[i-1][positionLowest[i-1]],i+1);
				return testaCache(positionLowest, ram, cache, tamanhoCache, i, qtdCache, custo);
			}

			else{
				ram[getEndBlocoBM(cache[i-1][positionLowest[i-1]])] = cache[i-1][i-1];
				incVezesUsado(cache[i-1][positionLowest[i-1]]);
				setAtualizado(cache[i-1][positionLowest[i-1]]);
				cache[i-1][positionLowest[i-1]] = ram[ getEndBloco(e) ];
				setCacheHit  (cache[i-1][positionLowest[i-1]],i+1);
				return testaCache(positionLowest, ram, cache, tamanhoCache, i, qtdCache, custo);
			}
		}else if(i == qtdCache + 1){
			//buscar no HD E O REPASSAR A RAM E DEPOIS AS CACHES
			custo += 810;
			if (!isAtualizado(ram[positionLowest[i - 1]]))
			{
				ram[positionLowest[i - 1]] = HD[ getEndBloco(e)];
				incVezesUsado(ram[positionLowest[i - 1]]);
				setCacheHit(ram[positionLowest[i - 1]], i+1);
				return testaCache(positionLowest, ram, cache, tamanhoCache, i - 1, qtdCache, custo);
			}else{
				HD[getEndBlocoBM(ram[positionLowest[i - 1]])] = ram[positionLowest[i - 1]];
				incVezesUsado(ram[positionLowest[i - 1]]);
				setAtualizado(ram[positionLowest[i - 1]]);
			  	ram[positionLowest[i - 1]] = HD[ getEndBloco(e) ];
				setCacheHit  (ram[positionLowest[i - 1]],i+1);
				return testaCache(positionLowest, ram, cache, tamanhoCache, i - 1, qtdCache, custo);
			}			
		}
	}
	return NULL;
}

BlocoMemoria *testaCache(int posicao[], BlocoMemoria** ram, BlocoMemoria** cache[], int tamanhoCache[], int memoria, int qtdCache, int custo){
	if (memoria == 0)//Bloco se encontra na Cache 1
	{
		return cache[memoria][posicao[memoria]];
	}else if (memoria == qtdCache) //Bloco se encontra na RAM
	{
		if(!isAtualizado(cache[memoria -1][posicao[memoria - 1]])){
			cache[memoria - 1][posicao[memoria - 1]] = ram[posicao[memoria]];
		}else{
			BlocoMemoria* aux = cache[memoria - 1][posicao[memoria-1]];
			cache[memoria - 1][posicao[memoria - 1]] = ram[posicao[memoria]];
			ram[posicao[memoria]] = aux;
		}
		return testaCache(posicao, ram, cache, tamanhoCache, (memoria - 1), qtdCache, custo);
	}
	
	if(!isAtualizado(cache[memoria-1][posicao[memoria - 1]])){ //Bloco se encontra em uma Cache > 1
		cache[memoria - 1][posicao[memoria - 1]] = cache[memoria][posicao[memoria]];
	}else{
			BlocoMemoria *aux = cache[memoria - 1][posicao[memoria -1]];
			cache[memoria - 1][posicao[memoria -1]] = cache[memoria][posicao[memoria]];
			cache[memoria][posicao[memoria]] = aux;
		}
		setCusto(cache[memoria - 1][posicao[memoria -1]],custo);

		return testaCache(posicao, ram, cache, tamanhoCache, memoria - 1, qtdCache, custo);
}