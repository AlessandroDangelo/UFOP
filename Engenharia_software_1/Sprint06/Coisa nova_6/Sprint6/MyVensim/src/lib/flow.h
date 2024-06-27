#ifndef FLOW_H
#define FLOW_H

#include "system.h"

/**
* @brief File responsible for project flows.
*
* @author Ananda Mendes 2021.
*/

class Flow{
    public:
        /**
         * @brief Destructor to destroy the flow.
         * 
         */
        virtual ~Flow(){};

         /**
         * @brief Add an input system to the stream.
         * 
         * @param system System pointer.
         */
        virtual void setSources(System*) = 0;

        
        /**
         * @brief Add an exit system to the stream.
         * @param system System pointer.
         */
        virtual void setDestination(System*) = 0;

          /**
         * @brief Function to return an input system.
         * 
         * @return Returns a System object.
         */
        virtual System* getSource() = 0;

         /**
         * @brief Function to return an output system.
         * 
         * @return Returns a System object.
         */
        virtual System* getDestination() = 0;

          /**
         * @brief Virtual function to run the stream.
         * 
         * @return Returns value of 0.
         */
        virtual double run() = 0;

};

#endif