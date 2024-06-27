#include "Cliente.hpp"

// Construtor de Cliente
Cliente :: Cliente(string nome, string cpf, string telefone, string email, string nomeVeiculo, string tipoVeiculo, string placa, double quilometragem) :
            Pessoas(nome, cpf, telefone, email),  Veiculo(nomeVeiculo, tipoVeiculo, placa, quilometragem) {}

// Desconstrutor de Cliente
Cliente :: ~Cliente() {}

/* Este metodo altera os dados de um serviço da lista que está incluida em um cliente qualquer,
ele precisa ser criado dinamicamente pois é um vector, o push_back o aloca depois da última posição ocupada no vector*/
void Cliente :: setServicos(string descricao, bool aprovacao){
    Servicos *x = new Servicos(descricao, aprovacao, 1, 0, 0);
    this->servicos.push_back(x);
}

//Retorna o endereço do vector de serviços para ser utilizado em outro arquivo
vector<Servicos*>& Cliente :: getServicos(){
    return servicos;
}


// imprime a lista de serviços de um cliente
void Cliente :: imprimeServico(){
    for (int i = 0; i < this->servicos.size(); i++){
        cout << this->servicos[i]->getDescricao() << endl;
        cout << this->servicos[i]->getAprovacao() << endl;
    }
}