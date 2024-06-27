cmake_minimum_required(VERSION 3.14)
project(tp2)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(tp2
    BlocoMemoria.cpp
    BlocoMemoria.hpp
    endereco.cpp
    endereco.hpp
    geradorDeInstrucoes.cpp
    instrucao.cpp
    instrucao.hpp
    main.cpp
    MMU.cpp
    MMU.hpp
    teste_timer.cpp)
