#ifndef VEICULO_H
#define VEICULO_H

#include <iostream>
#include <string>

using namespace std;

class Veiculo{
    string nome;
    string tipoVeiculo;
    string placa;
    double quilometragem;

public:
    Veiculo (string = "", string = "", string = "", double = 0);
    ~Veiculo ();
    void setPlaca(string);
    string getPlaca() const;
    void setNomeV(string);
    string getNomeV() const;
    void setTipoVeiculo(string);
    string getTipoVeiculo() const;
    void setQuilometragem(double);
    double getQuilometragem() const;
};


#endif //TP_POO_VEICULO_H
