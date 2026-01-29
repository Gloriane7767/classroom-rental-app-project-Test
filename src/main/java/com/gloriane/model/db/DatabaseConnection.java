package com.gloriane.model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/rental_app_db";
    private static final String USER = "root";
    private static final String PASSWORD = "@Gloriane--001";

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // private constructor for Singleton
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    //Gets a JDBC Connection to the database. And @return a Connection object, @throws SQLException if connection fails
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Tests if we can connect to the database.

    public boolean testConnection() {
        try (Connection conn = getConnection()) {
            System.out.println("✅ Database connection successful!");
            System.out.println("Connected to: " + conn.getMetaData().getDatabaseProductName());
            return true;
        } catch (SQLException e) {
            System.err.println("❌ Database connection failed!");
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }

    // Closes a connection safely.
    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        boolean ok = db.testConnection();
        System.out.println("Connection test result: " + ok);
    }
}
