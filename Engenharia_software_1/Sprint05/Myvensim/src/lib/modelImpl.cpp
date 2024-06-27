#include "../include/modelImpl.h"     
#include "../include/systemImpl.h"     

int ModelImpl::qntd = 0;

Model* Model::createModel(string name, double time){
    return ModelImpl::createModel(name, time);
}

Model* ModelImpl::createModel(string name, double time){
    if (ModelImpl::qntd == 0){
        ModelImpl::qntd++;
        Model* m = new ModelImpl(name, time);
        return m;
    }
    else{
        cout << "Não é possível criar outro Model! :)" << endl;
        return NULL;
    }
}

ModelImpl::ModelImpl (const ModelImpl& model){}

void ModelImpl::operator=(const ModelImpl& model){}

ModelImpl::systemIterator ModelImpl::beginSystems( void ){return systems.begin();}
ModelImpl::systemIterator ModelImpl::endSystems( void ){return systems.end();}
ModelImpl::flowIterator ModelImpl::beginFlows( void ){return flows.begin();} 
ModelImpl::flowIterator ModelImpl::endFlows( void ){return flows.end();}

ModelImpl::ModelImpl(string name, double time):name(name), time(time){}

ModelImpl::~ModelImpl(){           
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

    ModelImpl::qntd--;

}
    
void ModelImpl::execute(double start, double final, double increment){
    
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

void ModelImpl::add(System* sys){
    systems.insert(endSystems(), sys);            
}

void ModelImpl::add(Flow* flow){
    flows.insert(endFlows(), flow);       
}

void ModelImpl::remove(System* sys){

    auto i = beginSystems();
    for (System* item : systems){
        if (sys == item){
            systems.erase(i);                    
            break;
        }
        ++i;
    }

}

void ModelImpl::remove(Flow* flow){

    auto i = beginFlows();
    for (Flow* item : flows){
        if (flow == item){
            flows.erase(i);                   
            break;
        }
        ++i;
    }

}

void ModelImpl::setName(string modelName){
    name = modelName;
}

string ModelImpl::getName() const{
    return name;
}    

void ModelImpl::setTime(double currentTime){
    time = currentTime;
}

double ModelImpl::getTime() const{
    return time;
}    

void ModelImpl::incrementTime(double increment) {
    time += increment;
}

System* ModelImpl::getSystem(int index){
    return this->systems[index];
}

Flow* ModelImpl::getFlow(int index){
    return flows[index];
}

System* ModelImpl::createSystem(string name, double value){
    System* s = new SystemImpl(name, value);
    add(s);
    return s;
}

void ModelImpl::setTarget(Flow* f, System* s){
    f->setTarget(s);
}

void ModelImpl::setSource(Flow* f, System* s){
    f->setSource(s);
}

System* ModelImpl::getTarget(Flow* f){
    return f->getTarget();
}

System* ModelImpl::getSource(Flow* f){
    return f->getSource();
}

void ModelImpl::clearTarget(Flow* f){
    f->clearTarget();
}

void ModelImpl::clearSource(Flow* f){
    f->clearSource();
}