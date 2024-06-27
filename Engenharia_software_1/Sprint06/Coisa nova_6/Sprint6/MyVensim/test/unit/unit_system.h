#ifndef UNIT_SYSTEM_H
#define UNIT_SYSTEM_H

#include "../../src/lib/system_Imp.h"
#include "../../src/lib/system.h"

#include <string>
#include <cstdio>
#include <iostream>
#include <assert.h>

using namespace std;

void unit_System_constructor(void);
void unit_System_destructor(void);
void unit_System_setName(void);
void unit_System_setValue(void);
void unit_System_getName(void);
void unit_System_getValue(void);
void unit_System_operator(void);
void run_unit_test_System(void);

#endif