package com.fate;

public class Main {
    public static void main(String[] args) {

        FiadoEntity fiado = new FiadoEntity(1, "Federico", 10);

        DbConnector connector = new DbConnector();

        FiadoRepository fiadoRepository = new FiadoRepository(connector);

        fiadoRepository.insert(fiado);

    }
}