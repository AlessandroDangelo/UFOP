#ifndef FLOW_UNIT_H
#define FLOW_UNIT_H

#include "flow_Imp.h"

/**
* @brief File responsible for project flows.
*
* @author Alessandro Dangelo 2022.
*/

class FlowUnit : public Flow_Imp{
     /**
     * @brief Virtual function to run the stream.
     * 
     * @return Returns value of 0.
     */
    double run(){
        return 0;
    }
};

#endif