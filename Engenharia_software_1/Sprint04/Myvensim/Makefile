api_lib = bin/model.o bin/system.o bin/flow.o bin/unit_flow.o bin/unit_model.o bin/unit_system.o bin/mem_usage.o

all: lib tests
lib: model.o system.o flow.o unit_flow.o unit_model.o unit_system.o mem_usage.o
tests: tests-funcional tests-unit

model.o:
	g++ -c src/modelImpl.cpp -o bin/model.o -Wall

system.o:
	g++ -c src/systemImpl.cpp -o bin/system.o -Wall

flow.o:
	g++ -c src/flowImpl.cpp -o bin/flow.o -Wall

unit_flow.o:
	g++ -c test/unit/unit_flow.cpp -o bin/unit_flow.o -Wall

unit_model.o:
	g++ -c test/unit/unit_model.cpp -o bin/unit_model.o -Wall

unit_system.o:
	g++ -c test/unit/unit_system.cpp -o bin/unit_system.o -Wall

mem_usage.o:
	g++ -c test/unit/utils/mem_usage.cpp -o bin/mem_usage.o -Wall

tests-funcional:
	g++ test/funcional/main.cpp test/funcional/funcional_tests.cpp $(api_lib) -o bin/funcional_tests.out

tests-unit:
	g++ test/unit/main.cpp test/unit/unit_tests.cpp $(api_lib) -o bin/unit_tests.out

clean:
	rm -f bin/*.o bin/*.out

run:
	./bin/funcional_tests.out
	./bin/unit_tests.out