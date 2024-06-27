#ifndef CLIENTE_H
#define CLIENTE_H

#include "Veiculo.hpp"
#include "Pessoas.hpp"
#include "Servicos.hpp"
#include <vector>


class Cliente : public Pessoas, public Veiculo{
    vector <Servicos*> servicos;
public:
    Cliente (string = "", string = "", string = "", string = "", string = "", string = "", string = "", double = 0);
    ~Cliente ();

    void setServicos(string, bool);
    vector<Servicos*>& getServicos( );
    void imprimeServico();
};

#endif //TP_POO_CLIENTE_H
