package com.fate;

public class Main {
    public static void main(String[] args) {

        FiadoEntity fiado = new FiadoEntity(1, "Federico", 10);

        FiadoRepository fiadoRepository = new FiadoRepository();

        fiadoRepository.insert(fiado);

    }
}
