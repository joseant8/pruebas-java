package com.pruebas.tiposGenericos;

import java.util.List;

public class Generico <T>{

    private T generico;

    public Generico(T generico){
        this.generico = generico;
    }

    public void printGenerico(){
        System.out.println(generico);
    }

    public void printGenerico2(T objeto){
        System.out.println(objeto);
    }

    public static void printGenericoStatic(List<?> ListaGenerico){
        System.out.println("Primer elemento: " + ListaGenerico.get(0));
    }
}
