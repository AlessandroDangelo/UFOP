cmake_minimum_required(VERSION 3.14)
project(TP2_GRUPO)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(TP2_GRUPO
        blocoMemoria.cpp
        blocoMemoria.hpp
        endereco.cpp
        endereco.hpp
        instrucao.cpp
        instrucao.hpp
        main.cpp
        maquina.cpp
        maquina.hpp
        mmu.cpp
        mmu.hpp)
