#include "system_Imp.h"

System_Imp::System_Imp(){}

System_Imp::System_Imp(string name, double value){
    this->name = name;
    this->value = value;
}

System_Imp::~System_Imp(){}

void System_Imp::setName(string name){
    this->name = name;
}

void System_Imp::setValue(double value){
    this->value = value;
}

string System_Imp::getName(){
    return this->name;
}

double System_Imp::getValue(){
    return this->value;
}

System_Imp* System_Imp::operator=(System* system){
    if (this == system)
        return this;
    this->name = system->getName();
    this->value = system->getValue();
    return this;
}