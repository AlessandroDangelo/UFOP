#include "system_Imp.h"

SystemBody::SystemBody(){};

SystemBody::~SystemBody(){};

SystemBody::SystemBody(string n, double v){
    this->name = n;
    this->value = v;
}

void SystemBody::setName(string name){
    this->name = name;
}

void SystemBody::setValue(double value){
    this->value = value;
}

string SystemBody::getName(){
    return this->name;
}

double SystemBody::getValue(){
    return this->value;
}

SystemBody* SystemBody::operator=(SystemBody* system){
    if (this == system)
        return this;
    this->name = system->getName();
    this->value = system->getValue();
    return this;
}