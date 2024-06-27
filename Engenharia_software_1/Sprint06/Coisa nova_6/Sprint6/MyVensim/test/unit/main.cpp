//#include "unit_tests.h"
#include "unit_system.h"
#include "unit_flow.h"
#include "unit_model.h"

#define DEBUGING
#ifdef DEBUGING
    int numHandleCreated = 0;
    int numHandleDeleted = 0;
    int numBodyCreated = 0;
    int numBodyDeleted = 0;
#endif

using namespace std;

int main (){
    
    run_unit_test_System();
    run_unit_test_Flow();
    run_unit_test_Model();

    cout << "RUNNING UNIT TESTS" << endl;

    printf("-> Created handles: %4d\n", numHandleCreated);
    printf("-> Deleted handles: %4d\n", numHandleDeleted);
    printf("-> Created bodies: %5d\n", numBodyCreated);
    printf("-> Deleted bodies: %5d\n", numBodyDeleted);
    
    cout << "All unit tests passed!" << endl;

    return 0;
}