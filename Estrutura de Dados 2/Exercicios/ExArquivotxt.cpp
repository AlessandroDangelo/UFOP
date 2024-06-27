#include <iostream>


using namespace std;

int main (){

    FILE *alunos, *conceitos;
    int matricula;
    char nome, conceitodoaluno;

    if ((alunos = fopen("alunos.txt", "r")) == NULL){
        puts("Nao foi possivel abrir o arquivo");
        return 0;
    }
    if ((conceitos = fopen("conceito.txt", "w")) == NULL){
        puts("Nao foi possivel abrir o arquivo");
        return 0;
    }

    for (int i = 0; i < 38; i++){

        if(i < 4){
            matricula = getc(alunos);
            putc(matricula,conceitos);
        }

        if(i == 5){
            putc("-",conceitos);
        }

        if (i > 5 && i < 36){
            nome = getc(alunos);
            putc(nome,conceitos);
        }

        if(i == 36){
            putc("-",conceitos);
        }

        //if (i == 37){
           // conceitodoaluno = getc(alunos);
           // putc(nome,conceitos);
        //}
        
    }

    



    fclose (alunos);
    fclose (conceitos);
    return 0;
}