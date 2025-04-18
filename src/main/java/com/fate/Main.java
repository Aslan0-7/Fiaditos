package com.fate;

import java.sql.*;

/*
 * TAREA. Implementar los metodos en FiadosRepository para insertar un nuevo cliente,
 * mover el codigo para insertar a esa clase y usarla desde main
 */

/**
 * PARA PUSHEAR. Primero commit, luego Push
 * PARA ACTUALIZAR REPO LOCAL: Primero actualizar todo (fetch), y luego hacer update al repo local.
 */
// TODO: Implement Fiados Respository
public class Main {
        public static void main(String[] args) throws SQLException {

            String url = "jdbc:postgresql://db.yjuhnyxsbvfaynccywxr.supabase.co:5432/postgres";
            String user = "postgres";
            String password = "Batranca2025#";

            Connection conn = DriverManager.getConnection(url, user, password);

            FiadosRepository metodos = new FiadosRepository(conn);
            //metodos.addClient(111, "Franchesca");
            //metodos.deleteClient("Haziz");

            //metodos.añadirCliente();

            metodos.updateFiados("Francheca", "bebidas", "CocaCola 1L",4,4.50);



            /* try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM fiados")) {

                while (rs.next()) {
                    Integer id = rs.getInt("id");
                    String cliente = rs.getString("cliente");
                    System.out.println("ID: " + id + " Nombre del cliente: " + cliente);
                }

                try (Statement stmt2 = conn.createStatement();
                     ResultSet rs2 = stmt2.executeQuery("SELECT cliente, estado FROM fiados WHERE estado = 'Fiado'")) {

                    while (rs2.next()) {
                        String cliente = rs2.getString("cliente");
                        String estado = rs2.getString("estado");

                        System.out.println("El estado del cliente  " + cliente + " es : " + estado);
                    }
                }*/


/*
            try (Statement stmt4 = conn.createStatement()) {
                stmt4.executeUpdate("UPDATE fiados SET total = precioventa * cantidad");
                ResultSet rs3 = stmt4.executeQuery("SELECT cliente,producto,total FROM fiados WHERE cliente = 'Aslan' ");
                while (rs3.next()) {
                    String cliente = rs3.getString("cliente");
                    String producto = rs3.getString("producto");
                    Float total = rs3.getFloat("total");
                    System.out.println(cliente + " compro: " + producto + " va a pagar: " + total);
                }
            }
        }*/

   }
}

// New comentario