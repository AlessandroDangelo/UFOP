#include <cstdlib>
#include <iostream>
#include <cstdlib>

#include "..\include\Modelo.h"
#include "..\include\SistemaImpl.h"

using namespace std;

class FluxoLog:public FluxImpl{
   public:
    FluxoLog( string  id ):FluxImpl(id){};
    //FluxoLog(System* ori,System* des):FluxImpl(ori,des){};
    float execute(){
          double q = targetSys_->getValue();
          return q*(0.3*(1-(q/70)));;
    }    
};

class FluxoExp:public FluxImpl{
  public:
   FluxoExp( string  id ):FluxImpl(id){};
   //FluxoExp(System *ori,System *des):FluxImpl(ori,des){};
   float execute(){
         return targetSys_->getValue()*0.3;
   }      
};

#define DEBUGING
#ifdef DEBUGING
    int numHandleCreated = 0;
	int numHandleDeleted = 0;
	int numBodyCreated = 0;
	int numBodyDeleted = 0;
#endif

int main(int argc, char *argv[])
{
    // Apenas a implementacao da classe "Flux" precisa ser conhecida na
    // fase de "cria��o de objetos", pois o usu�rio precisa implementar 
    // v�rios tipos de fluxo. Ent�o, o m�dulo de cria��o de objetos precisa
    // conhecer os fluxos implementados pelo usu�rio.No entanto, nenhuma outra 
    // implementa��o precisa ser conhecida por qq outro m�dulo.
    
    // Cria modelo
    Model& m = createModel("Modelo de Pop.");      
    Flux& f1 = m.createFlux( new FluxoLog("nascimento") );    

    // USANDO REFERENCIAS PARA INTERFACE (CLASSE ABSTRATA)
    //System& s1 = m.createSystem("populacao",10.0);
    //System& s2 = m.createSystem("Teste", 7.90)   ;
    //cout << "s1: " << s1.getName() << ", s2: " <<  s2.getName() << endl;
    //s1 = s2;  // nao funciona pq s1 � uma referencia, portanto nao pode ser redefinida
    //cout << "s1: " << s1.getName() << ", s2: " <<  s2.getName() << endl;    
    
    // USANDO PONTEIROS PARA INTERFACE (CLASSE ABSTRATA)
    System* s1 = &m.createSystem("populacao",10.0);
    System* s2 = &m.createSystem("Teste", 7.90)   ;
    cout << "s1: " << s1->getName() << ", s2: " <<  s2->getName() << endl;
    //s1 = s2;
    *s1 = *s2;
    cout << "s1: " << s1->getName() << ", s2: " <<  s2->getName() << endl;    
    cout << "s1: " << s1 << ", s2: " <<  s2 << endl;    
    
    
    // Fa�a o teste COM e SEM as chaves abaixo
{
    // USANDO OBJETOS HANDLES (DELEGA��O)
    SystemHandle s3("tiago", 7), s4("antonio", 8);
    cout << "s3: " << s3.getName() << ", s2: " <<  s4.getName() << endl;
    s3 = s4;  // comente esta linha e veja que o resultado muda
    cout << "s3: " << s4.getName() << ", s2: " <<  s4.getName() << endl;        
	s3 = s3;
	cout << "s3: " << s4.getName() << ", s2: " <<  s4.getName() << endl;        
}   
    // Monta Modelo
    //m.setTarget(f1, s1);
    m.setTarget(f1, *s1);
    
    // executa o modelo
    m.execute(0,30,1);
    
    // imprime relatorio
    //cout << s1.getValue() << endl;
    cout << s1->getValue() << endl;
    cout << "Created handles: "  << numHandleCreated << endl;
    cout << "Deleted handles: "  << numHandleDeleted << endl;    
    cout << "Created bodies: "  << numBodyCreated << endl;
    cout << "Deleted bodies: "  << numBodyDeleted << endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
