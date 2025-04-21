package com.fate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class DbConnector {
    String url = "jdbc:postgresql://db.yjuhnyxsbvfaynccywxr.supabase.co:5432/postgres";
    String user = "postgres";
    String password = "Batranca2025#";

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
