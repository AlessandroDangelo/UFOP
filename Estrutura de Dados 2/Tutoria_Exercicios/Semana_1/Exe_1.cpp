#include <iostream>
#include <string>
#include <stdlib.h>
#include <stdio.h>


using namespace std;

struct tipoItem{
    int chave;
    long int preco;
    char titulo[13];
};

struct tipoIndice{
    int posicao;
    int chave;
};

int pesquisa (tipoIndice tabela[125], int, tipoItem*, FILE* );

int main(){

    tipoItem item;
    tipoIndice tabela[125];
    FILE * arquivo_leitura;
    FILE * arquivo_saida_binario;
    int contador = 0, posicao = 0;
    

    if ((arquivo_leitura = fopen("arqSequencial.txt", "r")) == NULL) {
        cout << "Erro na criação do arquivo de texto\n"; 
    }
    if ((arquivo_saida_binario = fopen("arquivo_saida_binario.bin", "wb")) == NULL) {
        cout << "Erro na criação do arquivo binario\n"; 
    }

    while (fscanf(arquivo_leitura,"%d %ld %[A-Z a-z]\n", &item.chave, &item.preco, item.titulo) != EOF) {
        fwrite (&item, sizeof(tipoItem), 1, arquivo_saida_binario);
    }

    fclose(arquivo_leitura);
    fclose(arquivo_saida_binario);

    if ((arquivo_saida_binario = fopen("arquivo_saida_binario.bin", "rb")) == NULL) {
        cout << "Erro na criação do arquivo binario\n"; 
    }

    while (fread(&item, sizeof(tipoItem), 1, arquivo_saida_binario) == 1){
        contador++;
        if (contador % 8 == 1){
            tabela[posicao].chave = item.chave;
            tabela[posicao].posicao = posicao+1;
            posicao++;
        }
    }

    cout << "chave?" << endl;

    cin >> item.chave;

    if(pesquisa (tabela, posicao, &item, arquivo_saida_binario)){
        cout << "Codigo localizado" << endl;
        cout << "Chave " << item.chave << endl;
        cout << "Preco " << item.preco << endl;
    }else{
        cout << "Codigo nao encontrado" << endl;
    }

    fclose(arquivo_saida_binario);

    return 0;
}

int pesquisa (tipoIndice tabela[125], int tamanho, tipoItem* item, FILE* arq){
    tipoItem pagina[8];
    int i, quant_itens;
    long deslocamento;

    i = 0;
    while(i < tamanho && tabela[i].chave <= item->chave){
        i++;
    }

    if (i == 0){
        return 0;
    }

    if(i < tamanho){
        quant_itens = 8; 
    }else{
        fseek (arq, 0, SEEK_END);
        quant_itens = (ftell(arq)/sizeof(tipoItem)) % 8;
        if(quant_itens == 0){
            quant_itens = 8;
        }
    }

    deslocamento = (tabela[i-1].posicao-1) * 8 * sizeof(tipoItem);
    fseek (arq, deslocamento, SEEK_SET);
    fread (&pagina, sizeof(tipoItem), quant_itens, arq);

    for(i = 0; i < quant_itens; i++){
        if (pagina[i].chave == item->chave){
            *item = pagina[i];
            return 1;
        }
    }

    return 0;

}