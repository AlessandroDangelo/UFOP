#ifndef MMU_HPP 
#define MMU_HPP

#include "BlocoMemoria.hpp"
#include "endereco.hpp"
#include "instrucao.hpp"

BlocoMemoria* buscarNasMemorias(int end, BlocoMemoria* RAM, BlocoMemoria* cache1, BlocoMemoria* HD, int tamanhoCache1, int tamanhoCache2, BlocoMemoria* cache2, int tamanhoRam, int tamanhoHD, int* min1, int* min2, int* max1, int* max2, int* minR, int* maxR);
#endif