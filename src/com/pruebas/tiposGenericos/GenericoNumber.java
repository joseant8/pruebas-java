package com.pruebas.tiposGenericos;

import java.util.List;

public class GenericoNumber<T extends Number>{

    private T numero;

    public GenericoNumber(T numero){

        this.numero = numero;

    }

    public T getNumero(){
        return this.numero;
    }

    public void printClase(){
        System.out.println("El número es de clase: " + numero.getClass().getName());
    }

}
