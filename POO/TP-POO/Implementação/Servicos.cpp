#include "Servicos.hpp"


Servicos :: Servicos(string descricao, bool aprovacao, bool feito, double custo, double maodeobra) : descricao(descricao), aprovacao(aprovacao), feito(feito), custo(custo), maodeobra(maodeobra){}

Servicos :: ~Servicos(){}

void Servicos ::setDescricao(string descricao){
    this->descricao = descricao;
}

string Servicos :: getDescricao()const{
    return descricao;
}

void Servicos ::setAprovacao(bool aprovacao){
    this->aprovacao = aprovacao;
}

bool Servicos :: getAprovacao() const{
    return aprovacao;
}

void Servicos ::setFeito(bool feito){
    this->feito = feito;
}

bool Servicos :: getFeito() const{
    return feito;
}

void Servicos ::setCusto(double custo){
    this->custo = custo;
}

double Servicos :: getCusto() const{
    return custo;
}

void Servicos ::setMaodeobra(double maodeobra){
    this->maodeobra = maodeobra;
}

double Servicos ::getMaodeobra() const{
    return maodeobra;
}


// Atualiza os dados de um produto e o retorna acrescentando na ultima posição do vector de produtos dentro de serviço.
void Servicos ::  setProdutos(string nomeProduto, double preco){
    Produto *x = new Produto(nomeProduto, preco);
    this->produtos.push_back(x);
}

//Retorna o endereço do vector de proutos para que o vector possa ser utilizado em qualquer arquivo do código.
vector<Produto*>& Servicos :: getProdutos( ){
    return produtos;
}