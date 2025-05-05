package com.fate.injection.guerreros;

import com.fate.injection.armas.Arma;

public class Guerrero {

    private Arma armaGuerrero;

    // constructores
    public Guerrero(Arma arma) {
        this.armaGuerrero = arma; // injeccion de dependencias
    }

    public void luchar() {
        this.armaGuerrero.usar();
    }

}
