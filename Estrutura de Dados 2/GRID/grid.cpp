#include "grid.hpp"

void printPoint(Ponto p) {
    printf("\nP(%.2lf,%.2lf)", p.x, p.y);
}

void inicializaGrid(Grid *g) {
    for(int i = 0; i < TAM_GRID; i++) {
        for(int j = 0; j < TAM_GRID; j++) {
            inicializaBucket(&g->grid[i][j]);
        }
    }
}

void inicializaBucket(Bucket *b) {
    Ponto inicial; inicial.x = -1; inicial.y = -1;
    for(int h = 0; h < MAX_ITENS; h++) b->lista[h] = inicial;
}

void printGrid(Grid *g) {
    for(int i = 0; i < TAM_GRID; i++) {
        for(int j = 0; j < TAM_GRID; j++) {
            printf("\n\nGrid %d - %d: ", i+1, j+1);
            printBucket(&g->grid[i][j]);
        }
        printf("\n\n");
    }
}

void printBucket(Bucket *b) {
    for(int h = 0; h < MAX_ITENS; h++) printPoint(b->lista[h]);
}

void addToGrid(Grid *grid, Ponto p) {

    // Achar posição inteira de inserção do ponto
    int insertX, insertY;

    // insertX = difx == 0 ? floor(p.x) - 1: floor(p.x);
    insertX = floor(p.x);
    insertY = floor(p.y);

    // Adicionar no bucket da poosição insertX, insertY
    grid->grid[insertX][insertY].lista[0] = p;
}

void imprimirGrid(Grid g) {
    printf("\n\n");
    for(int i = TAM_GRID - 1; i >= 0; i--) {
        for(int j = 0; j < TAM_GRID; j++) {
            imprimirPonto(g.grid[j][i].lista[0]);
            printf("\t");
        }
        printf("\n\n");
    }
}

void imprimirPonto(Ponto p) {
    if(p.x == -1 || p.y == -1) printf("    -    ");
    else printf("(%.1lf,%.1lf)", p.x, p.y);
}

int pesquisarPonto(Grid g, Ponto p) {

    // Achar posição inteira da onde estaria o ponto desejado
    int insertX, insertY;
    insertX = floor(p.x);
    insertY = floor(p.y);

    // Adicionar no bucket da poosição insertX, insertY
    if(g.grid[insertX][insertY].lista[0].x == p.x && g.grid[insertX][insertY].lista[0].y == p.y) return 1;

    return 0;
}

int removerPonto(Grid *g, Ponto p){
    //printf("%d\n", pesquisarPonto(*g, p));
    if(!pesquisarPonto(*g, p)){
        printf("Ponto nao encontrado\n");
        return 0;
    }
    int insertX, insertY;
    insertX = floor(p.x);
    insertY = floor(p.y);

    Ponto inicial; inicial.x = -1; inicial.y = -1;
    (*g).grid[insertX][insertY].lista[0] = inicial;
    
    return 1;
    
}