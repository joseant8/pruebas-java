package com.pruebas;

import com.pruebas.interfaces.interfaces.InterfazFuncional;
import com.pruebas.interfaces.Operaciones;
import com.pruebas.tiposGenericos.Generico;
import com.pruebas.tiposGenericos.GenericoNumber;
import com.pruebas.tiposGenericos.GenericoNumberLista;
import com.pruebas.tiposGenericos.HerenciaNumberLista;

public class Main {

    public static void main(String[] args) {

        //pruebasInterfaces();
        //pruebasGenerico();
        pruebasGenericoLista();
        //pruebasHerenciaLista();

    }

    public static void pruebasInterfaces() {

        InterfazFuncional suma = (x, y) -> x + y;
        System.out.println(suma.operacion(1,2));

        Operaciones op = new Operaciones();
        System.out.println(op.suma(3,5));
        System.out.println(op.mult(3,3));

    }

    public static void pruebasGenerico(){

        Generico<String> generico1 = new Generico<>("Hola");
        Generico<Integer> generico2 = new Generico<>(1);
        generico1.printGenerico();
        generico2.printGenerico();

        GenericoNumber<Integer> genInteger = new GenericoNumber<>(1);
        GenericoNumber<Double> genDouble = new GenericoNumber<>(2.0);
        genInteger.printClase();
        genDouble.printClase();


    }

    public static void pruebasGenericoLista(){
        GenericoNumberLista<Integer> lista = new GenericoNumberLista<>();
        lista.addNumberToLista(1);
        lista.addNumberToLista(2);
        lista.printClaseLista();
    }

    public static void pruebasHerenciaLista(){
        HerenciaNumberLista lista = new HerenciaNumberLista();
        lista.addNumberToLista(1);
        lista.addNumberToLista(2);
        lista.addNumberToLista(3.0);
        lista.printClaseLista();

        lista.printClase(lista.getPrimerElemento());
    }
}
