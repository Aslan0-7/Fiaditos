package com.fate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        DbConnector connector = new DbConnector();
        FiadoRepository metodos = new FiadoRepository(connector);

        // while (opcion != 5)
        // opcion < 1 || opcion > 5: no exixste la opcion, ingresa de nuevo.

        while (opcion != 4) {
            System.out.println("===== Sistema de Fiaditos ====== ");
            System.out.println("[1] Agregar Cliente");
            System.out.println("[2] Eliminar Cliente");
            System.out.println("[3] Listar Clientes");
            System.out.println("[4] Cerrar Sistema");
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                System.out.println("Hola!! Vamos a añadir un cliente a la tiendita :D ");
                System.out.println("Ingresa el id del cliente: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Ahora ingresa el nombre del cliente: ");
                String cliente =  scanner.nextLine();
                FiadoEntity fiado = new FiadoEntity(id, cliente);
                metodos.insert(fiado);

            }else if (opcion == 2) {
                System.out.println("Hola...Vamos a eliminar a un cliente de la tiendita :C");
                System.out.println("Ingresa el id del cliente: ");
                int id= Integer.parseInt(scanner.nextLine());
                System.out.println("Ahora ingresa el nombre del cliente: ");
                String cliente= scanner.nextLine();
                FiadoEntity fiado = new FiadoEntity(id, cliente);
                metodos.delete(fiado);

            }else if (opcion == 3) {
                System.out.println("Hola de nuevo! Voy a enseñarte la lista de los clientes de nuestra tiendita :)");
                metodos.list();

            }else if (opcion == 4) {
                System.out.println("Adios! Gracias por usar el programa de fiaditos :D ");
                break;
            }else{
                System.out.println("Oye te equivocaste, tienes que elegir una opcion valida.Intentalo de nuevo :D");
            }

        }

    }
}