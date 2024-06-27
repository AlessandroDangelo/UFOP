#ifndef USUARIOS_H
#define USUARIOS_H

#include <iostream>
#include <string>

using namespace std;

class Usuarios {
    string login;
    string senha;

public:
    Usuarios (string = "", string = "");
    ~Usuarios();

    void setLogin(string);
    string getLogin();
    void setSenha(string);
    string getSenha();
};


#endif //USUARIOS_H
