#include <assert.h>

#include "funcional_tests.h" 

using namespace std;

// Function for exponential functional test.
void exponentialFuncionalTest(){
    cout << "TEST 1 - Simple model with exponential equation" << endl;

    // Create model
    Model* exponencialModel = Model::createModel("Exponential Model", 0.0);
    System* sys1 = exponencialModel->createSystem("Population 1", 100.0);
    System* sys2 = exponencialModel->createSystem("Population 2", 0.0);
    Flow* exponencialFlow = exponencialModel->createFlow<ExponencialFlow>("Unlimited Growth", sys1, sys2);

    //Making assertions for the unit test before execution
    assert(sys1->getName() == "Population 1");
    assert(sys2->getName() == "Population 2");
    assert(exponencialFlow->getName() == "Unlimited Growth");
    assert(exponencialModel->getName() == "Exponential Model");

    assert(abs(sys1->getValue() - 100.0) < 0.0001);
    assert(abs(sys2->getValue() - 0.0) < 0.0001);
    assert(abs(exponencialModel->getTime() - 0.0) < 0.0001);

    //Executes the model
    exponencialModel->execute(0, 100, 1);

    //Making assertions for the unit test after execution
    assert(abs(sys1->getValue() - 36.6032) < 0.0001);
    assert(abs(sys2->getValue() - 63.3968) < 0.0001);
    assert(abs(exponencialModel->getTime() - 100.0) < 0.0001);

    delete (exponencialModel);
    cout << GREEN << "OK!"<< RESET << endl;
}

// Function for logistical functional test.
void logisticalFuncionalTest(){
    cout << "TEST 2 - Simple model with logistic equation" << endl;

    // Create model
    Model* logisticalModel = Model::createModel("Logistic Model", 0.0);
    System* sys1 = logisticalModel->createSystem("Population 1", 100.0);
    System* sys2 = logisticalModel->createSystem("Population 2", 10.0);
    Flow* logisticalFlow = logisticalModel->createFlow<LogisticFlow>("Logistic flow", sys1, sys2);

    //Making assertions for the unit test before execution
    assert(sys1->getName() == "Population 1");
    assert(sys2->getName() == "Population 2");    
    assert(logisticalFlow->getName() == "Logistic flow");
    assert(logisticalModel->getName() == "Logistic Model");

    assert(abs(sys1->getValue() - 100.0) < 0.0001);
    assert(abs(sys2->getValue() - 10.0) < 0.0001);
    assert(abs(logisticalModel->getTime() - 0.0) < 0.0001);   

    //Executes the model
    logisticalModel->execute(0, 100, 1);

    //Making assertions for the unit test after execution
    assert(abs(sys1->getValue() - 88.2167) < 0.0001);
    assert(abs(sys2->getValue() - 21.7833) < 0.0001);
    assert(abs(logisticalModel->getTime() - 100.0) < 0.0001); 

    delete(logisticalModel);
    cout << GREEN << "OK!"<< RESET << endl;
}

// Function for complex functional test.
void complexFuncionalTest(){
    cout << "TEST 3 - Complex model" << endl;

    // Create model
    Model* complexModel = Model::createModel("Complex Model", 0.0);
    System* q1 = complexModel->createSystem("Q1", 100.0);
    System* q2 = complexModel->createSystem("Q2", 0.0);
    System* q3 = complexModel->createSystem("Q3", 100.0);
    System* q4 = complexModel->createSystem("Q4", 0.0);
    System* q5 = complexModel->createSystem("Q5", 0.0);
    Flow* complexFlowF = complexModel->createFlow<ComplexFlowF>("Flow f", q1, q2);
    Flow* complexFlowT = complexModel->createFlow<ComplexFlowT>("Flow t", q2, q3);
    Flow* complexFlowU = complexModel->createFlow<ComplexFlowU>("Flow u", q3, q4);
    Flow* complexFlowV = complexModel->createFlow<ComplexFlowV>("Flow v", q4, q1);
    Flow* complexFlowG = complexModel->createFlow<ComplexFlowG>("Flow g", q1, q3);
    Flow* complexFlowR = complexModel->createFlow<ComplexFlowR>("Flow r", q2, q5);

    //Making assertions for the unit test before execution
    assert(q1->getName() == "Q1");
    assert(q2->getName() == "Q2");
    assert(q3->getName() == "Q3");
    assert(q4->getName() == "Q4");
    assert(q5->getName() == "Q5");
    assert(complexFlowF->getName() == "Flow f");
    assert(complexFlowT->getName() == "Flow t");
    assert(complexFlowU->getName() == "Flow u");
    assert(complexFlowV->getName() == "Flow v");
    assert(complexFlowG->getName() == "Flow g");
    assert(complexFlowR->getName() == "Flow r");
    assert(complexModel->getName() == "Complex Model");

    assert(abs(q1->getValue() - 100.0) < 0.0001);
    assert(abs(q2->getValue() - 0.0) < 0.0001);
    assert(abs(q3->getValue() - 100.0) < 0.0001);
    assert(abs(q4->getValue() - 0.0) < 0.0001);
    assert(abs(q5->getValue() - 0.0) < 0.0001);
    assert(abs(complexModel->getTime() - 0.0) < 0.0001);

    //Executes the model
    complexModel->execute(0, 100, 1);

    //Making assertions for the unit test after execution
    assert(abs(q1->getValue() - 31.8513) < 0.0001);
    assert(abs(q2->getValue() - 18.4003) < 0.0001);
    assert(abs(q3->getValue() - 77.1143) < 0.0001);
    assert(abs(q4->getValue() - 56.1728) < 0.0001);
    assert(abs(q5->getValue() - 16.4612) < 0.0001);
    assert(abs(complexModel->getTime() - 100.0) < 0.0001);

    delete(complexModel);
    cout << GREEN << "OK!"<< RESET << endl;
}