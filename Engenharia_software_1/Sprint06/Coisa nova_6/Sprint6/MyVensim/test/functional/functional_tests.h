#ifndef FUNCTIONAL_TESTS_H
#define FUNCTIONAL_TESTS_H
#include "../../src/lib/model.h"
#include "../../src/lib/flow.h"
#include "../../src/lib/system.h"
#include "../../src/lib/flow_Imp.h"

#define EXPONENTIAL FlowHandle<Exponential>
#define LOGISTIC  FlowHandle<Logistic>

#include <iostream>
#include <cstdlib>
#include <assert.h>
#include <math.h>


/**
* @brief Arquivo responsável pelos testes funcional.
*
* @author Ananda Mendes 2021.
*/
using namespace std;

    /**
     * @brief Exponential functional test
     * 
     */
    void exponentialFuncionalTest();

    /**
     * @brief Logistics functional test
     * 
     */
    void logisticalFuncionalTest();

    /**
     * @brief Complex functional test
     * 
     */
    void complexFuncionalTest();

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