#ifndef MODEL_IMP_H
#define MODEL_IMP_H

#include "flow_unit.h"
#include "model.h"
#include <cstring>


/**
* @brief File responsible for project templates.
*
* @author Alessandro Dangelo 2022.
*/

class Model_Imp : public Model{
    protected:
        vector<Flow*> flows; /*! < Flow pointer vector */
        vector<System*> systems; /*! < Systems pointer vector */
        static vector<Model*> models;
    public:
        /**
         * @brief Builder to create a new model.
         * 
         */
        Model_Imp();

        Model_Imp(string);

        /**
         * @brief Destructor to destroy the model.
         * 
         */
        virtual ~Model_Imp();

        static Model* createModel(string);

        /**
         * @brief Function to run the model.
         * 
         * @param start Initial value.
         * @param finish Final value.
         * @return Returns final value.
         */
        double run(int,int);

        System* createSystem(string,double);

        /**
         * @brief Function to overload operator =.
         * 
         * @param model Model pointer.
         * @return Returns model.
         */
        System* getSystem(string name);
        vector<Flow*> getFlows();
        Model_Imp* operator=(Model*);

    private:
        /**
         * @brief Function to add a new system.
         * 
         */
        void add(System*);

         /**
         * @brief Function to add new flow.
         * 
         */
        void add(Flow*);
        string id;
};

#endif