package com.pruebas;

import com.pruebas.interfaces.interfaces.InterfazFuncional;
import com.pruebas.interfaces.Operaciones;

public class Main {

    public static void main(String[] args) {

        pruebasInterfaces();

    }

    public static void pruebasInterfaces() {

        InterfazFuncional suma = (x, y) -> x + y;
        System.out.println(suma.operacion(1,2));

        Operaciones op = new Operaciones();
        System.out.println(op.suma(3,5));
        System.out.println(op.mult(3,3));

    }
}
