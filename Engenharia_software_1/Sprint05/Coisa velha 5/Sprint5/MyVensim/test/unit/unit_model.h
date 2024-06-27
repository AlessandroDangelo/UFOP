#ifndef UNIT_MODEL_H
#define UNIT_MODEL_H

#include "../../src/lib/model_Imp.h"
#include "mem_usage.h"

#include <cstdio>
#include <assert.h>

void unit_Model_constructor(void);
void unit_Model_destructor(void);
void unit_Model_run(void);
void unit_Model_add_System(void);
void unit_Model_add_Flow(void);
void run_unit_test_Model(void);
#endif