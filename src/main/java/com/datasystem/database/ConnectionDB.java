package com.datasystem.database;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionDB {

    private static Connection connection;

    private static final String dbURL = "jdbc:mysql://localhost:3306/datasystem";
    private static final String user = "root";
    private static final String pwd = "";

    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(dbURL, user, pwd);
    }
}
