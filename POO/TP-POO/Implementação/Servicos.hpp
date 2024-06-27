
#ifndef TP_POO_SERVICOS_H
#define TP_POO_SERVICOS_H

#include <iostream>
#include <string>
#include <vector>
#include "Produto.hpp"

using namespace std;


class Servicos{
    string descricao;
    bool aprovacao;
    bool feito;
    double custo;
    double maodeobra;
    vector <Produto*> produtos;
public:

    Servicos (string = "", bool = 1, bool = 1, double = 0, double = 0);
    ~Servicos();

    void setDescricao(string);
    string getDescricao() const;
    void setAprovacao(bool);
    bool getAprovacao() const;
    void setFeito(bool);
    bool getFeito() const;
    void setCusto(double);
    double getCusto() const;
    void setMaodeobra(double);
    double getMaodeobra() const;
    void setProdutos(string, double);
    vector<Produto*>& getProdutos( );
};


#endif //TP_POO_SERVICOS_H
