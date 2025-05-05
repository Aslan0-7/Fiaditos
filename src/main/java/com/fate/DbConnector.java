package com.fate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnector {
    String url = "jdbc:postgresql://localhost:5432/mydatabase";
    String user = "myuser";
    String password = "secret";

    public Connection getConnection() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("SI SE PUDO CONECTAAAAR");
            return conn;
        } catch (SQLException e) {
            System.out.println("No se pudo conectar :c");
            throw e;
        }
    }
}
