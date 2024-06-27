#ifndef INSTRUCAO_HPP
#define INSTRUCAO_HPP

#include "endereco.hpp"

typedef struct Instrucao instrucao;

void montarInstrucoes(Instrucao* memoriaInstrucoes,int tamanhoPrograma);
Instrucao* Criar_Instrucao();
Instrucao* Criar_Instrucao(int tamanhoPrograma);

Endereco* getadd1(Instrucao* aux, int pc);
Endereco* getadd1(Instrucao* aux);
Endereco* getadd2(Instrucao* aux, int pc);
Endereco* getadd2(Instrucao* aux);
Endereco* getadd3(Instrucao* aux, int pc);
Endereco* getadd3(Instrucao* aux);
void setAdd1(Instrucao* aux, Endereco* add1);
void setAdd2(Instrucao* aux, Endereco* add2);
void setAdd3(Instrucao* aux, Endereco* add3);
int getOpcode(Instrucao* aux);
int getOpcode(Instrucao* aux, int pc);
void setOpcode(Instrucao* aux, int opcode);
void delete_instrucao(Instrucao* n);
	
#endif