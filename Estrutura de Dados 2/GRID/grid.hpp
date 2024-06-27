#ifndef GRID_HPP
#define GRID_HPP

#define TAM_GRID 5
#define MAX_ITENS 1

#define MAX_X 5
#define MAX_Y 5

#include <stdio.h>
#include <math.h>

typedef struct {
    double x;
    double y;
} Ponto;

typedef struct {
    Ponto lista[MAX_ITENS];
} Bucket;

typedef struct {
    Bucket grid[TAM_GRID][TAM_GRID];
} Grid;

void printPoint(Ponto p);
void inicializaGrid(Grid *g);
void inicializaBucket(Bucket *b);
void printGrid(Grid *g);
void printBucket(Bucket *b);
void addToGrid(Grid *grid, Ponto p);

void imprimirGrid(Grid g);
void imprimirPonto(Ponto p);
int pesquisarPonto(Grid g, Ponto p);
int removerPonto(Grid *g, Ponto p);

#endif