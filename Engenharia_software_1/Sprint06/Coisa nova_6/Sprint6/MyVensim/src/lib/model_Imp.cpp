#include "model_Imp.h"
#include "flow_Imp.h"
#include "system_Imp.h"

//Global Variable
vector<Model*> ModelBody:: models;

ModelBody::ModelBody(){}

ModelBody::ModelBody(string id){
    this->id = id;
}

ModelBody::~ModelBody(){
    for (auto it = flows.begin(); it != flows.end(); it++) 
        delete *it;
    for (auto it = systems.begin(); it != systems.end(); it++)
        delete *it;
}

Model* Model::createModel(string id){
    return ModelHandle::createModel(id);
}

double ModelBody::run(int start,int finish){
    vector<double> values;
    System* source;
    System* destination;
    for (int i = start; i < finish; i++){

        int size = flows.size();
        
        for(int j=0; j< size; j++){
            values.push_back(flows[j]->run());
        }
        for(int k=0; k < size; k++){
            source = flows[k]->getSource();
            source->setValue(source->getValue() - values[k]);
            destination = flows[k]->getDestination();
            destination->setValue(destination->getValue() + values[k]);
        }
        values.clear();
    }
    return values[finish];
}

System* ModelBody::createSystem(string name, double value){
    System* s = new SystemHandle(name,value);
    this->add(s);
    return s;
}

void ModelBody::add(System* system){
    this->systems.push_back(system);
}

void ModelBody::add(Flow* flow){
    this->flows.push_back(flow);
}

void ModelBody::add(Model* model) {
    this->models.push_back(model);
}

System* ModelBody::getSystem(string name){
    for(vector<System*>::iterator it= systems.begin(); it != systems.end(); it++){
        if(name == (*it)->getName())
            return *it;
    }
    return NULL;
}

vector<Flow*> ModelBody::getFlows(){
    return this->flows; 
}

string ModelBody::getId(){
    return this->id;
}

void ModelBody::setId(string id){
    this->id = id;
}
/*
ModelBody* ModelBody::operator=(Model* model){
    if(this == model)
        return this;

    for(vector<System*>::iterator it= systems.begin(); it != systems.end(); it++){
        delete *it;
    }

    this->systems.clear();

    for(vector<Flow*>::iterator it= flows.begin(); it != flows.end(); it++){
        delete *it;
    }

    this->flows.clear();
    
    return this;
}*/
