#include "functional_tests.h"
#include "../../src/lib/model_Imp.h"

void exponentialFuncionalTest(){
    Model* Modelexponential = Model::createModel("Model pops");
    System* pop1 =  Modelexponential->createSystem("pop1", 100.0);
    System* pop2 =  Modelexponential->createSystem("pop2", 0.0);
    Flow* f = Modelexponential->createFlow<Exponential>(pop1,pop2);
    Modelexponential->run(0,100);
    assert(abs(pop1->getValue() - 36.6032) < 0.0001);
    assert(abs(pop2->getValue() - 63.3968) < 0.0001);

    cout << endl << "Exponential test OK!" << endl;
}

void logisticalFuncionalTest(){
    Model* ModelLogistic = Model::createModel("Model Logistic");
    System* p1 = ModelLogistic->createSystem("p1", 100.0);
    System* p2 = ModelLogistic->createSystem("p2", 10.0);
    Flow* l = ModelLogistic->createFlow<Logistic>(p1,p2);
    ModelLogistic->run(0,100);
    
    assert(abs(p1->getValue() - 88.2167) < 0.0001);
    assert(abs(p2->getValue() - 21.7834) < 0.0001);

    cout << endl << "Logistic test OK!" << endl;
}

void complexFuncionalTest(){
    Model* model = Model::createModel("Model Complex");
    System* q1 =  model->createSystem("q1", 100.0);
    System* q2 =  model->createSystem("q2", 0.0);
    System* q3 =  model->createSystem("q3", 100.0);
    System* q4 =  model->createSystem("q4", 0.0);
    System* q5 =  model->createSystem("q5", 0.0);
    
    Flow* f = model->createFlow<Exponential>(q1,q2);
    Flow* g = model->createFlow<Exponential>(q1,q3);
    Flow* r = model->createFlow<Exponential>(q2,q5);
    Flow* t = model->createFlow<Exponential>(q2,q3);
    Flow* u = model->createFlow<Exponential>(q3,q4);
    Flow* v = model->createFlow<Exponential>(q4,q1);

    model->run(0,100);

    assert(abs((q1->getValue() - 31.8513)) < 0.0001);
    assert(abs((q2->getValue() - 18.4003)) < 0.0001);
    assert(abs((q3->getValue() - 77.1143)) < 0.0001);
    assert(abs((q4->getValue() - 56.1728)) < 0.0001);
    assert(abs((q5->getValue() - 16.4612)) < 0.0001);

    cout << endl << "Complex test OK!" << endl;
}