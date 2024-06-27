#ifndef INSTRUCAO_HPP
#define INSTRUCAO_HPP

#include "endereco.hpp"

typedef struct Instrucao instrucao;

void montarInstrucoes(Instrucao* memoriaInstrucoes,int tamanhoPrograma);
Instrucao* Criar_Instrucao(int tamanhoPrograma);

Endereco* getadd1(Instrucao* aux, int pc);
Endereco* getadd2(Instrucao* aux, int pc);
Endereco* getadd3(Instrucao* aux, int pc);
void setAdd1(Instrucao* aux, endereco add1);
void setAdd2(Instrucao* aux, endereco add2);
void setAdd2(Instrucao* aux, endereco add3);
int getOpcode(Instrucao* aux, int pc);
void setOpcode(Instrucao* aux, int pc, int opcode);
void delete_instrucao(Instrucao* n);
	
#endif