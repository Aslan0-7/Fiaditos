package com.fate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public void delete(FiadoEntity fiado){
        try {
            String sql = "DELETE FROM fiados WHERE cliente = ?";
            Connection conn = dbConnector.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fiado.getCliente());
            stmt.executeUpdate();
            System.out.println("Se elimino a  "+ fiado.getCliente() + " de nuestra tiendita :C");

        } catch (SQLException e) {
            System.out.println("No se pudo eliminar al cliente");
            throw new RuntimeException(e);
        }
    }

    public void list(FiadoEntity fiado){
        try {
            String sql = "SELECT id, cliente FROM fiados";
            Connection conn = dbConnector.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String cliente = rs.getString("cliente");
                System.out.println("ID: " + id + "Nombre del cliente: " + cliente);
            }
        } catch (SQLException e) {
            System.out.println("No se pudo mostrar la lista de clientes :C");
            throw new RuntimeException(e);
        }
    }


}
