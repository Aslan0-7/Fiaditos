package com.fate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        FiadoEntity fiado = new FiadoEntity(2, "Franchesca", 10);
//        DbConnector connector = new DbConnector();
//        FiadoRepository fiadoRepository = new FiadoRepository(connector);


//        fiadoRepository.insert(fiado);

        System.out.println("===== Sistema de Fiaditos ====== ");
        System.out.println("[1] Agregar Cliente");
        System.out.println("[2] Eliminar Cliente");
        System.out.println("[4] Listar Clientes");
        System.out.println("[5] Cerrar Sistema");
        System.out.println("Ingrese una opcion: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());

        System.out.println("La opcion es " + opcion);

        // while (opcion != 5)
        // opcion < 1 || opcion > 5: no exixste la opcion, ingresa de nuevo.

    }
}