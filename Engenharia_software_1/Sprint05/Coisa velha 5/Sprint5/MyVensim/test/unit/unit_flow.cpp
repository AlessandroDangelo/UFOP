#include "unit_flow.h"

void unit_Flow_constructor(void){
    System*s = new System_Imp("n1",40);
    System*t = new System_Imp("n2",6);
    Flow* f = new Logistic(s,t);
    assert(f->getDestination()==t);
}

void unit_Flow_destructor(void){
    double memoryBefore, memoryAfter, rss;

    mem_usage(memoryBefore, rss);

    Flow* f = new FlowUnit();
    delete f;

    mem_usage(memoryAfter, rss);

    assert(memoryBefore == memoryAfter);
    cout << "Verification: destructor of Flow. OK!" << endl;
}

void unit_Flow_setSource(void){
    Flow* f = new FlowUnit();
    System* destination = new System_Imp();
    System* source = new System_Imp();
    f->setDestination(destination);
    f->setSources(source);
    assert(f->getSource() == source);
}

void unit_Flow_setDestination(void){
    Flow* f = new FlowUnit();
    System* destination = new System_Imp();
    System* source = new System_Imp();
    f->setDestination(destination);
    f->setSources(source);
    assert(f->getDestination() == destination);
}

void unit_Flow_getSource(void){
    System* s1 = new System_Imp();
    System* s2 = new System_Imp();
    Flow* f = new Exponential(s1,s2);
    assert(f->getSource() == s1);
}

void unit_Flow_getDestination(void){
    System* s1 = new System_Imp();
    System* s2 = new System_Imp();
    Flow* f = new Exponential(s1,s2);
    assert(f->getDestination() == s2);
}

void unit_Flow_operator(void){
    System* s1 = new System_Imp();
    System* s2 = new System_Imp();
    Flow* f = new Exponential(s1,s2);
    Flow* test = f;
    assert(f->getDestination() == test->getDestination());
}

void run_unit_test_Flow(void){
    unit_Flow_constructor();
    unit_Flow_destructor();
    unit_Flow_setSource();
    unit_Flow_setDestination();
    unit_Flow_getSource();
    unit_Flow_getDestination();
    unit_Flow_operator();
}