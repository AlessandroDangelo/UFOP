#include "flow_Imp.h"

FlowBody::FlowBody(){}

FlowBody::FlowBody(System* source, System* destination){
    this-> source = source;
    this->destination = destination;
}

FlowBody::~FlowBody(){}

void FlowBody::setSources(System* source){
    this->source = source;
}

void FlowBody::setDestination(System* destination){
    this->destination = destination;
}

System* FlowBody::getSource(){
    return this->source;
}

System* FlowBody::getDestination(){
    return this->destination;
}

FlowBody* FlowBody::operator=(FlowBody* flow){
    if (this == flow)
        return this;
        
    this->source = flow->getSource();
    this->destination = flow->getSource();
    return this;
}
