
#include "Usuarios.hpp"

Usuarios :: Usuarios(string login, string senha) 
            : login(login), senha(senha) {}
Usuarios :: ~Usuarios() {}

void Usuarios :: setLogin(string login){
    this->login = login;
}
string Usuarios :: getLogin(){
    return login;
}

void Usuarios :: setSenha(string senha){
    this->senha = senha;
}
string Usuarios :: getSenha(){
    return senha;
}