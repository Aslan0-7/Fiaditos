package com.fate.injection.armas;

public class Pistola implements Arma {
    @Override
    public void usar() {
        System.out.println("DISPARANDO 🔫!!");
    }
}
