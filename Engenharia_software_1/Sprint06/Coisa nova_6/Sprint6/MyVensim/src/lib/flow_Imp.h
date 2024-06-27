#ifndef FLOW_IMP_H
#define FLOW_IMP_H

#include "system.h"
#include "flow.h"
#include "handleBodySemDebug.h"

#include <iostream>
#include <cstdlib>

class FlowBody : public Body{
    protected:
        System* source; 
        System* destination; 
    public:
        FlowBody();
        FlowBody(System*, System*);
        virtual ~FlowBody();
        void setSources(System*);
        void setDestination(System*);
        System* getSource();
        System* getDestination();
        virtual double run() = 0;
        FlowBody* operator=(FlowBody*);
};

template<typename T>
class FlowHandle : public Handle<T>, public Flow{
    public:
        FlowHandle<T>():Handle<T>(){};
        virtual ~FlowHandle() {};
        void setSources(System* source){
            this->pImpl_->setSources(source);
        }
        void setDestination(System* destination){
            this->pImpl_->setDestination(destination);
        }
        System* getSource(){
            return this->pImpl_->getSource();
        }
        System* getDestination(){
            return this->pImpl_->getDestination();
        }
        virtual double run(){
            return this->pImpl_->run();
        }
};

#endif