
#include "Mecanico.hpp"


Mecanico :: Mecanico(string nome, string cpf, string telefone, string email, string login, string senha, string cargo, double salario, string data, bool disponibilidade) 
            : Pessoas(nome, cpf, telefone, email), Usuarios(login, senha), Funcionarios(cargo, salario, data, disponibilidade) {}

Mecanico :: ~Mecanico() {}


/* Esta função tem como objetivo mostrar ao usuario opções de funcionalidades que um Mecanico tem, após a escolha o usuário é encaminhado a funcionalidade
   onde realizará o que deseja.*/
void Mecanico :: menuMec(vector <Mecanico*>&mecanico,vector <Cliente*> &clientes) {
    int opcao;

    do{

        cout << char(201);
        for (int i = 0; i < 24; i++) { cout << char(205); }
        cout << "  MECANICO  ";
        for (int i = 0; i < 27; i++) { cout << char(205); }
        cout << char(187) << "\n";

        for (int i = 0; i < 2; i++) {
            cout << char(186);
            for (int i = 0; i < 63; i++) { cout << " "; }
            cout << char(186) << "\n";
        }

        cout << char(186) << "\t\t\tESCOLHA SUA TAREFA:\t\t\t" << char(186) << "\n";

        cout << char(186) << "\t[1] - Vizualizar ordens de servico abertas \t\t" << char(186) << "\n";
        cout << char(186) << "\t[2] - Cadastrar servicos executas e pecas utilizadas    " << char(186) << "\n";
        cout << char(186) << "\t[3] - Sair \t\t\t\t\t\t" << char(186) << "\n";


        for (int i = 0; i < 2; i++) {
            cout << char(186);
            for (int i = 0; i < 63; i++) { cout << " "; }
            cout << char(186) << "\n";
        }


        cout << char(200);
        for (int i = 0; i < 63; i++) { cout << char(205); }
        cout << char(188) << "\n";


        cin >> opcao;

        switch (opcao) {
            case 1: {
                imprimeOrdemServicoAprovado(clientes);
                break;
            }
            case 2: {
                cadastroServicoExecutado(clientes);
                break;
            }
            case 3: {
                break;
            }
            default: {
                cout << "Opcao invalida!" << endl;
            }
         }

    }while(opcao != 3);

}


/*Confere e os dados digitados pelo usuario são iguais a de algum mecanico cadastrado e se a comparação estiver correta
mostra um menu com opções que um mecanico pode realizar*/
void Mecanico :: loginMec(vector <Mecanico*> & mecanicos, vector <Cliente*> &clientes) {
    string login, senha;
    bool verificacao = false;
    do {
        cout << "Digite seu login" << endl;
        cin >> login;
        cout << "Digite sua senha" << endl;
        cin >> senha;

        for (int i = 0; i < mecanicos.size(); i++) {
            if (login == mecanicos[i]->getLogin() && senha == mecanicos[i]->getSenha()) {
                cout << "Seja bem-vindo " << mecanicos[i]->getNome() << "!" << endl;
                verificacao = true;
                mecanicos[i]->menuMec(mecanicos, clientes);
            } else if (login != mecanicos[i]->getLogin() && senha == mecanicos[i]->getSenha()) {
                cout << "Login invalido" << endl;
            } else if (login == mecanicos[i]->getLogin() && senha != mecanicos[i]->getSenha()) {
                cout << "Senha invalida" << endl;
            } else {
                cout << "Login e senha invalidos" << endl;
            }
        }

    }while (verificacao != true);
}


// Imprime os serviços aprovados por um vendedor
void Mecanico :: imprimeOrdemServicoAprovado(vector <Cliente*>& clientes){
    int op;
    for (int i = 0; i < clientes.size(); i++ ){
        for (int j = 0; j < clientes[i]->getServicos().size(); j++){
            if( clientes[i]->getServicos()[j]->getAprovacao() == 0){
                cout << "[" << i << "." << j << "] - " << clientes[i]->getNome() << endl;
                cout << "        " << clientes[i]->getServicos()[j]->getDescricao();
            }
        }
    }
}


/*O mecanico após ter feito um serviço ele cadastra o serviço feito com todos os custos e com o valor final para que o vendedor possa
 * fechar/encerrar depois*/
void Mecanico :: cadastroServicoExecutado(vector <Cliente*>& clientes){

    int op, opcao, qtdpecas;
    double soma = 0, custo, maodeobra, somapecas, valorpeca;
    string nomepeca;


    for (int i = 0; i < clientes.size(); i++ ){
        for (int j = 0; j < clientes[i]->getServicos().size(); j++){
            if( clientes[i]->getServicos()[j]->getAprovacao() == 0){
                cout << "[" << i << "." << j << "] - " << clientes[i]->getNome() << " - ";
                cout << "servico: " << clientes[i]->getServicos()[j]->getDescricao() << endl;
                cout << "        " << "atualizar este servico como feito?" << endl;
                cout << "        " << "[1] - SIM" << "        [2] - NAO" << endl;
                cin >> op;
                if(op == 1){
                    clientes[i]->getServicos()[j]->setFeito(0);

                    cout << "Digite o custo desse servico." << endl;
                    cin >> custo;
                    clientes[i]->getServicos()[j]->setCusto(custo);
                    cout << "Digite o custo da mao de obra" << endl;
                    cin >> maodeobra;
                    clientes[i]->getServicos()[j]->setMaodeobra(maodeobra);

                    cout << "Alguma peca foi utilizada nesse servico?" << endl;
                    cout << "[1] SIM" << endl;
                    cout << "[2] NAO" << endl;
                    cin >> opcao;

                    if(opcao == 1) {
                        cout << "Quantas pecas foram utilizadas no servico?" << endl;
                        cin >> qtdpecas;
                        for (int k = 0; k < qtdpecas; k++){
                            cout << "Digite o nome da peca " << k << endl;
                            cin >> nomepeca;

                            cout << "Digite o valor da peca " << k << endl;
                            cin >> valorpeca;

                            clientes[i]->getServicos()[j]->setProdutos(nomepeca, valorpeca);
                        }
                    }

                    cout << "Servico atualizado!" << endl;
                }
            }
        }
    }

}