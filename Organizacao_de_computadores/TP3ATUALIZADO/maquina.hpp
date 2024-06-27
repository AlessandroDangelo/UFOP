#pragma once
#include <iostream>
#include <ctime>
#include <bits/stdc++.h>
#include "endereco.hpp"
#include "instrucao.hpp"
#include "blocoMemoria.hpp"
#include "mmu.hpp"
using namespace std;
void montarMemoria(BlocoMemoria** memoria, int tamanho, int qdePalavrasBloco);

void montarMemoriaVazia(int tamanho, BlocoMemoria** cache);

void carregarInstrucoesTXT(Instrucao** memoriaInstrucoes);

void maquina(Instrucao** memoriaInstrucoes, BlocoMemoria** HD, BlocoMemoria** ram,int tamRAM, BlocoMemoria*** cache, int* tamanhoCache, int qtdCache);
