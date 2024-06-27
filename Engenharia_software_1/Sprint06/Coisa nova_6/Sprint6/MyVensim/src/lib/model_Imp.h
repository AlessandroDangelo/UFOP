#ifndef MODEL_IMP_H
#define MODEL_IMP_H

#include "model.h"
#include "flow.h"
#include "system.h"
#include "handleBodySemDebug.h"

#include <iostream>
#include <cstring>
#include <cstdlib>
#include <vector>

using namespace std;

class ModelBody : public Body{
    protected:
        vector<Flow*> flows; 
        vector<System*> systems; 
        static vector<Model*> models;
        string id;
    public:
        ModelBody();
        ModelBody(string);
        virtual ~ModelBody();
        static Model* createModel(string);
        double run(int,int);
        System* createSystem(string,double);
        System* getSystem(string name);
        vector<Flow*> getFlows();
        string getId();
        void setId(string);
        void add(System*);
        void add(Flow*);
        void add(Model* model);
};

class ModelHandle : public Handle<ModelBody>, public Model{
    public:
        ModelHandle() : Handle() {}
        virtual ~ModelHandle() {}
        static Model* createModel(string id){
            ModelHandle* m = new ModelHandle();
            m->setId(id);
            m->pImpl_->add(m);
            return m;
        }
        double run(int start,int finish){
            return pImpl_->run(start, finish);
        }
        System* createSystem(string name,double value){
            return pImpl_->createSystem(name, value);
        }
        System* getSystem(string name){
            return pImpl_->getSystem(name);
        }
        vector<Flow*> getFlows(){
            return pImpl_->getFlows();
        }
        string getId(){
            return pImpl_->getId();
        }
        void setId(string id){
            pImpl_->setId(id);
        }
        void add(System* system){
            pImpl_->add(system);
        }
        void add(Flow* flow){
            pImpl_->add(flow);
        }
        void add(Model* model) {
            pImpl_->add(model);
        }
};

#endif