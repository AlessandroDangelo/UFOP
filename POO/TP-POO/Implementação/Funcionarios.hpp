#ifndef TP_POO_FUNCIONARIOS_H
#define TP_POO_FUNCIONARIOS_H

#include <iostream>
#include "Pessoas.hpp"
#include "Usuarios.hpp"

class Funcionarios {
    string cargo;
    double salario;
    string dataAdmissao;
    bool disponibilidade;
public:

    Funcionarios(string = "", double = 0, string = "", bool = 1);
    ~Funcionarios();

    void setCargo(string);
    string getCargo() const;
    void setSalario(double);
    double getSalario() const;
    void setDataAdmissao(string);
    string getDataAdmissao() const;
    void setDisponibilidade(bool);
    bool getDisponibilidade()const;
};


#endif //TP_POO_FUNCIONARIOS_H
