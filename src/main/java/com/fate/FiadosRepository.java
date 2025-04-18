package com.fate;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
}
