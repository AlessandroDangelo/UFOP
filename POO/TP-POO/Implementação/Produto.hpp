
#ifndef PRODUTO_H
#define PRODUTO_H

#include <iostream>
#include <string>
using namespace std;

class Produto {
    string nomeProduto;
    double preco;

public:
    Produto (string = "", double = 0.0);
    ~Produto ();
    void setNomeProduto(string);
    string getNomeProduto() const;
    void setPreco(double);
    double getPreco() const;
};



#endif //TP_POO_PRODUTO_H
