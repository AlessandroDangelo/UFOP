#include "model_Imp.h"
#include "system_Imp.h"

//Global Variable
vector<Model*> Model_Imp:: models;

Model_Imp::Model_Imp(){}

Model_Imp::Model_Imp(string id){
    this->id = id;
}

Model_Imp::~Model_Imp(){
    for (auto it = flows.begin(); it != flows.end(); it++) 
        delete *it;
    for (auto it = systems.begin(); it != systems.end(); it++)
        delete *it;
    this->flows.clear();
    this->systems.clear();
    
}

Model* Model::createModel(string id){
    return Model_Imp::createModel(id);
}

Model* Model_Imp::createModel(string id){
    Model* m = new Model_Imp(id);
    models.push_back(m);
    return m;
}

double Model_Imp::run(int start,int finish){
    vector<double> values;
    System* source;
    System* destination;

    int size = flows.size();

    for (int i = start; i < finish; i++){
        for(int j = 0; j < size; j++){
            values.push_back(flows[j]->run());
        }
        for(int k = 0; k < size; k++){
            source = flows[k]->getSource();
            source->setValue(source->getValue() - values[k]);
            destination = flows[k]->getDestination();
            destination->setValue(destination->getValue() + values[k]);
        }
        values.clear();
    }

    return values[finish];
}

System* Model_Imp::createSystem(string name, double value){
    System* s = new System_Imp(name,value);
    this->add(s);
    return s;
}

void Model_Imp::add(System* system){
    this->systems.push_back(system);
}

void Model_Imp::add(Flow* flow){
    this->flows.push_back(flow);
}

System* Model_Imp::getSystem(string name){
    for(vector<System*>::iterator it= systems.begin(); it != systems.end(); it++){
        if(name == (*it)->getName())
            return *it;
    }
    return NULL;
}

vector<Flow*> Model_Imp::getFlows(){
    return this->flows; 
}

Model_Imp* Model_Imp::operator=(Model* model){
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
}
