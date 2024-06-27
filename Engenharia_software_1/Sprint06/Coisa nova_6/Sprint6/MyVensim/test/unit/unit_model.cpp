#include "unit_model.h"

void unit_Model_constructor(void){
    Model* m = Model::createModel("test model");
	System* s;
	s = m->createSystem("system",10.0 );
    assert(m->getSystem("system") == s);
    delete m;
}

void unit_Model_destructor(void){}

void unit_Model_run(void){
    Model* Modelexponential = Model::createModel("Model pops");
    System* pop1;
    System* pop2;
    Flow* f;
    pop1 =  Modelexponential->createSystem("pop1", 100.0);
    pop2 =  Modelexponential->createSystem("pop2", 0.0);
    f = Modelexponential->createFlow<EXPONENTIAL>();
    f->setSources(pop1);
    f->setDestination(pop2);
    Modelexponential->run(0,100);
    assert(abs(pop1->getValue() - 36.6032) < 0.0001);
    assert(abs(pop2->getValue() - 63.3968) < 0.0001);

    delete Modelexponential;
}

void unit_Model_add_System(void){
    Model* m = Model::createModel("test add");
	System* s;
	s = m->createSystem("testSystem",0);
    assert(m->getSystem("testSystem") == s);

    delete m;
}

void unit_Model_add_Flow(void){
    Model* m = Model::createModel("test add");
    System* s;
    System* s2;
    Flow* f = m->createFlow<LOGISTIC>();
    f->setSources(s);
    f->setDestination(s2);
    assert(m->getFlows().empty() == 0);

    delete m;
}

void run_unit_test_Model(){
    unit_Model_constructor();
    unit_Model_destructor();
    unit_Model_run();
    unit_Model_add_System();
    unit_Model_add_Flow();
}
