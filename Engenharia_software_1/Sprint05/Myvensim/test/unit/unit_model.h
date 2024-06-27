#ifndef UNIT_MODEL
#define UNIT_MODEL

#include "../../src/include/modelImpl.h"
#include "./unit_flow.h"

#define RESET "\033[0m"  /*!< Escape sequence to reset color output to default. */
#define GREEN "\033[32m" /*!< Escape sequence to a green color output. */

//! Unit tests 
/**
* Creation of the unit tests for the Model class.
*/
class UnitModel{
    public:
        UnitModel(){}
        ~UnitModel(){}
        
        void unit_model_addSystem();
        void unit_model_addFlow();
};

/*!
  Function prototype for the Model class' constructor unit test.
*/
void unit_model_constructor();

/*!
  Function prototype for the Model class' destructor unit test.
*/
void unit_model_destructor();

/*!
  Function prototype for the Model class' method removeSystem() unit test.
*/
void unit_model_removeSystem();

/*!
  Function prototype for the Model class' method removeFlow() unit test.
*/
void unit_model_removeFlow();

/*!
  Function prototype for the Model class' method getName() unit test.
*/
void unit_model_getName();

/*!
  Function prototype for the Model class' method setName() unit test.
*/
void unit_model_setName();

/*!
  Function prototype for the Model class' method getTime() unit test.
*/
void unit_model_getTime();

/*!
  Function prototype for the Model class' method setTime() unit test.
*/
void unit_model_setTime();

/*!
  Function prototype for the Model class' method incrementTime() unit test.
*/
void unit_model_incrementTime();

/*!
  Function prototype for the function that runs all the unit tests of the Model class.
*/
void run_unit_tests_model();

/*!
  Function prototype for the Model class' method getTarget() unit test.
*/
void unit_model_getTarget();

/*!
  Function prototype for the Model class' method setTarget() unit test.
*/
void unit_model_setTarget();

/*!
  Function prototype for the Model class' method clearTarget() unit test.
*/
void unit_model_clearTarget();

/*!
  Function prototype for the Model class' method getsource() unit test.
*/
void unit_model_getSource();

/*!
  Function prototype for the Model class' method setSource() unit test.
*/
void unit_model_setSource();

/*!
  Function prototype for the Model class' method clearSource() unit test.
*/
void unit_model_clearSource();

#endif