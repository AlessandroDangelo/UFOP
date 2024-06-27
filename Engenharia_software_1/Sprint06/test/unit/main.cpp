#ifndef MAIN_UNIT_TESTS
#define MAIN_UNIT_TESTS

#include <assert.h>
#include "./unit_system.h"
#include "./unit_model.h"
#include "./unit_tests.h"

#define DEBUGING
#ifdef DEBUGING 
int numHandleCreated = 0;
int numHandleDeleted = 0;
int numBodyCreated = 0;
int numBodyDeleted = 0;
#endif

int main(){

    cout << "\n========== Testes unitarios da Classe System ===========\n" << endl;
    run_unit_tests_system();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);
    cout << "\n=========== Testes unitarios da Classe Flow ============\n" << endl;
    run_unit_tests_flow();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);
    cout << "\n=========== Testes unitarios da Classe Model ===========\n"<< endl;
    run_unit_tests_model();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);
    cout << "\n========= Testes unitarios de Funcoes Globais ==========\n"<< endl;
    run_unit_tests_globals();
    assert(numHandleCreated == numHandleDeleted);
    assert(numBodyCreated == numBodyDeleted);
    cout << "\n========================================================\n" << endl;

    return 0;
}

#endif