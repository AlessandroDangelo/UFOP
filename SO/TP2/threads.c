#include <stdlib.h>
#include <stdio.h>
#include <pthread.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/syscall.h>

#define N_THREADS 3

pthread_t threads[N_THREADS];
int saldo = 0;
int flag = 0;

void *thread_func_1(void *arg); // IMPRIME
void *thread_func_2(void *arg); // SOMA
void *thread_func_3(void *arg); // SUBTRAÇÃO

int main(int argc, char **argv) {
    int i;
    int opcao = 0;
    int contagem = 0;
    
    while(contagem != 999){
        pthread_join(threads[1], NULL);
        pthread_create(&(threads[1]), NULL, thread_func_2, NULL);
        contagem+=1;
    }
    contagem = 0;
    while(contagem != 999){
        pthread_join(threads[2], NULL);
        pthread_create(&(threads[2]), NULL, thread_func_3, NULL);
        contagem+=1;
    }
    
    pthread_join(threads[0], NULL);
    pthread_join(threads[1], NULL);
    pthread_join(threads[2], NULL);
    pthread_create(&(threads[0]), NULL, thread_func_1, NULL);
    
    printf("\nAperte [+] para somar 100 UD;\n");
    printf("Aperte [-] para subtrair 100 UD;\n");
    printf("Aperte [.] para imprimir o valor do saldo;\n");
    printf("Aperte [s] para destuir todos os threads e finalizar a execucao.\n");
    printf("Aperte [ENTER] para confirmar as operacoes.\n\n");
    printf("O valor inicial de saldo eh: %d\n\n",saldo);

    while(opcao != 83 && opcao != 115){ // SAIR
        opcao = (int)getchar();

        if (opcao == 46){ // IMPRIME
            pthread_join(threads[0], NULL);
            pthread_join(threads[1], NULL);
            pthread_join(threads[2], NULL);
            pthread_create(&(threads[0]), NULL, thread_func_1, NULL);
        }
        else if (opcao == 43){ // SOMA
            pthread_join(threads[1], NULL);
            pthread_create(&(threads[1]), NULL, thread_func_2, NULL);
        }
        else if (opcao == 45){ // SUBTRAI
            pthread_join(threads[2], NULL);
            pthread_create(&(threads[2]), NULL, thread_func_3, NULL);
        }
        else if (opcao == 83 || opcao == 115){
            pthread_kill(threads[0], 0);
            pthread_kill(threads[1], 0);
            pthread_kill(threads[2], 0);

            printf("------------------------------\n");
            printf("KILLED\n");
            printf("------------------------------\n");
        }
        else{
            continue;
        }
    }

    return 0;
}

void *thread_func_1(void *arg) { 
    pid_t tid;
    tid = syscall(__NR_gettid);
    printf("------------------------------\n");
    printf("TID: %d\n",tid);
    printf("Saldo: %d\n", saldo);
    printf("------------------------------\n");
    pthread_exit(0);
}

void *thread_func_2(void *arg) { 
    pid_t tid;
    tid = syscall(__NR_gettid);
    printf("------------------------------\n");
    printf("TID: %d\n",tid);
    saldo += 100;
    printf("------------------------------\n");
    pthread_exit(0);
}

void *thread_func_3(void *arg) { 
    pid_t tid;
    tid = syscall(__NR_gettid);
    printf("------------------------------\n");
    printf("TID: %d\n",tid);
    saldo -= 100;
    printf("------------------------------\n");
    pthread_exit(0);
}