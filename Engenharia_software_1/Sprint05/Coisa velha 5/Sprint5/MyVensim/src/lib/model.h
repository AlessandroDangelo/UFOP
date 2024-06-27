#ifndef MODEL_H
#define MODEL_H
#include "flow.h"
#include <vector>

/**
* @brief File responsible for project templates.
*
* @author Alessandro Dangelo 2022.
*/

class Model{
    public:
        /**
         * @brief Destructor to destroy the model.
         * 
         */
        virtual ~Model(){};

         /**
         * @brief Function to run the model.
         * 
         * @param start Initial value.
         * @param finish Final value.
         * @return Returns final value.
         */
        virtual double run(int,int) = 0;

         /**
         * @brief Function to create the model.
         * 
         * @param string Initial value.
         * @return Returns final model.
         */
        static Model* createModel(string);
        virtual System* createSystem(string,double) = 0;
        virtual Model* operator=(Model*) = 0;

        /**
         * @brief Function to overload operator =.
         * 
         * @param model Model pointer.
         * @return Returns model.
         */
        virtual System* getSystem(string name) = 0;
        virtual vector<Flow*> getFlows() = 0;
        template <typename T_FLOW>
        Flow* createFlow(System* source = nullptr, System* destination = nullptr){
            Flow* flow = new T_FLOW();
            flow->setSources(source);
            flow->setDestination(destination);
            add(flow);
            return flow;
        }

    private:
        /**
         * @brief Function to add a new system.
         * 
         */
        virtual void add(System*) = 0;

         /**
         * @brief Function to add new flow.
         * 
         */
        virtual void add(Flow*) = 0;
};

#endif