#ifndef FUNCTIONAL_TEST
#define FUNCTIONAL_TEST

#include <assert.h>
#include "../../src/include/model.h"
//#include "../../src/flowImpl.h"

#define RESET "\033[0m"  /*!< Escape sequence to reset color output to default. */
#define GREEN "\033[32m" /*!< Escape sequence to a green color output. */

//! Functional tests
/**
* Implementation of the functional tests for the Flow, System and Model classes.
*/

/*!
  Function prototype for exponential model functional test.
*/
void exponentialFuncionalTest();

/*!
  Function prototype for logistical model functional test.
*/
void logisticalFuncionalTest();

/*!
  Function prototype for the complex model functional tests.
*/
void complexFuncionalTest();

//! Class ExponencialFlow
/**
* This Class represents a flow with limitless growth, and is used in the Exponencial Model test.
*/
class ExponencialFlow : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ExponencialFlow Class.
            \param name the name of the ExponencialFlow Class.
            \param source a pointer to the source system of the ExponencialFlow Class.
            \param target a pointer to the target system of the ExponencialFlow Class.
        */
        ExponencialFlow(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the exponencial model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return (0.01 * getSource()->getValue());
            }
            else{
                return 0;
            }
        }
};

//! Class LogisticFlow
/**
* This Class represents a flow with limited growth, and is used in the Logistic Model test.
*/
class LogisticFlow : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the LogisticFlow Class.
            \param name the name of the LogisticFlow Class.
            \param source a pointer to the source system of the LogisticFlow Class.
            \param target a pointer to the target system of the LogisticFlow Class.
        */
        LogisticFlow(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the logistic model.                        
        */
        double execute(){
            if (getTarget() != NULL){
                return 0.01 * getTarget()->getValue() * (1 - getTarget()->getValue() / 70);
            }
            else{
                return 0;
            }
        }
};

//! Class ComplexFlowF
/**
* This Class represents a flow with limitless growth, and is used in the Complex Model test.
*/
class ComplexFlowF : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ComplexFlowF Class.
            \param name the name of the ComplexFlowF Class.
            \param source a pointer to the source system of the ComplexFlowF Class.
            \param target a pointer to the target system of the ComplexFlowF Class.
        */
        ComplexFlowF(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the complex model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return 0.01 * getSource()->getValue();
            }
            else{
                return 0;
            }
        }
};

//! Class ComplexFlowT
/**
*  This Class represents a flow with limitless growth, and is used in the Complex Model test.
*/
class ComplexFlowT : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ComplexFlowT Class.
            \param name the name of the ComplexFlowT Class.
            \param source a pointer to the source system of the ComplexFlowT Class.
            \param target a pointer to the target system of the ComplexFlowT Class.
        */
        ComplexFlowT(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the complex model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return 0.01 * getSource()->getValue();
            }
            else{
                return 0;
            }
        }
};

//! Class ComplexFlowU
/**
* This Class represents a flow with limitless growth, and is used in the Complex Model test.
*/
class ComplexFlowU : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ComplexFlowU Class.
            \param name the name of the ComplexFlowU Class.
            \param source a pointer to the source system of the ComplexFlowU Class.
            \param target a pointer to the target system of the ComplexFlowU Class.
        */
        ComplexFlowU(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }
        
        /*!
            A method created by the user, that contains an equation that will be executed by the complex model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return 0.01 * getSource()->getValue();
            }
            else{
                return 0;
            }
        }
};

//! Class ComplexFlowV
/**
* This Class represents a flow with limitless growth, and is used in the Complex Model test.
*/
class ComplexFlowV : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ComplexFlowV Class.
            \param name the name of the ComplexFlowV Class.
            \param source a pointer to the source system of the ComplexFlowV Class.
            \param target a pointer to the target system of the ComplexFlowV Class.
        */
        ComplexFlowV(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the complex model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return 0.01 * getSource()->getValue();
            }
            else{
                return 0;
            }
        }
};

//! Class ComplexFlowG
/**
* This Class represents a flow with limitless growth, and is used in the Complex Model test.
*/
class ComplexFlowG : public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ComplexFlowG Class.
            \param name the name of the ComplexFlowG Class.
            \param source a pointer to the source system of the ComplexFlowG Class.
            \param target a pointer to the target system of the ComplexFlowG Class.
        */
        ComplexFlowG(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the complex model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return 0.01 * getSource()->getValue();
            }
            else{
                return 0;
            }
        }
};

//! Class ComplexFlowR
/**
* This Class represents a flow with limitless growth, and is used in the Complex Model test.
*/       
class ComplexFlowR: public FlowBody{
    public:
        /*!
            This is a more elaborated constructor for the ComplexFlowR Class.
            \param name the name of the ComplexFlowR Class.
            \param source a pointer to the source system of the ComplexFlowR Class.
            \param target a pointer to the target system of the ComplexFlowR Class.
        */
        ComplexFlowR(string name="", System* source=NULL, System* target=NULL){
            setName(name);
            setSource(source);
            setTarget(target);
        }

        /*!
            A method created by the user, that contains an equation that will be executed by the complex model.                        
        */
        double execute(){
            if (getSource() != NULL){
                return 0.01 * getSource()->getValue();
            }
            else{
                return 0;
            }
        }
};

#endif