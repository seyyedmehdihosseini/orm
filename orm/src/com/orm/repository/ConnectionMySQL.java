package com.orm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

    private static final String url = "jdbc:mysql://localhost:3306/example";
    private static final String username = "root";
    private static final String password = "@Smh1376";
    private static Connection connection = null;

    // singleton designPattern
    static {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connect ... ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }


}
