api:
	@cd src/lib && g++ -shared -I ../include flowImpl.cpp modelImpl.cpp systemImpl.cpp -o C:/Users/aless/OneDrive/Documentos/UFOP/EngenhariadeSoftware/Sprint05/Myvensim/bin/myVensim.dll
	
product:
	@cd src && g++ -I ../include main.cpp -L ../bin -l myVensim -o C:/Users/aless/OneDrive/Documentos/UFOP/EngenhariadeSoftware/Sprint05/Myvensim/bin/product.exe

functional:
	@cd bin && g++ -I ../include ../test/funcional/*.cpp -L ../bin -l myVensim -o C:/Users/aless/OneDrive/Documentos/UFOP/EngenhariadeSoftware/Sprint05/Myvensim/bin/functional.exe

unit:
	@cd bin && g++ -I ../include ../test/unit/*.cpp -L ../bin -l myVensim -o C:/Users/aless/OneDrive/Documentos/UFOP/EngenhariadeSoftware/Sprint05/Myvensim/bin/unit.exe

runProduct:
	@echo -e "\033[2J\033[;H"
	@make product
	@cd bin && product.exe
	@make clean

runFunctional:
	@echo -e "\033[2J\033[;H"
	@make API
	@make functional
	@cd bin && functional.exe
	@make clean

runUnit:
	@echo -e "\033[2J\033[;H"
	@make unit
	@cd bin && unit.exe
	@make clean

go:
	@make runProduct

clean:
	@cd C:/Users/aless/OneDrive/Documentos/UFOP/EngenhariadeSoftware/Sprint05/Myvensim/bin && del *.exe /q
	@cd C:/Users/aless/OneDrive/Documentos/UFOP/EngenhariadeSoftware/Sprint05/Myvensim/bin && del *.dll /q 