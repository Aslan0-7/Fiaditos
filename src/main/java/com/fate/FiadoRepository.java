package com.fate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FiadoRepository {

    private DbConnector dbConnector;

    public FiadoRepository(DbConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public void insert(FiadoEntity fiado) {
        try  {
            String sql = "INSERT INTO fiados(id, cliente) VALUES(?, ?)";
            Connection conn = dbConnector.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, fiado.getId());
            pstmt.setString(2, fiado.getCliente());
            pstmt.executeUpdate();
            System.out.println("Se añadió el cliente " + fiado.getCliente() + " a la tiendita :D");
        } catch (SQLException e) {
            System.out.println("Ocurrio un error");
            throw new RuntimeException(e);
        }

    }
}
