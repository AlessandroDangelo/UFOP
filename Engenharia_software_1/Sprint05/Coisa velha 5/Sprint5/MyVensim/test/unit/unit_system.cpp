#include "unit_system.h"

void unit_System_constructor(void){
    System* s1 = new System_Imp();
    s1->setValue(0);
    assert(s1->getValue() == 0);
    System* s2 = new System_Imp();
    s2->setValue(10);
    assert(s2->getValue() == 10 );
}

void unit_System_destructor(void){
    double memoryBefore, memoryAfter, rss;

    mem_usage(memoryBefore, rss);

    System* s = new System_Imp();
    delete s;

    mem_usage(memoryAfter, rss);

    assert(memoryBefore == memoryAfter);
    cout << "Verification: destructor of System. OK!" << endl;
}

void unit_System_setName(void){
    System* s1 = new System_Imp();
    s1->setName("test");
    assert(s1->getName() == "test");
}

void unit_System_setValue(void){
    System* s1 = new System_Imp();
    s1->setValue(10);
    assert(s1->getValue() == 10);
}

void unit_System_getName(void){
    System* s1 = new System_Imp("test", 10);
    assert(s1->getName() == "test" );
}

void unit_System_getValue(void){
    System* s1 = new System_Imp("test", 10);
    assert(s1->getValue() == 10 );
}

void unit_System_operator(void){
    System* s1 = new System_Imp("test", 10);
    System* s2 = s2;
    assert(s1->getValue() == s2->getValue());
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