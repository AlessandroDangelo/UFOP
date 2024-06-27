#include <stdio.h>

#include "grid.hpp"

int main() {
    Grid grid;
    Ponto p;

    inicializaGrid(&grid);

    do {
        printf("\nDigite as coordenadas do ponto: \n");

        printf("X: ");
        scanf("%lf", &p.x);
        printf("Y: ");
        scanf("%lf", &p.y);
        
        addToGrid(&grid, p);

    } while(p.x >=0 && p.y>=0);

    imprimirGrid(grid);

    printf("\nPesquisa ponto: \n");

    printf("X: ");
    scanf("%lf", &p.x);
    printf("Y: ");
    scanf("%lf", &p.y);

    int resultado = pesquisarPonto(grid, p);
    if(resultado) printf("\nPonto encontrado: P(%.1lf, %.1lf)", p.x, p.y);
    else printf("\nPonto nao encontrado.");
    
    printf("\nRemova um ponto: \n");

    printf("X: ");
    scanf("%lf", &p.x);
    printf("Y: ");
    scanf("%lf", &p.y);
    resultado = removerPonto(&grid, p);
    
    
    imprimirGrid(grid);
    return 0;
}