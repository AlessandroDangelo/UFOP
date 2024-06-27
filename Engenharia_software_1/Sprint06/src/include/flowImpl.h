#ifndef FLOWIMPL_H
#define FLOWIMPL_H

#include "./flow.h"
#include "./handleBody.h"


using namespace std;

//! Class FlowImpl
/**
* This Class represents a flow in the General Systems Theory implemented in this code.
*/
class FlowBody : public Body{

    protected:
        string name; /*!< This attribute contains a name for the flow. */
        System* source; /*!< This attribute stores a pointer to the source system of a flow. */
        System* target; /*!< This attribute stores a pointer to the target system of a flow. */

    public:

        /*!
            This is the default constructor for the FlowImpl Class.
            \param name the name of the Flow.
            \param source a pointer to the source system of the Flow.
            \param target a pointer to the target system of the Flow.
            \return Flow - a FlowImpl Class object, with it's isCopy attribute set to false.
        */
        FlowBody(string name = "", System* source = NULL, System* target = NULL);
        
        /*!
            This is the default destructor for the FlowImpl Class.
        */
        virtual ~FlowBody();

        /*!
            A pure virtual method that will be inherited by subclasses created by the user, and that will contain
            an equation that will be executed by the model.
        */
        virtual double execute() = 0;

        /*!
            Returns the name attribute in the FlowImpl Class.
            \return string - the content name attribute.  
        */
        string getName() const;

        /*!
            Sets the name attribute in the FlowImpl Class.
            \param flowName which will be set to the current flow.
        */
        void setName(string flowName);

        /*!
            Returns the source attribute in the FlowImpl Class.  
            \return System* - the pointer of the source system. 
        */
        System* getSource() const;

        /*!
            Sets the source attribute in the FlowImpl Class. 
            \param sourceSys a pointer to the source target.
        */
        void setSource(System* sourceSys);

        /*!
            Sets the pointer of the source attribute as NULL.
        */
        void clearSource();

        /*!
            Returns the target attribute in the FlowImpl Class. 
            \return System* - the pointer of the target system. 
        */
        System* getTarget() const;
        
        /*!
            Sets the target attribute in the FlowImpl Class.   
            \param targetSys a pointer to the target system.
        */
        void setTarget(System* targetSys);

        /*!
            Sets the pointer of the target attribute as NULL.
        */
        void clearTarget();
};

//! Class FlowHandle
/**
* This Class represents the handle of a Handle/Body idiom for the implementation of a flow in the General Systems Theory implemented in this code.
*/
template <typename FLOW_IMPL>
class FlowHandle : public Handle<FLOW_IMPL>, public Flow{

    public:

        /*!
            This is the default constructor for the FlowHandle Class.
            \param name the name of the FlowHandle.
            \param source a pointer to the source system of the FlowHandle.
            \param target a pointer to the target system of the FlowHandle.
            \return Flow - a FlowHandle Class object.
        */
        FlowHandle<FLOW_IMPL>(string name = "", System* source = NULL, System* target = NULL){
            this->pImpl_->setName(name);
            this->pImpl_->setSource(source);
            this->pImpl_->setTarget(target);
        }
        
        /*!
            This is the default destructor for the FlowHandle Class.
        */
        virtual ~FlowHandle(){};

        /*!
            A pure virtual method that will be inherited by subclasses created by the user, and that will contain
            an equation that will be executed by the model.
        */
        double execute(){
            return this->pImpl_->execute();
        }

        /*!
            Returns the name attribute in the FlowHandle Class.
            \return string - the content name attribute.  
        */
        string getName() const{
            return this->pImpl_->getName();
        }

        /*!
            Sets the name attribute in the FlowHandle Class.
            \param flowName which will be set to the current flow.
        */
        void setName(string flowName){
            this->pImpl_->setName(flowName);
        }

        /*!
            Returns the source attribute in the FlowHandle Class.  
            \return System* - the pointer of the source system. 
        */
        System* getSource() const{
            return this->pImpl_->getSource();
        }

        /*!
            Sets the source attribute in the FlowHandle Class. 
            \param sourceSys a pointer to the source target.
        */
        void setSource(System* sourceSys){
            this->pImpl_->setSource(sourceSys);
        }

        /*!
            Sets the pointer of the source attribute as NULL.
        */
        void clearSource(){
            this->pImpl_->clearSource();
        }

        /*!
            Returns the target attribute in the FlowHandle Class. 
            \return System* - the pointer of the target system. 
        */
        System* getTarget() const{
            return this->pImpl_->getTarget();
        }
        
        /*!
            Sets the target attribute in the FlowHandle Class.   
            \param targetSys a pointer to the target system.
        */
        void setTarget(System* targetSys){
            this->pImpl_->setTarget(targetSys);
        }

        /*!
            Sets the pointer of the target attribute as NULL.
        */
        void clearTarget(){
            this->pImpl_->clearTarget();
        }
};

#endif