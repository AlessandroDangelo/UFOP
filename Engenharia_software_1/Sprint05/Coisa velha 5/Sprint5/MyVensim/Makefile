api_lib = -lmyvensim

all: lib tests
lib: lib.so
tests: tests-functional tests-unit

lib.so:
	g++ -shared -fPIC src/lib/*.cpp -o bin/libmyvensim.so -Wall

tests-functional:
	g++ test/functional/*.cpp -L./bin $(api_lib) -Wl,-rpath,bin -o bin/functional_tests.out

tests-unit:
	g++ test/unit/*.cpp -L./bin $(api_lib) -Wl,-rpath,bin -o bin/unit_tests.out	

clean:
	rm -f bin/*.so bin/*.o bin/*.out

run-tests:
	./bin/functional_tests.out

