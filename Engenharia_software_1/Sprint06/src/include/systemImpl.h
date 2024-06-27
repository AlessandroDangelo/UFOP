#ifndef SYSTEMIMPL_H
#define SYSTEMIMPL_H

#include "system.h"
#include "handleBody.h"

using namespace std;


//! Class SystemImpl
/**
* This Class represents a SystemImpl in the General Systems Theory implemented in this code.
*/
class SystemBody : public Body{

    protected:
        string name; /*!< This attribute contains a name for the SystemImpl. */
        double value; /*!< This attribute contains the actual value of the SystemImpl. */

    public:

        /*!
            This is the default constructor for the SystemImpl Class.
            \param name the name of the SystemImpl.
            \param value the initial value of the SystemImpl.
            \return SystemImpl - a SystemImpl Class object.
        */
        SystemBody(string name = "", double value = 0.0);

        /*!
            This is the default destructor for the SystemImpl Class.
        */
        virtual ~SystemBody();

        /*!
            Sets the name attribute in the SystemImpl Class.
            \param sysName which will be set to the current SystemImpl.
        */
        void setName(string sysName);

        /*!
            Returns the name attribute in the SystemImpl Class.
            \return string - the content name attribute.  
        */
        string getName() const;
        
        /*!
            Sets the value attribute in the SystemImpl Class.
            \param sysValue which will be set to the current SystemImpl.
        */
        void setValue(double sysValue);

        /*!
            Returns the value attribute in the SystemImpl Class.
            \return double - the content value attribute.  
        */
        double getValue() const;
      
        /*!
            This is the overloaded "+" operator for the SystemImpl Class.
        */
        double operator+(const System& sys);
        
        /*!
            This is the overloaded "+" operator for the SystemImpl Class.
        */
        double operator+(const double& valueSys);

        /*!
            This is the overloaded "-" operator for the SystemImpl Class.
        */
        double operator-(const System& sys);
        
        /*!
            This is the overloaded "-" operator for the SystemImpl Class.
        */
        double operator-(const double& valueSys);

        /*!
            This is the overloaded "*" operator for the SystemImpl Class.
        */
        double operator*(const System& sys);
        
        /*!
            This is the overloaded "*"" operator for the SystemImpl Class.
        */
        double operator*(const double& valueSys);

        /*!
            This is the overloaded "/" operator for the SystemImpl Class.
        */
        double operator/(const System& sys);
        
        /*!
            This is the overloaded "/" operator for the SystemImpl Class.
        */
        double operator/(const double& valueSys);

};

//! Class SystemHandle
/**
* This Class represents the handle of a Handle/Body idiom for the System in the General Systems Theory implemented in this code.
*/
class SystemHandle : public Handle<SystemBody>, public System{
    public:
        
        /*!
            This is the default constructor for the SystemHandle Class.
            \param name the name of the SystemHandle.
            \param value the initial value of the SystemHandle.
            \return SystemHandle - a SystemHandle Class object.
        */
        SystemHandle(string name = "", double value = 0.0){  
            pImpl_->setName(name);
            pImpl_->setValue(value);
        }

        /*!
            This is the default destructor for the SystemHandle Class.
        */
        virtual ~SystemHandle(){};

        /*!
            Sets the name attribute in the SystemHandle Class.
            \param sysName which will be set to the current SystemHandle.
        */
        void setName(string sysName){
            pImpl_->setName(sysName);
        }

        /*!
            Returns the name attribute in the SystemHandle Class.
            \return string - the content name attribute.  
        */
        string getName() const{
            return pImpl_->getName();
        }
        
        /*!
            Sets the value attribute in the SystemHandle Class.
            \param sysValue which will be set to the current SystemHandle.
        */
        void setValue(double sysValue){
            pImpl_->setValue(sysValue);
        }

        /*!
            Returns the value attribute in the SystemHandle Class.
            \return double - the content value attribute.  
        */
        double getValue() const{
            return pImpl_->getValue();
        }

        /*!
            This is the overloaded "+" operator for the SystemBody Class.
        */
        double operator+(const System& sys){
            if (this == &sys){
                return pImpl_->getValue() + pImpl_->getValue();
            }
            else{
                return pImpl_->operator+(sys);
            }
        }
            
        /*!
            This is the overloaded "+" operator for the SystemHandle Class.
        */
        double operator+(const double& valueSys){
            return pImpl_->operator+(valueSys);
        }

        /*!
            This is the overloaded "-" operator for the SystemHandle Class.
        */
        double operator-(const System& sys){
            if (this == &sys){
                return 0.0;
            }
            else{
                return pImpl_->operator-(sys);
            }
        }
        
        /*!
            This is the overloaded "-" operator for the SystemHandle Class.
        */
        double operator-(const double& valueSys){
            return pImpl_->operator-(valueSys);
        }

        /*!
            This is the overloaded "*" operator for the SystemHandle Class.
        */
        double operator*(const System& sys){
            if (this == &sys){
                return pImpl_->getValue() * pImpl_->getValue();
            }
            else{
                return pImpl_->operator*(sys);
            }
        }
        
        /*!
            This is the overloaded "*"" operator for the SystemHandle Class.
        */
        double operator*(const double& valueSys){
            return pImpl_->operator*(valueSys);
        }

        /*!
            This is the overloaded "/" operator for the SystemHandle Class.
        */
        double operator/(const System& sys){
            if (this == &sys){
                return 1;
            }
            else{
                return pImpl_->operator/(sys);
            }
        }
        
        /*!
            This is the overloaded "/" operator for the SystemHandle Class.
        */
        double operator/(const double& valueSys){
            return pImpl_->operator/(valueSys);
        }
};


double operator+(const double& valueSys, const System& sys);
double operator-(const double& valueSys, const System& sys);
double operator*(const double& valueSys, const System& sys);
double operator/(const double& valueSys, const System& sys);

#endif