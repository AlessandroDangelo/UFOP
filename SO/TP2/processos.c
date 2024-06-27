#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <stdbool.h>
#include <unistd.h>
#include <sys/wait.h>
#include <signal.h>

#define READ  0
#define WRITE 1

void display();

int main(){

    display();

    int saldo[2];
    int opcao[2];
    int caractere = 0;
    int comeco = 0;
    int contagem = 0;
    
    if (pipe(saldo) < 0 || pipe(opcao) < 0){
        printf("Erro ao criar pipe\n");
        exit(1);
    }
    
    int aux = 0;
    if (write(saldo[WRITE], &aux, sizeof(int)) == -1){
        printf("Erro ao escrever no pipe\n");
        exit(1);
    }

    pid_t pidPai = getpid();
    pid_t filho1 = fork();
    if (filho1 < 0){
        printf("Erro ao criar fork\n");
        exit(1);
    }
    fflush(stdin);

    pid_t filho2 = -1;
    if (getpid() == pidPai){
        filho2 = fork();
        if (filho2 < 0){
            exit(1);
        }
        if (filho2 == 0){
            filho1 = -1;
        }
    }
    
    
    
    //1000 vezes soma
    
    /*if (comeco == 0){
        int operacao;
        int x;
        do{
            read(opcao[READ], &operacao, sizeof(int));

            if (operacao == 43){
                read(saldo[READ], &x, sizeof(int));
                x += 100;
                write(saldo[WRITE], &x, sizeof(int));
            }
            else{
                write(opcao[WRITE], &operacao, sizeof(int)); 
            }
        }while(contagem != 999);
        comeco = 1;
    }
    
    
    //1000 vezes subtração
    
    if (comeco == 1){
        int operacao;
        int x;
        do{
            read(opcao[READ], &operacao, sizeof(int));

            if (operacao == 43){
                read(saldo[READ], &x, sizeof(int));
                x -= 100;
                write(saldo[WRITE], &x, sizeof(int));
            }
            else{
                write(opcao[WRITE], &operacao, sizeof(int)); 
            }
        }while(contagem != 1999);
        comeco == 2;
    }*/
    
    
    
    
    
    if (getpid() == pidPai){
        int x;
        while(caractere != 101 || caractere != 69){
            do{
                caractere = (int)getchar();
            }while((caractere != 43) && (caractere != 80) && (caractere != 112) && (caractere != 101) && (caractere != 69) && (caractere != 45));

            if (caractere == 80 || caractere == 112){
                read(saldo[READ], &x, sizeof(int));
                printf("-----------------------------\n");
                printf("Print em PID : %d\n", getpid());
                printf("Saldo        : %d UD\n", x);
                printf("-----------------------------\n");
                write(saldo[WRITE], &x, sizeof(int));
            }
            else{
                write(opcao[WRITE], &caractere, sizeof(int));
            }

            if (caractere == 101 ||caractere == 69){
                printf("-----------------------------\n");
                kill(filho1, SIGKILL);
                kill(filho2, SIGKILL);
                kill(getpid(), SIGKILL);
                exit(0);
            }
        }
    }
    else if (filho1 == 0){
        int operacao;
        int x;
        do{
            read(opcao[READ], &operacao, sizeof(int));

            if (operacao == 43){
                printf("-----------------------------\n");
                printf("Soma em PID  : %d\n", getpid());
                printf("-----------------------------\n");
                read(saldo[READ], &x, sizeof(int));
                x += 100;
                write(saldo[WRITE], &x, sizeof(int));
            }
            else{
                write(opcao[WRITE], &operacao, sizeof(int)); 
            }
        }while(operacao != 101 ||operacao != 69 );
    }
    else if (filho2 == 0){
        int operacao;
        int x;
        do{
            read(opcao[READ], &operacao, sizeof(int));

            if(operacao == 45){
                printf("-----------------------------\n");
                printf("Remove em PID: %d\n", getpid());
                printf("-----------------------------\n");
                read(saldo[READ], &x, sizeof(int));
                x -= 100;
                write(saldo[WRITE], &x, sizeof(int));
            }
            else{
                write(opcao[WRITE], &operacao, sizeof(int)); 
            }
        }while(operacao != 101 ||operacao != 69);
    }
    else{}
    
    return 0;
}

void display(){
    printf("\nAperte [+] para somar 100 UD;\n");
    printf("Aperte [-] para subtrair 100 UD;\n");
    printf("Aperte [p] para imprimir o valor do saldo;\n");
    printf("Aperte [e] para finalizar a execucao.\n");
    printf("Aperte [ENTER] para confirmar as operacoes.\n\n");
    printf("O valor inicial de saldo eh: 0\n\n");
}