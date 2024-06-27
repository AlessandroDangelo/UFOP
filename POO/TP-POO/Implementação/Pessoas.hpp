
#ifndef TP_POO_PESSOAS_H
#define TP_POO_PESSOAS_H

#include <iostream>
#include <string>
using namespace std;

class Pessoas{
    string nome;
    string cpf;
    string telefone;
    string email;

public:
    Pessoas(string = "", string = "", string = "", string = "");
    ~Pessoas();

    void setNome(string);
    string getNome() const;

    void setCPF(string);
    string getCPF() const;

    void setTelefone(string);
    string getTelefone() const;

    void setEmail(string);
    string getEmail() const;
};


#endif //TP_POO_PESSOAS_H
