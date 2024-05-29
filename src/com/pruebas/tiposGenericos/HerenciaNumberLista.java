package com.pruebas.tiposGenericos;

import java.util.ArrayList;
import java.util.List;

public class HerenciaNumberLista{

    private List<Number> lista;

    public HerenciaNumberLista(){
        this.lista = new ArrayList<>();
    }

    public void printClase(Number number){
        System.out.println("El número es de clase: " + number.getClass().getName());
    }

    public void addNumberToLista(Number number){
        this.lista.add(number);
    }

    public List<Number> getLista(){
        return lista;
    }

    public void printClaseLista(List<Number> lista){
        for(Number num: lista){
            this.printClase(num);
        }
    }

    public Number getPrimerElemento(){
        return lista.get(0);
    }

    public void printClaseLista(){
        this.printClaseLista(this.lista);
    }

}
