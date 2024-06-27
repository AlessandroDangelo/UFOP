#ifndef SYSTEM_IMP_H
#define SYSTEM_IMP_H

#include "system.h"
#include "handleBodySemDebug.h"

#include <iostream>
#include <cstdlib>

using namespace std;

class SystemBody : public Body{
    protected:
        string name;
        double value; 
    public:
        SystemBody();
        SystemBody(string n, double v);
        virtual ~SystemBody();
        void setName(string);
        void setValue(double);
        double getValue();
        string getName();
        SystemBody* operator=(SystemBody* system);
};

class SystemHandle : public Handle<SystemBody>, public System {
    public:
        SystemHandle() : Handle(){};
        SystemHandle(string n, double v) : Handle(){
            pImpl_->setName(n);
            pImpl_->setValue(v);
        }
        virtual ~SystemHandle() {};
        void setName(string name){
            pImpl_->setName(name);
        }
        void setValue(double value){
            pImpl_->setValue(value);
        }
        double getValue(){
            return pImpl_->getValue();
        }
        string getName(){
            return pImpl_->getName();
        }
};


#endif