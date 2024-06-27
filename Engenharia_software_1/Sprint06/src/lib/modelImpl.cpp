#include "../include/ModelImpl.h"     
#include "../include/systemImpl.h"     

vector<Model*> ModelBody::models;

Model* Model::createModel(string name, double time){
    return ModelHandle::createModel(name, time);
}

Model* ModelBody::createModel(string name, double time){
    ModelHandle *model = new ModelHandle(name, time);
    add(model);
    return model;
}

ModelBody::systemIterator ModelBody::beginSystems( void ){return systems.begin();}
ModelBody::systemIterator ModelBody::endSystems( void ){return systems.end();}
ModelBody::flowIterator ModelBody::beginFlows( void ){return flows.begin();} 
ModelBody::flowIterator ModelBody::endFlows( void ){return flows.end();}  
ModelBody::modelIterator ModelBody::beginModels(){return models.begin();}
ModelBody::modelIterator ModelBody::endModels(){return models.end();}

ModelBody::ModelBody(string name, double time):name(name), time(time){}

ModelBody::~ModelBody(){           
    // Deletes Flows
    for (Flow* item : flows) {
        delete (item);
    }
    flows.clear();

    // Deletes Systems
    for (System* item : systems) {
        delete (item);
    }
    systems.clear();

    // Deletes Model
    for (auto it = beginModels(); it != endModels(); ++it){
        if (this == (ModelBody*) *it){
            models.erase(it);
            break;
        }
    }
}
    
void ModelBody::execute(double start, double final, double increment){
    
    vector<double> results;
    int count = 0;

    for (double k = start; k < final; k += increment){
        // Executes each flow 'i' in the model
        for (Flow* item : flows) {
            results.push_back(item->execute());
        }

        // Updates the system's values associated with each flow 'i' in the model
        count = 0;
        for (Flow* item : flows) {
            if (item->getSource() != NULL){
                item->getSource()->setValue(item->getSource()->getValue() - results[count]);
            }

            if (item->getTarget() != NULL){
                item->getTarget()->setValue(item->getTarget()->getValue() + results[count]);
            }

            count++;
        }

        // Resetting the results vector
        for (auto i = beginFlows(); i != endFlows(); ++i){
            results.pop_back();
        }

        time += increment;
    }

}

void ModelBody::add(System* sys){
    systems.insert(endSystems(), sys);            
}

void ModelBody::add(Flow* flow){
    flows.insert(endFlows(), flow);       
}

void ModelBody::add(Model* model){
    models.insert(endModels(), model);
}

void ModelBody::remove(System* sys){

    auto i = beginSystems();
    for (System* item : systems){
        if (sys == item){
            systems.erase(i);                    
            break;
        }
        ++i;
    }

}

void ModelBody::remove(Flow* flow){

    auto i = beginFlows();
    for (Flow* item : flows){
        if (flow == item){
            flows.erase(i);                   
            break;
        }
        ++i;
    }

}

void ModelBody::setName(string modelName){
    name = modelName;
}

string ModelBody::getName() const{
    return name;
}    

void ModelBody::setTime(double currentTime){
    time = currentTime;
}

double ModelBody::getTime() const{
    return time;
}    

void ModelBody::incrementTime(double increment) {
    time += increment;
}

System* ModelBody::getSystem(int index){
    return this->systems[index];
}

Flow* ModelBody::getFlow(int index){
    return flows[index];
}

System* ModelBody::createSystem(string name, double value){
    System* s = new SystemHandle(name, value);
    add(s);
    return s;
}

void ModelBody::setTarget(Flow* f, System* s){
    f->setTarget(s);
}

void ModelBody::setSource(Flow* f, System* s){
    f->setSource(s);
}

System* ModelBody::getTarget(Flow* f){
    return f->getTarget();
}

System* ModelBody::getSource(Flow* f){
    return f->getSource();
}

void ModelBody::clearTarget(Flow* f){
    f->clearTarget();
}

void ModelBody::clearSource(Flow* f){
    f->clearSource();
}