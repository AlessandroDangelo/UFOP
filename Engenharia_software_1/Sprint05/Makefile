# Define o compilador que será utilizado
CC = g++

# Define as opções de compilação
CFLAGS = -Wall -std=c++11 -I./src/include -fpic

# Define as opções de linking
LDFLAGS = -shared -L./bin -Wl,-rpath,bin

# Define o nome da biblioteca a ser gerada
LIBRARY_NAME = libapi.so

# Define os arquivos .cpp que serão compilados para a biblioteca
LIBRARY_SOURCES = $(wildcard ./src/lib/*.cpp)

# Define o diretório onde será gerada a biblioteca
LIBRARY_OUTPUT_DIR = ./bin

# Define o caminho completo da biblioteca a ser gerada
LIBRARY_OUTPUT_PATH = $(LIBRARY_OUTPUT_DIR)/$(LIBRARY_NAME)

# Define os arquivos .cpp que serão compilados para o executável principal
MAIN_SOURCES = ./src/main.cpp

# Define o nome do executável principal
MAIN_NAME = myvensim

# Define o diretório onde será gerado o executável principal
MAIN_OUTPUT_DIR = ./bin

# Define o caminho completo do executável principal
MAIN_OUTPUT_PATH = $(MAIN_OUTPUT_DIR)/$(MAIN_NAME)

# Define os arquivos .cpp que serão compilados para os testes funcionais
FUNC_TEST_SOURCES = $(wildcard ./test/funcional/*.cpp)

# Define o nome do arquivo da biblioteca a ser linkado nos testes funcionais
FUNC_TEST_LIBRARY = api

# Define o diretório onde será gerado o executável dos testes funcionais
FUNC_TEST_OUTPUT_DIR = ./bin

# Define o caminho completo do executável dos testes funcionais
FUNC_TEST_OUTPUT_PATH = $(FUNC_TEST_OUTPUT_DIR)/funcional_tests

# Define os arquivos .cpp que serão compilados para os testes unitários
UNIT_TEST_SOURCES = $(wildcard ./test/unit/*.cpp)

# Define o nome do arquivo da biblioteca a ser linkado nos testes unitários
UNIT_TEST_LIBRARY = api

# Define o diretório onde será gerado o executável dos testes unitários
UNIT_TEST_OUTPUT_DIR = ./bin

# Define o caminho completo do executável dos testes unitários
UNIT_TEST_OUTPUT_PATH = $(UNIT_TEST_OUTPUT_DIR)/unit_tests

# Define a lista de todos os objetos a serem criados
OBJECTS = $(LIBRARY_SOURCES:.cpp=.o)

# Define as regras para a compilação da biblioteca
$(LIBRARY_OUTPUT_PATH): $(OBJECTS)
	@mkdir -p $(LIBRARY_OUTPUT_DIR)
	$(CC) $(LDFLAGS) -o $@ $^ -l$(FUNC_TEST_LIBRARY) -l$(UNIT_TEST_LIBRARY)

# Define a regra para a compilação dos objetos
%.o: %.cpp
	$(CC) $(CFLAGS) -c -o $(LIBRARY_OUTPUT_DIR)/$@ $<

# Define a regra para a compilação do executável principal
$(MAIN_OUTPUT_PATH): $(MAIN_SOURCES)
	@mkdir -p $(MAIN_OUTPUT_DIR)
	$(CC) $(CFLAGS) $< -o $@ -L./bin -Wl,-rpath,bin -l$(LIBRARY_NAME)

# Define a regra para a compilação dos testes funcionais
$(FUNC_TEST_OUTPUT_PATH): $(FUNC_TEST_SOURCES) $(LIBRARY_OUTPUT_PATH)
	@mkdir -p $(FUNC_TEST_OUTPUT_DIR)
	$(CC) $(CFLAGS) -o $@ $

# regra para compilar os testes unitários
bin/test_unit: $(OBJS) $(UNIT_OBJS)
	$(CXX) $(CXXFLAGS) -o $@ $^ $(LDFLAGS) $(LDLIBS)


bin/test_funcional: $(OBJS) $(FUNC_OBJS)
	$(CXX) $(CXXFLAGS) -o $@ $^ $(LDFLAGS) $(LDLIBS)

# regra para rodar os testes unitários
run_unit:
	./bin/test_unit

# regra para rodar os testes funcionais
run_funcional:
	./bin/test_funcional