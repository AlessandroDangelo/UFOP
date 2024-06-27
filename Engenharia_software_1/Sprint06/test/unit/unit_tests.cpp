#include "unit_tests.h"
#include <cassert>

using namespace std;

// Function for System class' "+" global operator unit test.
void unit_test_global_sumOperator(){
    System* system = new SystemHandle("Population", 10.0);

    cout << "TEST 1 - System class sum global operator" << endl;
    assert((20.0 + (*system)) == 30);

    delete system;

    cout << GREEN << "OK!" << RESET << endl;
}

// Function for System class' "-" global operator unit test.
void unit_test_global_minusOperator(){
    System* system = new SystemHandle("Population", 10.0);

    cout << "TEST 2 - System class subtraction global operator" << endl;
    assert((20.0 - (*system)) == 10);

    delete system;

    cout << GREEN << "OK!" << RESET << endl;
}

// Function for System class' "*" global operator unit test.
void unit_test_global_timesOperator(){
    System* system = new SystemHandle("Population", 10.0);

    cout << "TEST 3 - System class multiplication global operator" << endl;
    assert((20.0 * (*system)) == 200);

    delete system;

    cout << GREEN << "OK!" << RESET << endl;
}

// Function for System class' "/" global operator unit test.
void unit_test_global_divisionOperator(){
    System* system = new SystemHandle("Population", 10.0);

    cout << "TEST 4 - System class division global operator" << endl;
    assert((20.0 / (*system)) == 2);

    delete system;

    cout << GREEN << "OK!" << RESET << endl;
}

// Function to run all the global unit tests.
void run_unit_tests_globals(){
    unit_test_global_sumOperator();
    unit_test_global_minusOperator();
    unit_test_global_timesOperator();
    unit_test_global_divisionOperator();
}