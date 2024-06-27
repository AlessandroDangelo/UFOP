#ifndef MODELIMPL_H
#define MODELIMPL_H

#include "./model.h"
#include "handlebody.h"

using namespace std;

//! Class ModelImpl
/**
* This Class represents a ModelImpl in the General Systems Theory implemented in this code.
*/
class ModelBody : public Body{

    protected:
        string name; /*!< This attribute contains a name for the model. */
        double time; /*!< This attribute contains the current time in which the operations in the model is being executed. */
        vector<System*> systems; /*!< This attribute stores pointers to the systems contained in the model. */
        vector<Flow*> flows; /*!< This attribute stores pointers to the flows contained in the model. */    
        static vector<Model*> models; /*!< This attribute stores pointers to all models created by the user. */    

    public:  
        friend class UnitModel;

        typedef vector<System *>::iterator systemIterator;
        typedef vector<Flow *>::iterator flowIterator;
        typedef vector<Model *>::iterator modelIterator;

        systemIterator beginSystems(); /*!< Returns the iterator to the beginning of systems attribute. */
        systemIterator endSystems(); /*!< Returns the iterator to the end of systems attribute. */
        flowIterator beginFlows(); /*!< Returns the iterator to the beginning of flows attribute. */
        flowIterator endFlows(); /*!< Returns the iterator to the end of flows attribute. */
        static modelIterator beginModels(); /*!< Returns the iterator to the beginning of model's vector. */
        static modelIterator endModels(); /*!< Returns the iterator to the end of model's vector. */
        
        /*!
            Creates a Model.
            \param name the model name.
            \param final the model initial time.
            \return Model* - the pointer to the model that was created.
        */
        static Model* createModel(string name="", double time=0.0);

        /*!
            This is the default constructor for the ModelImpl Class. 
            \param name the name of the ModelImpl Class.
            \param time the time for the ModelImpl Class to run.
            \return ModelImpl - a ModelImpl Class object.
        */
        ModelBody(string name="", double time=0.0);
        
        /*!
            This is the default destructor for the ModelImpl Class.
        */
        virtual ~ModelBody();
            
        /*!
            Executes all the flows in the ModelImpl.
            \param start the initial time.
            \param final the final time.
            \param increment represents the iteration step.
        */
        void execute(double start=0.0, double final=0.0, double increment=1.0);
        
        /*!        
           Removes a system's pointer on the systems vector.
           \param sys which will be removed from the vector flows.  
        */ 
        void remove(System* sys);
      
        /*!
           Removes a flow's pointer on the flows vector.
           \param flow which will be removed from the vector flows. 
        */
        void remove(Flow* flow);

        /*!
            Sets the name attribute in the ModelImpl Class.
            \param modelName which will be set to the current model.
        */
        void setName(string modelName);

        /*!
            Returns the name attribute in the ModelImpl Class.
            \return string - the name attribute.
        */
        string getName() const;

        /*!
            Sets the time attribute in the ModelImpl Class.
            \param currentTime which will be set to the current model.
        */
        void setTime(double currentTime);

        /*!
            Returns the time attribute in the ModelImpl Class.
            \return double - the time attribute.
        */
        double getTime() const;

        /*!
            This method increments the time attribute in the ModelImpl Class.
            \param increment which will define by how much time should increment.
        */
        void incrementTime(double increment);

        /*!
            Returns a system in the index-th position of the systems attribute ModelImpl Class.
            \return System* - a system in the index-th position of the systems attribute.
        */
        System* getSystem(int index);

        /*!
            Returns a flow in the index-th position of the flows attribute ModelImpl Class.
            \return Flow* - a flow in the index-th position of the systems attribute.
        */
        Flow* getFlow(int index);

        /*!
            Creates a System in the model
            \param name for the new system
            \param value the initial value for the new system
            \return System* - the system that was created.
        */
        System* createSystem(string name, double value);

        /*!
            Set the target attribute of a flow
            \param f the flow
            \param s the target system
        */
        void setTarget(Flow* f, System* s);

        /*!
            Set the source attribute of a flow
            \param f the flow
            \param s the source system
        */
        void setSource(Flow* f, System* s);

        /*!
            Get the target attribute of a flow
            \param f the flow
            \return System* - the target system
        */
        System* getTarget(Flow* f);

        /*!
            Get the source attribute of a flow
            \param f the flow
            \return System* - the source system
        */
        System* getSource(Flow* f);

        /*!
            Clear the target attribute of a flow
            \param f the flow
        */
        void clearTarget(Flow* f);

        /*!
            Clear the source attribute of a flow
            \param f the flow
        */
        void clearSource(Flow* f);

        /*!        
           Adds a model's pointer to the models vector. 
           \param model the model to be added.
        */ 
        static void add(Model* model);

        /*!        
           Adds a system's pointer to the systems vector.
           \param sys the system to be added.
        */ 
        void add(System* sys);
        
        /*!        
           Adds a flow's pointer to the flows vector. 
           \param flow the flow to be added.
        */ 
        void add(Flow* flow);

};

//! Class ModelHandle
/**
* This Class represents the handle of a Handle/Body idiom for the implementation of a model in the General Systems Theory implemented in this code.
*/
class ModelHandle : public Handle<ModelBody>, public Model{
    public:
        typedef vector<System *>::iterator systemIterator;
        typedef vector<Flow *>::iterator flowIterator;
        typedef vector<Model *>::iterator modelIterator;

        systemIterator beginSystems(){return pImpl_->beginSystems();} /*!< Returns the iterator to the beginning of systems attribute. */
        systemIterator endSystems(){return pImpl_->endSystems();} /*!< Returns the iterator to the end of systems attribute. */
        flowIterator beginFlows(){return pImpl_->beginFlows();} /*!< Returns the iterator to the beginning of flows attribute. */
        flowIterator endFlows(){return pImpl_->endFlows();} /*!< Returns the iterator to the end of flows attribute. */
        modelIterator beginModels(){return pImpl_->beginModels();} /*!< Returns the iterator to the beginning of the global models vector. */
        modelIterator endModels(){return pImpl_->endModels();} /*!< Returns the iterator to the end of the global models vector. */ 

        /*!
            This is the default constructor for the ModelHandle Class. 
            \param name the name of the ModelHandle Class.
            \param time the time for the ModelHandle Class to run.
            \return ModelHandle - a ModelHandle Class object.
        */
        ModelHandle(string name="", double time=0.0){
            // cout << "Construtor de ModelHandle: " << name << " " << time << endl;
            pImpl_->setName(name);
            pImpl_->setTime(time);
        }
        
        /*!
            This is the default destructor for the ModelHandle Class.
        */
        virtual ~ModelHandle(){}
            
        /*!
            Executes all the flows in the ModelHandle.
            \param start the initial time.
            \param final the final time.
            \param increment represents the iteration step.
        */
        void execute(double start=0.0, double final=0.0, double increment=1.0){
            pImpl_->execute(start, final, increment);
        }

        /*!
            Creates a system and returns it's pointer.
            \param name the name of the system that will be created.
            \param value the value of the system that will be created.
        */
        System* createSystem(string name="", double value=0.0){
            return pImpl_->createSystem(name, value);
        }

        /*!
            Creates a model and returns it's pointer.
            \param name the name of the model that will be created.
            \param time the initial time of the model that will be created.
        */
        static Model* createModel(string name="", double time=0.0){
            return ModelBody::createModel(name, time);
        }

        /*!
            Sets the name attribute in the ModelHandle Class.
            \param modelName which will be set to the current model.
        */
        void setName(string modelName){
            pImpl_->setName(modelName);
        }

        /*!
            Returns the name attribute in the ModelHandle Class.
            \return string - the name attribute.
        */
        string getName() const{
            return pImpl_->getName();
        }

        /*!
            Sets the time attribute in the ModelHandle Class.
            \param currentTime which will be set to the current model.
        */
        void setTime(double currentTime){
            pImpl_->setTime(currentTime);
        }

        /*!
            Returns the time attribute in the ModelHandle Class.
            \return double - the time attribute.
        */
        double getTime() const{
            return pImpl_->getTime();
        }

        /*!
            This method increments the time attribute in the ModelHandle Class.
            \param increment which will define by how much time should increment.
        */
        void incrementTime(double increment){
            pImpl_->incrementTime(increment);
        }

        /*!        
           Removes a system's pointer on the systems vector.
           \param sys which will be removed from the vector flows.  
        */ 
        void remove(System* sys){
            pImpl_->remove(sys);
        }
      
        /*!
           Removes a flow's pointer on the flows vector.
           \param flow which will be removed from the vector flows. 
        */
        void remove(Flow* flow){
            pImpl_->remove(flow);
        }

        /*!
            Sets the source system of a flow.
            \param flow the flow which will have it's source system changed.
            \param sourceSys a pointer to the source system.
        */
        void setSource(Flow* flow, System* sourceSys){
            pImpl_->setSource(flow, sourceSys);
        }

        /*!
            Returns the source system of a flow.
            \param flow the flow which will have it's source system returned.
            \return System* - the pointer of the source system. 
        */
        System* getSource(Flow* flow){
            return pImpl_->getSource(flow);
        }

        /*!
            Sets the pointer of the source system of a flow as NULL.
            \param flow the flow which will have it's source system changed.
        */
        void clearSource(Flow* flow){
            pImpl_->clearSource(flow);
        }

        /*!
            Sets the target system of a flow.
            \param flow the flow which will have it's target system changed.
            \param targetSys a pointer to the target system.
        */
        void setTarget(Flow* flow, System* targetSys){
            pImpl_->setTarget(flow, targetSys);
        }

        /*!
            Returns the target system of a flow.
            \param flow the flow which will have it's target system returned.
            \return System* - the pointer of the target system. 
        */
        System* getTarget(Flow* flow){
            return pImpl_->getTarget(flow);
        }

        /*!
            Sets the pointer of the target system of a flow as NULL.
            \param flow the flow which will have it's target system changed.
        */
        void clearTarget(Flow* flow){
            pImpl_->clearTarget(flow);
        }

        /*!
            Returns a system in the index-th position of the systems attribute ModelHandle Class.
            \return System* - a system in the index-th position of the systems attribute.
        */
        System* getSystem(int index){
            return pImpl_->getSystem(index);
        }

        /*!
            Returns a flow in the index-th position of the flows attribute ModelHandle Class.
            \return Flow* - a flow in the index-th position of the systems attribute.
        */
        Flow* getFlow(int index){
            return pImpl_->getFlow(index);
        }

    private:
        /*!        
           Adds a system's pointer to the systems vector.
           \param sys the system to be added.
        */ 
        void add(System* sys){
            pImpl_->add(sys);
        }
        
        /*!        
           Adds a flow's pointer to the flows vector. 
           \param flow the flow to be added.
        */ 
        void add(Flow* flow){
            pImpl_->add(flow);
        }

};

#endif