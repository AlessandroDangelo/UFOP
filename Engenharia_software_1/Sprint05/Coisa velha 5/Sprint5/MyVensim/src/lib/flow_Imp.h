#ifndef FLOW_IMP_H
#define FLOW_IMP_H

#include "flow.h"

/**
* @brief File responsible for project flows.
*
* @author Alessandro Dangelo 2022.
*/

class Flow_Imp : public Flow{
    protected:
        System* source; /*! <Pointer of entry of a system */
        System* destination; /*! <Pointer of output of a system */
    public:
        /**
         * @brief Builder to create a new flow.
         * 
         */
        Flow_Imp();
        Flow_Imp(System*, System*);

        /**
         * @brief Destructor to destroy the flow.
         * 
         */
        virtual ~Flow_Imp();

         /**
         * @brief Add an input system to the stream.
         * 
         * @param system System pointer.
         */
        void setSources(System*);

        /**
         * @brief Add an exit system to the stream.
         * @param system System pointer.
         */
        void setDestination(System*);

        /**
         * @brief Function to return an input system.
         * 
         * @return Returns a System object.
         */
        System* getSource();

        /**
         * @brief Function to return an output system.
         * 
         * @return Returns a System object.
         */
        System* getDestination();

        /**
         * @brief Virtual function to run the stream.
         * 
         * @return Returns value of 0.
         */
        virtual double run() = 0;

        /**
         * @brief Function to overload operator =.
         * 
         * @param Flow_Imp Flow pointer.
         * @return Returns flow.
         */
        Flow_Imp* operator=(Flow*);
};

class Exponential: public Flow_Imp{
    public:
    /**
     * @brief Builder to create a new exponential flow.
     * 
     */
    Exponential() {};
    Exponential(System* source, System* destination):Flow_Imp(source,destination){};
    
    /**
     * @brief Function to run the stream.
     * 
     * @return Returns double resulting from calculation performed.
     */
    double run(){
        return getSource()->getValue()*0.01;
    }
};

class Logistic: public Flow_Imp{
    public:
    /**
     * @brief Builder to create a new logistical flow.
     * 
     */
    Logistic() {};
    Logistic(System* source, System* destination):Flow_Imp(source,destination){};
    
    /**
     * @brief Function to run the stream.
     * 
     * @return Returns double resulting from calculation performed.
     */
    double run(){
        return getDestination()->getValue()*0.01*(1-(getDestination()->getValue())/70);
    }
};

#endif