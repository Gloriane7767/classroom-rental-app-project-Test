package com.gloriane.model.db;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    // JDBC connection properties
    public static void main(String[] args) {

        {
            try {
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/rental_app_db",
                        "root",
                        "@Gloriane--001"
                );
                IO.println("Database connection establised");
            } catch (SQLException e) {
                IO.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
// Add dependency
}


