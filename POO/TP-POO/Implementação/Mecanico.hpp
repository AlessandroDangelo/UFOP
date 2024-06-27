
#ifndef TP_POO_MECANICO_H
#define TP_POO_MECANICO_H

#include <iostream>
#include <string>
#include <vector>


#include "Pessoas.hpp"
#include "Usuarios.hpp"
#include "Funcionarios.hpp"
#include "Cliente.hpp"

using namespace std;

class Mecanico : public Pessoas, public Usuarios, public Funcionarios {

public:
    Mecanico (string = "Alessandro D'Angelo", string = "23651514854", string = "16981097848", string = "alessandrodangelo2008@hotmail.com", string = "AleDangelo", string = "123", string = "", double = 0, string = "", bool = 1);
    ~Mecanico ();

    void menuMec(vector <Mecanico*>&, vector <Cliente*> &clientes);

    void imprimeOrdemServicoAprovado(vector <Cliente*>&);
    void cadastroServicoExecutado(vector <Cliente*>&);

    void loginMec(vector <Mecanico*>&,vector <Cliente*> &);

    /* Metodos envolvendo editar e adicionar dados de funcionarios: */

};

#endif //TP_POO_MECANICO_H
