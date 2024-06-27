#ifndef SYSTEM_H
#define SYSTEM_H

#include <iostream>
#include <cstdlib>

using namespace std;

/**
* @brief File responsible for project systems.
*
* @author Ananda Mendes 2021.
*/

class System{
    public:
        /**
         * @brief Destructor to destroy the system.
         * 
         */
        virtual ~System(){};

         /**
         * @brief Add a name for the system.
         * @param name System name.
         */
        virtual void setName(string) = 0;

         /**
         * @brief Add a value to the system.
         * @param value System value.
         */
        virtual void setValue(double) = 0;

        /**
         * @brief Function to return system value.
         * 
         * @return Returns a double.
         */
        virtual double getValue() = 0;

         /**
         * @brief Function to return system name.
         * 
         * @return Returns a string.
         */
        virtual string getName() = 0;
};

#endif