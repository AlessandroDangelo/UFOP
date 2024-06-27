
#ifndef TP_POO_VENDEDOR_H
#define TP_POO_VENDEDOR_H

#include <iostream>
#include <string>
#include <vector>


#include "Pessoas.hpp"
#include "Usuarios.hpp"
#include "Funcionarios.hpp"
#include "Cliente.hpp"

using namespace std;

class Vendedor : public Pessoas, public Usuarios, public Funcionarios {

public:
    Vendedor (string = "", string = "", string = "", string = "", string = "", string = "", string = "", double = 0, string = "", bool = 1);
    ~Vendedor ();

    void menuVend(vector <Vendedor*> & ,vector <Cliente*> &clientes);
    void adicionaCliente(vector <Cliente*>&);
    void geradordemServico(vector<Cliente*>&);
    void imprimeClientes(vector <Cliente*>&);
    void imprimeServicosPendentes(vector <Cliente*>&);
    void vizualizarFecharServicosExecutados(vector <Cliente*>&);

    void loginVend(vector <Vendedor*> &, vector <Cliente*> &);
};


#endif //TP_POO_VENDEDOR_H
