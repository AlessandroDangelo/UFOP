#include "functional_tests.h"

using namespace std;

#define DEBUGING
#ifdef DEBUGING
    int numHandleCreated = 0;
    int numHandleDeleted = 0;
    int numBodyCreated = 0;
    int numBodyDeleted = 0;
#endif

int main (){

    exponentialFuncionalTest();
    logisticalFuncionalTest();
    complexFuncionalTest();

    cout << "RUNNING FUNCTIONAL TESTS" << endl;

    printf("-> Created handles: %4d\n", numHandleCreated);
    printf("-> Deleted handles: %4d\n", numHandleDeleted);
    printf("-> Created bodies: %5d\n", numBodyCreated);
    printf("-> Deleted bodies: %5d\n", numBodyDeleted);

    cout << "Everything is running!" << endl;

    return 0;
}