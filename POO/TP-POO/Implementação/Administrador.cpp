
#include "Administrador.hpp"

// Construtor de Administrador
Administrador :: Administrador(string nome, string cpf, string telefone, string email, string login, string senha) 
                : Pessoas(nome, cpf, telefone, email), Usuarios(login, senha) {}


// Desconstrutor de Administrador
Administrador :: ~Administrador() {}



/* Esta função tem como objetivo mostrar ao usuario opções de funcionalidades que um administrador tem, após a escolha o usuário é encaminhado a funcionalidade
   onde realizará o que deseja.*/
void Administrador :: menuAdm(vector <Mecanico*>&mecanicos, vector <Vendedor*>&vendedores) {
    int opcao;
    do{
    cout << char(201);
    for (int i = 0; i < 24; i++) { cout << char(205);}
    cout << "  ADMINISTRADOR  ";
    for (int i = 0; i < 22; i++) { cout << char(205);}
    cout << char(187) << "\n";

    for(int i = 0; i < 2; i++){
        cout << char(186);
        for (int i = 0; i < 63; i++) { cout << " ";}
        cout << char(186) << "\n";
    }

    cout << char(186) <<"\t\t\tESCOLHA SUA TAREFA:\t\t\t" << char(186) << "\n";

    cout << char(186) <<"\t\t[1] - Adicionar Vendedor\t\t\t" << char(186) << "\n";
    cout << char(186) <<"\t\t[2] - Adicionar Mecanico\t\t\t" << char(186) << "\n";
    cout << char(186) <<"\t\t[3] - Excluir Vendedor       \t\t\t" << char(186) << "\n";
    cout << char(186) <<"\t\t[4] - Excluir Mecanico       \t\t\t" << char(186) << "\n";
    cout << char(186) <<"\t\t[5] - Editar dados de Vendedores\t\t" << char(186) << "\n";
    cout << char(186) <<"\t\t[6] - Editar dados de Mecanicos\t\t\t" << char(186) << "\n";
    cout << char(186) <<"\t\t[7] - Sair\t\t\t\t\t" << char(186) << "\n";


    for(int i = 0; i < 2; i++){
        cout << char(186);
        for (int i = 0; i < 63; i++) { cout << " ";}
        cout << char(186) << "\n";
    }



    cout << char(200);
    for (int i = 0; i < 63; i++) { cout << char(205);}
    cout << char(188) << "\n";


    cin >> opcao;

        switch(opcao){
            case 1: {
                adicionarVendedor(vendedores);
                break;
            }
            case 2: {
                adicionarMecanico(mecanicos);
                break;
            }
            case 3: {
                excluirVendedor(vendedores);
                break;
            }
            case 4: {
                excluirMecanico(mecanicos);
                break;
            }
            case 5: {
                editarDadosVendedor(vendedores);
                break;
            }
            case 6: {
                editarDadosMecanico(mecanicos);
                break;
            }
            case 7: {
                break;
            }
            default:{
                cout << "Opcao invalida!" << endl;
            }
        }

    }while (opcao != 7);

}


// Este método tem como objetivo adicionar um novo vendedor a lista de vendedores passada como parametro da função
void Administrador :: adicionarVendedor(vector<Vendedor*> & vendedores){
    string nome, cpf, telefone, email, login, senha, cargo, data;
    double salario;
    bool disponibilidade;

    cout << "Digite o nome do Vendedor: " << endl;
    cin >> nome;
    cout << "Digite o cpf do Vendedor: " << endl;
    cin >> cpf;
    cout << "Digite o telefone do Vendedor: " << endl;
    cin >> telefone;
    cout << "Digite o e-mail do Vendedor: " << endl;
    cin >> email;
    cout << "Digite o login do Vendedor: " << endl;
    cin >> login;
    cout << "Digite a senha do Vendedor: " << endl;
    cin >> senha;
    cout << "Digite o cargo do Vendedor: " << endl;
    cin >> cargo;
    cout << "Digite o salario do Vendedor: " << endl;
    cin >> salario;
    cout << "Digite a data de admissao do Vendedor: " << endl;
    cin >> data;
    cout << "Digite a disponibilidade do Vendedor: " << endl;
    cin >> disponibilidade;


    // Como o vetor de vendedores é um vector a cada novo vendedor criado temos que aloca-lo dinamicamente para ser encaixado no vetor
    Vendedor *x = new Vendedor(nome, cpf, telefone, email, login, senha, cargo, salario, data, disponibilidade);

    // Aqui o vendedor criado é alocado na última posição do vector de vendedor
    vendedores.push_back(x);
}


// Este método tem como objetivo adicionar um novo mecanico a lista de mecanicos passada como parametro da função
void Administrador :: adicionarMecanico(vector<Mecanico*>& mecanicos){
    string nome, cpf, telefone, email, login, senha, cargo, data;
    double salario;
    bool disponibilidade;

    cout << "Digite o nome do Vendedor: " << endl;
    cin >> nome;
    cout << "Digite o cpf do Vendedor: " << endl;
    cin >> cpf;
    cout << "Digite o telefone do Vendedor: " << endl;
    cin >> telefone;
    cout << "Digite o e-mail do Vendedor: " << endl;
    cin >> email;
    cout << "Digite o login do Vendedor: " << endl;
    cin >> login;
    cout << "Digite a senha do Vendedor: " << endl;
    cin >> senha;
    cout << "Digite o cargo do Vendedor: " << endl;
    cin >> cargo;
    cout << "Digite o salario do Vendedor: " << endl;
    cin >> salario;
    cout << "Digite a data de admissao do Vendedor: " << endl;
    cin >> data;
    cout << "Digite a disponibilidade do Vendedor: " << endl;
    cin >> disponibilidade;

    // Como o vetor de mecanicos é um vector a cada novo mecanico criado temos que aloca-lo dinamicamente para ser encaixado no vetor
    Mecanico *x = new Mecanico(nome, cpf, telefone, email, login, senha, cargo, salario, data, disponibilidade);

    // Aqui o vendedor criado é alocado na última posição do vector de vendedor
    mecanicos.push_back(x);
}



//Este método a altera dados de um vendedor escolhido pelo usuario que está na lista de vendedores adicionados.
void Administrador :: editarDadosVendedor(vector<Vendedor*>& vendedores){

    int indiceFuncionario, indiceDado;
    cout << "Quem voce deseja editar?" << endl;


    //Imprime o nome dos vendedores adicionados
    for(int i = 0; i < vendedores.size(); i++){
        cout << "[" << i << "] -" << vendedores[i]->getNome() << endl;
    }

    //Recebe o lugar no vetor do vendedor que o usuario deseja editar
    cin >> indiceFuncionario;

    do{
        cout << "Qual campo voce deseja editar?" << endl << endl;

        cout << "[1] -" << "Nome" << endl;
        cout << "[2] -" << "CPF" << endl;
        cout << "[3] -" << "Telefone" << endl;
        cout << "[4] -" << "Email" << endl;
        cout << "[5] -" << "Login" << endl;
        cout << "[6] -" << "Senha" << endl;
        cout << "[7] -" << "Cargo" << endl;
        cout << "[8] -" << "Salario" << endl;
        cout << "[9] -" << "Data" << endl;
        cout << "[10] -" << "Disponibilidade" << endl;
        cout << "[11] -" << "Sair" << endl;

        cin >> indiceDado;


        //Chama o método que realiza a atualização no campo em que o usuario deseja mudar
        switch(indiceDado){
            case 1: {
                string nome;
                cout << "Digite o novo nome:" << endl;
                cin >> nome;
                vendedores[indiceFuncionario]->setNome(nome);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 2: {
                string cpf;
                cout << "Digite o novo cpf:" << endl;
                cin >> cpf;
                vendedores[indiceFuncionario]->setCPF(cpf);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 3: {
                string telefone;
                cout << "Digite o novo telefone:" << endl ;
                cin >> telefone;
                vendedores[indiceFuncionario]->setTelefone(telefone);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 4: {
                string email;
                cout << "Digite o novo email:" << endl;
                cin >> email;
                vendedores[indiceFuncionario]->setEmail(email);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 5: {
                string login;
                cout << "Digite o novo login:" << endl;
                cin >> login;
                vendedores[indiceFuncionario]->setNome(login);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 6: {
                string senha;
                cout << "Digite a nova senha:" << endl;
                cin >> senha;
                vendedores[indiceFuncionario]->setSenha(senha);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 7: {
                string cargo;
                cout << "Digite o novo cargo:" << endl;
                cin >> cargo;
                vendedores[indiceFuncionario]->setCargo(cargo);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 8: {
                double salario;
                cout << "Digite o novo salario:" << endl;
                cin >> salario;
                vendedores[indiceFuncionario]->setSalario(salario);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 9: {
                string data;
                cout << "Digite a nova data de admissão:" << endl;
                cin >> data;
                vendedores[indiceFuncionario]->setDataAdmissao(data);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 10: {
                bool disponibilidade;
                cout << "Digite a nova disponibilidade:" << endl;
                cin >> disponibilidade;
                vendedores[indiceFuncionario]->setDisponibilidade(disponibilidade);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 11: {
                break;
            }
            default:{
                cout << "Opcao invalida!" << endl;
            }
        }
    }while (indiceDado != 11);



}


//Este método a altera dados de um mecanico escolhido pelo usuario que está na lista de vendedores adicionados.
void Administrador :: editarDadosMecanico(vector<Mecanico*>& mecanicos){

    int indiceFuncionario, indiceDado;
    cout << "Quem voce deseja editar?" << endl;

    //Imprime o nome dos vendedores adicionados
    for(int i = 0; i < mecanicos.size(); i++){
        cout << "[" << i << "] -" << mecanicos[i]->getNome() << endl;
    }

    //Recebe o lugar no vetor do vendedor que o usuario deseja editar
    cin >> indiceFuncionario;

    do{
        cout << "Qual campo voce deseja editar?" << endl << endl;

        cout << "[1] -" << "Nome" << endl;
        cout << "[2] -" << "CPF" << endl;
        cout << "[3] -" << "Telefone" << endl;
        cout << "[4] -" << "Email" << endl;
        cout << "[5] -" << "Login" << endl;
        cout << "[6] -" << "Senha" << endl;
        cout << "[7] -" << "Cargo" << endl;
        cout << "[8] -" << "Salario" << endl;
        cout << "[9] -" << "Data" << endl;
        cout << "[10] -" << "Disponibilidade" << endl;
        cout << "[11] -" << "Sair" << endl;

        cin >> indiceDado;

        //Chama o método que realiza a atualização no campo em que o usuario deseja mudar
        switch(indiceDado){
            case 1: {
                string nome;
                cout << "Digite o novo nome:" << endl;
                cin >> nome;
                mecanicos[indiceFuncionario]->setNome(nome);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 2: {
                string cpf;
                cout << "Digite o novo cpf:" << endl;
                cin >> cpf;
                mecanicos[indiceFuncionario]->setCPF(cpf);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 3: {
                string telefone;
                cout << "Digite o novo telefone:" << endl;
                cin >> telefone;
                mecanicos[indiceFuncionario]->setTelefone(telefone);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 4: {
                string email;
                cout << "Digite o novo email:" << endl;
                cin >> email;
                mecanicos[indiceFuncionario]->setEmail(email);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 5: {
                string login;
                cout << "Digite o novo login:" << endl;
                cin >> login;
                mecanicos[indiceFuncionario]->setNome(login);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 6: {
                string senha;
                cout << "Digite a nova senha:" << endl;
                cin >> senha;
                mecanicos[indiceFuncionario]->setSenha(senha);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 7: {
                string cargo;
                cout << "Digite o novo cargo:" << endl;
                cin >> cargo;
                mecanicos[indiceFuncionario]->setCargo(cargo);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 8: {
                double salario;
                cout << "Digite o novo salario:" << endl;
                cin >> salario;
                mecanicos[indiceFuncionario]->setSalario(salario);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 9: {
                string data;
                cout << "Digite a nova data de admissão:" << endl;
                cin >> data;
                mecanicos[indiceFuncionario]->setDataAdmissao(data);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 10: {
                bool disponibilidade;
                cout << "Digite a nova disponibilidade:" << endl;
                cin >> disponibilidade;
                mecanicos[indiceFuncionario]->setDisponibilidade(disponibilidade);
                cout << "Dados alterados com sucesso!" << endl << endl;
                break;
            }
            case 11: {
                break;
            }
            default:{
                cout << "Opcao invalida!" << endl;
            }
        }
    }while (indiceDado != 11);
}


/* Esta função recebe os dados, login e senha, e depois compara com a senha e login do administardor da oficina que está no banco de dados, se
 tudo estiver ok o usuario vai para a proxima parte onde abre um menu de opções do administrador.
    Esta função recebe o vetor mecanicos e vendedores por que a função menuAdm usada neste metodo precisa delas*/
void Administrador :: loginAdm(vector <Mecanico*>&mecanicos, vector <Vendedor*>&vendedores) {
    string login, senha;
    bool verificacao = false;

    do {
        cout << "Digite seu login" << endl;
        cin >> login;
        cout << "Digite sua senha" << endl;
        cin >> senha;

        if (login == getLogin() && senha == getSenha()) {
            cout << "Seja bem-vindo " << getNome() << "!" << endl;
            verificacao = true;
            menuAdm(mecanicos, vendedores);
        } else if(login != getLogin() && senha == getSenha()){
            cout << "Login invalido" << endl;
        } else if (login == getLogin() && senha != getSenha()){
            cout << "Senha invalida" << endl;
        } else{
            cout << "Login e senha invalidos" << endl;
        }

    }while (verificacao != true);
}



// Este metodo imprime o nome de um vendedor na tela e pergunta se o usuario deseja remove-lo, caso não ele passa para o próximo vendedor e assim por diante
void Administrador :: excluirVendedor(vector <Vendedor*>& vendedores){

    int op;

    cout << "        " << "Voce deseja excluir qual funcionario? Se quiser sair digite -1" << endl;

    for (int i = 0; i < vendedores.size(); i++ ){
        cout << "[" << i << "] - " << vendedores[i]->getNome() << endl;
    }



    cin >> op;

    if( op != -1){
        vendedores.erase(vendedores.begin() + op);
    }

}


// Este metodo imprime o nome de um mecanico na tela e pergunta se o usuario deseja remove-lo, caso não ele passa para o próximo mecanico e assim por diante
void Administrador :: excluirMecanico(vector <Mecanico*>& mecanicos){

    int op;

    cout << "        " << "Voce deseja excluir qual funcionario? Se quiser sair digite -1" << endl;

    for (int i = 0; i < mecanicos.size(); i++ ){
        cout << "[" << i << "] - " << mecanicos[i]->getNome() << endl;
    }



    cin >> op;

    if( op != -1){
        mecanicos.erase(mecanicos.begin() + op);
    }

}
