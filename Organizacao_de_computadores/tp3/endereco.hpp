#ifndef ENDERECO_HPP
#define ENDERECO_HPP

typedef struct Endereco endereco;

Endereco* novo_end();
int getEndBloco(Endereco* aux);
void setEndBloco(Endereco* aux, int endBloco);
int getEndPalavra(Endereco* aux);
void setEndPalavra(Endereco* aux, int endPalavra);

#endif