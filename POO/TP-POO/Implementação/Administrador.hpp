

#ifndef ADMINISTRADOR_H
#define ADMINISTRADOR_H

#include <iostream>
#include <string>
#include <vector>

#include "Pessoas.hpp"
#include "Usuarios.hpp"
#include "Vendedor.hpp"
#include "Mecanico.hpp"
#include "Funcionarios.hpp"

using namespace std;

class Administrador : public Pessoas, public Usuarios {


public:
    Administrador (string = "Alessandro D'Angelo", string = "23-651514854", string = "1698109-7848", string = "alessandrodangelo2008@hotmail.com", string = "AleDangelo", string = "123");
    ~Administrador ();

    void menuAdm(vector <Mecanico*>&, vector <Vendedor*>&);

    void adicionarVendedor(vector<Vendedor*>&);
    void adicionarMecanico(vector<Mecanico*>&);
    void editarDadosVendedor(vector<Vendedor*>&);
    void editarDadosMecanico(vector<Mecanico*>&);
    void excluirVendedor(vector <Vendedor*>& );
    void excluirMecanico(vector <Mecanico*>& );
    void loginAdm(vector <Mecanico*>&, vector <Vendedor*>&);


    /* Metodos envolvendo editar e adicionar dados de funcionarios: */

};


#endif //ADMINISTRADOR_H
