
#include "Funcionarios.hpp"


Funcionarios :: Funcionarios(string cargo, double salario, string data, bool disponibilidade)
                            : cargo(cargo), salario(salario), dataAdmissao(data), disponibilidade(disponibilidade) {}
Funcionarios :: ~Funcionarios(){}


void Funcionarios :: setCargo(string cargo){
    this->cargo = cargo;
}
string Funcionarios ::  getCargo() const{
    return cargo;
}
void Funcionarios :: setSalario(double salario){
    this->salario = salario;
}
double Funcionarios :: getSalario() const{
    return salario;
}
void Funcionarios :: setDataAdmissao(string data){
    this->dataAdmissao = data;
}
string Funcionarios :: getDataAdmissao() const{
    return dataAdmissao;
}
void Funcionarios :: setDisponibilidade(bool disponibilidade){
    this->disponibilidade = disponibilidade;
}
bool Funcionarios :: getDisponibilidade()const{
    return disponibilidade;
}