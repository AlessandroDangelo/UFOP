#pragma once
#include <iostream>
#include <bits/stdc++.h>
#include "endereco.hpp"
#include "instrucao.hpp"
#include "blocoMemoria.hpp"

#define INTERRUPT     1
#define MOD_INTERRUPT 10
//CHANCE DE INTERRUPCAO = INTERRUPT / MOD_INTERRUPT

int associativo (BlocoMemoria** mem, Endereco e, int tam);
int getLowestHit(BlocoMemoria** memoria, int tam);
BlocoMemoria *buscarNasMemorias(Endereco *e, BlocoMemoria** HD, BlocoMemoria **ram, int tamRam, BlocoMemoria** cache[], int tamanhoCache[], int qtdCache);
BlocoMemoria *testaCache(int posicaoCache[], BlocoMemoria **ram, BlocoMemoria** cache[], int tamanhoCache[], int memoria, int qtdCache, int custo);
    //int memoria indica qual memoria está sendo testada, sendo 0 a cache 1.
