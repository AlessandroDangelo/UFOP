#include "unit_system.h"

void unit_System_constructor(void){
    System* s1 = new SystemHandle();
    s1->setValue(0);
    assert(s1->getValue() == 0);
    delete s1;
}

void unit_System_destructor(void){}

void unit_System_setName(void){
    System* s1 = new SystemHandle();
    s1->setName("test");
    assert(s1->getName() == "test");

    delete s1;
}

void unit_System_setValue(void){
    System* s1 = new SystemHandle();
    s1->setValue(10);
    assert(s1->getValue() == 10);

    delete s1;
}

void unit_System_getName(void){
    System* s1 = new SystemHandle("test", 10);
    assert(s1->getName() == "test" );

    delete s1;
}

void unit_System_getValue(void){
    System* s1 = new SystemHandle("test", 10);
    assert(s1->getValue() == 10 );

    delete s1;
}

void unit_System_operator(void){
    System* s1 = new SystemHandle("test", 10);
    System* s2 = s1;
    assert(s1->getValue() == s2->getValue());

    delete s1, s2;
}

void run_unit_test_System(void){
    unit_System_constructor();
    unit_System_destructor();
    unit_System_setName();
    unit_System_setValue();
    unit_System_getName();
    unit_System_getValue();
    unit_System_operator();
}