package com.pruebas.interfaces;

import com.pruebas.interfaces.interfaces.IDefaultMethods;

public class Operaciones implements IDefaultMethods {

    @Override
    public float suma(int x, int y) {
        return x + y;
    }
}
