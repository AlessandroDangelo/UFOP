#ifndef MMU_HPP 
#define MMU_HPP

#include "BlocoMemoria.hpp"
#include "endereco.hpp"
#include "instrucao.hpp"

BlocoMemoria* buscarNasMemorias(int end, BlocoMemoria* RAM, BlocoMemoria* cache1, int tamanhoCache1, int tamanhoCache2, BlocoMemoria* cache2, int tamanhoRam,int* min1, int* min2, int* max1, int* max2);
void salvarNasMemorias_Inst(Endereco* e, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2, int soma, int* palavras);
void salvarNasMemorias_Bloc(BlocoMemoria* b, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* cache2);

#endif