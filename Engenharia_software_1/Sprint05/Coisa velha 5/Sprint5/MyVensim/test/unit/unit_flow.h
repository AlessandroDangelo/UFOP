#ifndef UNIT_FLOW_H
#define UNIT_FLOW_H

#include "../../src/lib/system_Imp.h"
#include "../../src/lib/flow_unit.h"
#include "mem_usage.h"

#include <cstdio>
#include <assert.h>

void unit_Flow_constructor(void);
void unit_Flow_destructor(void);
void unit_Flow_setSource(void);
void unit_Flow_setDestination(void);
void unit_Flow_getSource(void);
void unit_Flow_getDestination(void);
void unit_Flow_operator(void);
void run_unit_test_Flow(void);

#endif