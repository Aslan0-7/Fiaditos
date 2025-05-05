package com.fate.injection;

import com.fate.injection.armas.Arma;
import com.fate.injection.armas.Pistola;
import com.fate.injection.guerreros.Guerrero;

public class Ejecutar {

    public static void main(String[] args) {

        Arma arma = new Pistola(); // Polimorfismo

        Guerrero guerreroCuchillero = new Guerrero(arma);
        guerreroCuchillero.luchar();
    }
}

// Herencia
// Interfaces