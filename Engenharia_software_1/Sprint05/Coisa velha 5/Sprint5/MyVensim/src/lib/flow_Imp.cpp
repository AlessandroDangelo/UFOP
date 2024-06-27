#include "flow_Imp.h"

Flow_Imp::Flow_Imp(){}

Flow_Imp::Flow_Imp(System* source, System* destination){
    this-> source = source;
    this->destination = destination;
}

Flow_Imp::~Flow_Imp(){}

void Flow_Imp::setSources(System* source){
    this->source = source;
}

void Flow_Imp::setDestination(System* destination){
    this->destination = destination;
}

System* Flow_Imp::getSource(){
    return this->source;
}

System* Flow_Imp::getDestination(){
    return this->destination;
}

Flow_Imp* Flow_Imp::operator=(Flow* flow){
    if (this == flow)
        return this;
        
    this->source = flow->getSource();
    this->destination = flow->getSource();
    return this;
}
