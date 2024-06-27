#include "unit_model.h"

void unit_Model_constructor(void){
    Model* m = Model::createModel("test model");
	System* s;
	s = m->createSystem("system",10.0 );
    assert(m->getSystem("system") == s);
}

void unit_Model_destructor(void){
    double memoryBefore, memoryAfter, rss;

    mem_usage(memoryBefore, rss);

    Model* m = new Model_Imp();
    delete m;

    mem_usage(memoryAfter, rss);

    assert(memoryBefore == memoryAfter);
    cout << "Verification: destructor of Model. OK!" << endl;
}

void unit_Model_run(void){
    Model* Modelexponential = Model_Imp::createModel("Model pops");
    System* pop1;
    System* pop2;
    Flow* f;
    pop1 =  Modelexponential->createSystem("pop1", 100.0);
    pop2 =  Modelexponential->createSystem("pop2", 0.0);
    f = Modelexponential->createFlow<Exponential>(pop1,pop2);
    Modelexponential->run(0,100);
    assert((pop1->getValue() - 36.6032) < 0.0001);
    assert((pop2->getValue() - 63.3968) < 0.0001);
}

void unit_Model_add_System(void){
    Model* m = Model::createModel("test add");
	System* s;
	s = m->createSystem("testSystem",0);
    assert(m->getSystem("testSystem") == s);
}

void unit_Model_add_Flow(void){
    Model* m = Model::createModel("test add");
    System* s;
    System* s2;
    Flow* f = m->createFlow<Logistic>(s,s2);
    assert(m->getFlows().empty() == 0);
}

void run_unit_test_Model(){
    unit_Model_constructor();
    unit_Model_destructor();
    unit_Model_run();
    unit_Model_add_System();
    unit_Model_add_Flow();
}
