
#include "Vendedor.hpp"

// Construtor de Vendedor
Vendedor :: Vendedor(string nome, string cpf, string telefone, string email, string login, string senha,  string cargo, double salario, string data, bool disponibilidade) 
            : Pessoas(nome, cpf, telefone, email), Usuarios(login, senha), Funcionarios(cargo, salario, data, disponibilidade) {}

// Desconstrutor de Vendedor
Vendedor :: ~Vendedor() {}



/* Esta função tem como objetivo mostrar ao usuario opções de funcionalidades que um Vendedor tem, após a escolha o usuário é encaminhado a funcionalidade
   onde realizará o que deseja.*/
void Vendedor :: menuVend(vector <Vendedor*> &vendedores,vector <Cliente*> &clientes) {
    int opcao;

    do {

        cout << char(201);
        for (int i = 0; i < 24; i++) { cout << char(205); }
        cout << "  VENDEDOR  ";
        for (int i = 0; i < 27; i++) { cout << char(205); }
        cout << char(187) << "\n";

        for (int i = 0; i < 2; i++) {
            cout << char(186);
            for (int i = 0; i < 63; i++) { cout << " "; }
            cout << char(186) << "\n";
        }

        cout << char(186) << "\t\t\tESCOLHA A SUA TAREFA:\t\t\t" << char(186) << "\n";

        cout << char(186) << "\t\t[1] - Adicionar Cliente      \t\t\t" << char(186) << "\n";
        cout << char(186) << "\t\t[2] - Gerar ordem de servico\t\t\t" << char(186) << "\n";
        cout << char(186) << "\t\t[3] - Servicos pendentes\t\t\t" << char(186) << "\n";
        cout << char(186) << "\t\t[4] - Fechar Servico    \t\t\t" << char(186) << "\n";
        cout << char(186) << "\t\t[5] - Sair\t\t\t\t\t" << char(186) << "\n";


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
                adicionaCliente(clientes);
                break;
            }
            case 2: {
                geradordemServico(clientes);
                break;
            }
            case 3: {
                imprimeServicosPendentes(clientes);
                break;
            }
            case 4: {
                vizualizarFecharServicosExecutados(clientes);
                break;
            }
            case 5: {
                break;
            }
            default: {
                cout << "Opcao invalida!" << endl;
            }
        }
    }while(opcao != 5);
}


// Este método tem como objetivo adicionar um novo cliente a lista de clientes passada como parametro da função
void Vendedor :: adicionaCliente(vector <Cliente*> &clientes) {
    string nome, cpf, telefone, email, nomeV, tipo, placa;
    cout << "Digite o nome do Cliente: " << endl;
    cin >> nome;
    cout << "Digite o cpf do Cliente: " << endl;
    cin >> cpf;
    cout << "Digite o telefone do Cliente: " << endl;
    cin >> telefone;
    cout << "Digite o e-mail do Cliente: " << endl;
    cin >> email;
    cout << "Digite o nome do Veiculo do Cliente: " << endl;
    cin >> nomeV;
    cout << "Digite o tipo do veiculo do Cliente: " << endl;
    cin >> tipo;
    cout << "Digite a placa do Veiculo do Cliente: " << endl;
    cin >> placa;


    // Variavel criada dinamicamento pois faz parte de um vector da classe Cliente
    Cliente *x = new Cliente(nome, cpf, telefone, email, nomeV, tipo, placa);
    clientes.push_back(x);
}

// Imprime a lista de clientes que estão no vector de Clientes
void Vendedor :: imprimeClientes(vector <Cliente*> & clientes){
    for(int i = 0; i < clientes.size(); i++ ){
        cout << "nome" << clientes[i]->getNome() << endl;
    }
}

//Confere e os dados digitados pelo usuario são iguais a de algum vendedor cadastrado e se a comparação estiver correta
// mostra um menu com opções que um vendedor pode realizar
void Vendedor :: loginVend(vector <Vendedor*> & vendedores, vector <Cliente*> &clientes){
        string login, senha;
        bool verificacao = false;
        do {
            cout << "Digite seu login" << endl;
            cin >> login;
            cout << "Digite sua senha" << endl;
            cin >> senha;

            for (int i = 0; i < vendedores.size(); i++) {
                if (login == vendedores[i]->getLogin() && senha == vendedores[i]->getSenha()) {
                    cout << "Seja bem-vindo " << vendedores[i]->getNome() << "!" << endl;
                    verificacao = true;
                    vendedores[i]->menuVend(vendedores, clientes);
                } else if (login != vendedores[i]->getLogin() && senha == vendedores[i]->getSenha()) {
                    cout << "Login invalido" << endl;
                } else if (login == vendedores[i]->getLogin() && senha != vendedores[i]->getSenha()) {
                    cout << "Senha invalida" << endl;
                } else {
                    cout << "Login e senha invalidos" << endl;
                }
            }

        }while (verificacao != true);
}


//Gera uma ordem de serviço que ainda precisa ser aprovada
void Vendedor :: geradordemServico(vector<Cliente*>& clientes){
    int indiceCliente;
    string descricao;
    bool aprovacao;

    cout << "Qual cliente voce deseja adicionar um servico?" << endl;

    for(int i = 0; i < clientes.size(); i++){
        cout << "[" << i << "] -" << clientes[i]->getNome() << endl;
    }

    cin >> indiceCliente;

    cout << "Qual e o servico?" << endl;

    cin >> descricao;

    clientes[indiceCliente]->setServicos(descricao, 1);

}


//Imprime na tela todos os serviçoes que precisam ser aprovados ainda
void  Vendedor :: imprimeServicosPendentes(vector <Cliente*>& clientes){
    int op;
    for (int i = 0; i < clientes.size(); i++ ){
        for (int j = 0; j < clientes[i]->getServicos().size(); j++){
            if( clientes[i]->getServicos()[j]->getAprovacao() == 1){
                cout << "[" << i << "." << j << "] - " << clientes[i]->getNome() << endl;
                cout << "        " << clientes[i]->getServicos()[j]->getDescricao();
                cout << "        " << "Aguardando aprovacao" << endl;
                cout << "        " << "            Aprovar servico?" << endl;
                cout << "        " << "[1] - SIM" << "        [2] - NAO" << endl;
                cin >> op;
                if(op == 1){
                    clientes[i]->getServicos()[j]->setAprovacao(0);
                    cout << "Servico aprovado com sucesso!" << endl;
                }
            }
        }
    }
}


//Imprime na tela os serviços já executados pelo mecanico e da a opção de fechar/encerrar o serviço
void Vendedor :: vizualizarFecharServicosExecutados(vector <Cliente*>& clientes){
    int op;
    for (int i = 0; i < clientes.size(); i++ ){
        for (int j = 0; j < clientes[i]->getServicos().size(); j++){
            if( clientes[i]->getServicos()[j]->getFeito() == 0){
                cout << "[" << i << "." << j << "] - " << clientes[i]->getNome() << endl;
                cout << "        " << clientes[i]->getServicos()[j]->getDescricao();
                cout << "            " << "Realizar o fechamento?" << endl;
                cout << "        " << "[1] - SIM" << "        [2] - NAO" << endl;
                cin >> op;
                if(op == 1){
                    //Esta linha de código deleta/encerra/fecha o serviço da lista de serviços feitos
                    clientes[i]->getServicos().erase(clientes[i]->getServicos().begin() + j);
                    cout << "Servico fechado com sucesso!" << endl;
                }
            }
        }
    }
}