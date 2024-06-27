

#include "Pessoas.hpp"


Pessoas :: Pessoas(string nome, string cpf, string telefone, string email) :
        nome(nome), cpf(cpf), telefone(telefone), email(email) {}
        
Pessoas :: ~Pessoas() {}

void Pessoas :: setNome(string nome){
    this->nome = nome;
}
string Pessoas :: getNome() const {
    return nome;
}

void Pessoas :: setCPF(string cpf) {
    this->cpf = cpf;
}
string Pessoas :: getCPF() const {
    return cpf;
}

void Pessoas :: setTelefone(string telefone) {
    this->telefone = telefone;
}
string Pessoas :: getTelefone() const {
    return telefone;
}

void Pessoas :: setEmail(string email) {
    this->email = email;
}
