api:
	g++ -shared ./src/lib/systemImpl.cpp ./src/lib/flowImpl.cpp ./src/lib/modelImpl.cpp -o ./bin/libapi.so -L./bin -fpic -Wl,-rpath,bin

test_func: api
	g++ ./test/funcional/*.cpp -L./bin -lapi -o ./bin/funcional_tests -Wl,-rpath,bin

test_unit: api
	g++ ./test/unit/*.cpp -L./bin -lapi -o ./bin/unit_tests -Wl,-rpath,bin

clean:
	rm -f bin/*.o bin/*.so bin/funcional_tests bin/unit_tests

run_func:
	./bin/funcional_tests

run_unit:
	./bin/unit_tests