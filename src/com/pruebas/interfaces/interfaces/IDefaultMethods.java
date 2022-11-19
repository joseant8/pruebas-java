package com.pruebas.interfaces.interfaces;

public interface IDefaultMethods {

    float suma(int x, int y);

    default float resta(int x, int y){
        return x - y;
    }

    default float mult(int x, int y){
        return x * y;
    }

    default float div(int x, int y){
        return x / y;
    }

}
