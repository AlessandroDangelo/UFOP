#ifndef UNIT_MODEL_H
#define UNIT_MODEL_H

#include "../../src/lib/system_Imp.h"
#include "../../src/lib/system.h"
#include "../../src/lib/flow_Imp.h"
#include "../../src/lib/flow.h"
#include "../../src/lib/model_Imp.h"
#include "../../src/lib/model.h"

#define EXPONENTIAL FlowHandle<Exponential>
#define LOGISTIC  FlowHandle<Logistic>

#include <string>
#include <cstdio>
#include <iostream>
#include <assert.h>

using namespace std;

void unit_Model_constructor(void);
void unit_Model_destructor(void);
void unit_Model_run(void);
void unit_Model_add_System(void);
void unit_Model_add_Flow(void);
void run_unit_test_Model(void);

class Exponential: public FlowBody {
    public:
        Exponential(){}
        ~Exponential() {}
        double run(){
            return getSource()->getValue()*0.01;
        }
};

class Logistic: public FlowBody{
    public:
        Logistic(){}
        ~Logistic() {}
        double run(){
            return getDestination()->getValue()*0.01*(1-(getDestination()->getValue())/70);
        }
};
#endif