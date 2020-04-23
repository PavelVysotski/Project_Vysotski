package com.company.base.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;

    private static final String DB_URL = "jdbc:postgresql://localhost:5433/computers_base";
    private static final String USER = "postgres";
    private static final String PASS = "130101AP1wx826";

    static {
        try {
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

}
