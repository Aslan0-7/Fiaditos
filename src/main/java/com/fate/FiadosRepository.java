package com.fate;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/***
 * This class is the responsible for the interaction with the database
 * It should:
 * 1. insert new fiados
 * 2. update fiados
 * 3. delete fiados
 * 4. list fiados
 * 5. update prices
 * 6.delete prices
 * 7. filter by client name
 * 8. filter by item
 */
public class FiadosRepository {
//Para no olvidarme: este codigo de abajito es para mantener y poder usar la conexion con mi base de datos
    private Connection conn;
    public FiadosRepository(Connection conn) {
        this.conn = conn;
    }
    public void addClient(Integer id , String cliente) throws SQLException {
        String sql = "INSERT INTO fiados(id, cliente) VALUES(?, ?)";
        try (PreparedStatement  pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, cliente);
            pstmt.executeUpdate();
            System.out.println("Se añadió el cliente " + cliente + " a la tiendita :D");
        }
    }

    public void deleteClient(String cliente) throws SQLException {
        String sql = "DELETE FROM fiados WHERE cliente = ?";
        try (PreparedStatement  pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cliente);
            pstmt.executeUpdate();

            System.out.println("Se elimino a: "+ cliente+ " de la tiendita porque no pagaba a tiempo :c");
        }
    }

    public void updateFiados (String cliente, String categoria, String producto, Integer cantidad,Double precioventa ) throws SQLException {
        String sql = "UPDATE fiados SET categoria = ?, producto = ?,cantidad = ?,precioventa = ?  where cliente= ?";
        try (PreparedStatement  pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, categoria);
            pstmt.setString(2, producto);
            pstmt.setInt(3, cantidad);
            pstmt.setDouble(4, precioventa);
            pstmt.setString(5, cliente);
            pstmt.executeUpdate();
            System.out.println("Se actualizaron los fiados de: " +cliente+ " en la tiendita \n"+"Categoria: "+ categoria + "\n"+"Producto: "+ producto+"\n"+"Cantidad: "+ cantidad+ "\n"+"Precio: "+ precioventa);
        }
    }


// Aqui intente hacer algo con lo que aprendi en mis clases

    public void añadirCliente () throws SQLException {
        String sql = "INSERT INTO fiados(id, cliente) VALUES(?, ?)";
        try (PreparedStatement  pstmt = conn.prepareStatement(sql)) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Igresa el id del cliente: "));
            String cliente = String.valueOf(JOptionPane.showInputDialog("Ingresa el nombre del cliente: "));
            pstmt.setInt(1, id);
            pstmt.setString(2, cliente);
            pstmt.executeUpdate();
            System.out.println("Se añadió el cliente " + cliente + " a la tiendita :D");
        }
    }
}
