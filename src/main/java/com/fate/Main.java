package com.fate;

import java.sql.*;

public class Main {
        public static void main(String[] args) throws SQLException {
            String url = "jdbc:postgresql://db.yjuhnyxsbvfaynccywxr.supabase.co:5432/postgres";
            String user = "postgres";
            String password = "Batranca2025#";

            Connection conn = DriverManager.getConnection(url, user, password);

            try (Statement stmt = conn.createStatement();
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
                }

                /*try (Statement stmt3 = conn.createStatement()) {
                    stmt3.executeUpdate("INSERT INTO fiados(id, cliente) VALUES(55,'Kisame')");
                    stmt3.executeUpdate("INSERT INTO fiados(id, cliente) VALUES(56,'Mitsuki')");

                    System.out.println("Se añadieron nuevos clientes a la tiendita :D");

                }*/
            }

            try (Statement stmt3 = conn.createStatement()) {
                stmt3.executeUpdate("UPDATE fiados SET producto = 'atun' WHERE cliente = 'Aslan'");
                stmt3.executeUpdate("UPDATE fiados SET precioventa = 2.50 WHERE producto = 'atun'");
                stmt3.executeUpdate("UPDATE fiados SET cantidad = 4 WHERE producto = 'atun'");
                stmt3.executeUpdate("DELETE FROM fiados WHERE id=112");

                System.out.println("Un cliente fue eliminado de la tiendita :c");

            }
//hola :D
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
        }
}
