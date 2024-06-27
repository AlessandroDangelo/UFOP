#ifndef SYSTEM_IMP_H
#define SYSTEM_IMP_H

#include "system.h"

/**
* @brief File responsible for project systems.
*
* @author Alessandro Dangelo 2022.
*/

class System_Imp : public System{
    protected:
        string name; /*! <String name */
        double value; /*! <Double value */
    public:
        /**
         * @brief Builder to create a new system.
         * 
         */
        System_Imp();
        System_Imp(string,double);

        /**
         * @brief Destructor to destroy the system.
         * 
         */
        virtual ~System_Imp();

        /**
         * @brief Add a name for the system.
         * @param name System name.
         */
        void setName(string);

        /**
         * @brief Add a value to the system.
         * @param value System value.
         */
        void setValue(double);

        /**
         * @brief Function to return system value.
         * 
         * @return Returns a double.
         */
        double getValue();

        /**
         * @brief Function to return system name.
         * 
         * @return Returns a string.
         */
        string getName();

        /**
         * @brief Function to overload operator =.
         * 
         * @param flow System pointer.
         * @return Returns a system.
         */
        System_Imp* operator=(System*);
};

#endif