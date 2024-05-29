package com.pruebas.tiposGenericos;

import java.util.ArrayList;
import java.util.List;

public class GenericoNumberLista<T extends Number>{

    private List<T> lista;

    public GenericoNumberLista(){
        this.lista = new ArrayList<>();
    }

    public void printClase(T number){
        System.out.println("El número es de clase: " + number.getClass().getName());
    }

    public void addNumberToLista(T number){
        this.lista.add(number);
    }

    public List<T> getLista(){
        return lista;
    }

    public void printClaseLista(List<T> lista){
        for(T num: lista){
            this.printClase(num);
        }
    }

    public void printClaseLista(){
        this.printClaseLista(this.lista);
    }

}
