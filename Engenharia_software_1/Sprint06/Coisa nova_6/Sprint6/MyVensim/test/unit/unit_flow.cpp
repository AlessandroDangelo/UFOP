#include "unit_flow.h"

void unit_Flow_constructor(void){
    Flow* f = new FlowHandle<FlowUnit>();
    assert(f->getSource() == nullptr);
    delete f;
}

void unit_Flow_destructor(void){}

void unit_Flow_setSource(void){
    Flow* f = new FlowHandle<FlowUnit>();
    System* source = new SystemHandle();
    f->setSources(source);
    assert(f->getSource() == source);
    delete f;
    delete source;
}

void unit_Flow_setDestination(void){
    Flow* f = new FlowHandle<FlowUnit>();
    System* destination = new SystemHandle();
    f->setDestination(destination);
    assert(f->getDestination() == destination);
    delete f;
    delete destination;
}

void unit_Flow_getSource(void){
    System* s1 = new SystemHandle();
    Flow* f = new FlowHandle<FlowUnit>();
    f->setSources(s1);
    assert(f->getSource() == s1);
    delete s1;
    delete f;
}

void unit_Flow_getDestination(void){
    System* s1 = new SystemHandle();
    Flow* f = new FlowHandle<FlowUnit>();
    f->setDestination(s1);
    assert(f->getDestination() == s1);
    delete s1;
    delete f;
}

void unit_Flow_operator(void){
    System* s1 = new SystemHandle();
    Flow* f = new FlowHandle<FlowUnit>();
    f->setDestination(s1);
    Flow* test = f;
    assert(f->getDestination() == test->getDestination());
    delete s1;
    delete f;
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