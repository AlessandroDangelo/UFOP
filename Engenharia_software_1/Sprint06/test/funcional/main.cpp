#ifndef MAIN_FUNCIONAL_TESTS
#define MAIN_FUNCIONAL_TESTS

#include "funcional_tests.h"

#define DEBUGING
#ifdef DEBUGING
int numHandleCreated = 0;
int numHandleDeleted = 0;
int numBodyCreated = 0;
int numBodyDeleted = 0;
#endif

int main(){

    exponentialFuncionalTest();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);

    logisticalFuncionalTest();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);

    complexFuncionalTest();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);

    return 0;
}

#endif