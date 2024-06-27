all: instrucao.o BlocoMemoria.o endereco.o MMU.o main.cpp
		g++ -o main main.cpp instrucao.o BlocoMemoria.o endereco.o MMU.o

instrucao.o: instrucao.cpp
		g++ -o instrucao.o -c instrucao.cpp

BlocoMemoria.o: BlocoMemoria.cpp
		g++ -o BlocoMemoria.o -c BlocoMemoria.cpp

endereco.o: endereco.cpp
		g++ -o endereco.o -c endereco.cpp

MMU.o: MMU.cpp
		g++ -o MMU.o -c MMU.cpp

clean:
	 	rm -f *.o

run:
		./main
