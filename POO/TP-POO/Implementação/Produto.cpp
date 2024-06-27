#include "Produto.hpp"


Produto :: Produto (string nome, double preco) : nomeProduto(nome), preco(preco) {}

Produto :: ~Produto() {}

void Produto :: setNomeProduto(string nome){
    this->nomeProduto = nome;
}
string Produto :: getNomeProduto() const{
    return nomeProduto;
}
void Produto :: setPreco(double preco){
    this->preco = preco;
}
double Produto :: getPreco() const{
    return preco;
}
