#include "Veiculo.hpp"


Veiculo :: Veiculo(string nome, string tipoVeiculo, string placa, double quilometragem) :
                nome(nome), tipoVeiculo(tipoVeiculo), placa(placa), quilometragem(quilometragem) {}

Veiculo :: ~Veiculo() {}

void Veiculo :: setPlaca(string placa){
    this->placa = placa;
}

string  Veiculo :: getPlaca() const{
    return placa;
}

void Veiculo :: setNomeV(string nome){
    this->nome = nome;
}

string Veiculo :: getNomeV() const{
    return nome;
}

void Veiculo :: setTipoVeiculo(string TipoVeiculo){
    this->tipoVeiculo = TipoVeiculo;
}

string Veiculo :: getTipoVeiculo() const{
    return tipoVeiculo;
}

void Veiculo :: setQuilometragem(double quilometragem){
    this->quilometragem = quilometragem;
}

double Veiculo :: getQuilometragem() const{
    return quilometragem;
}
