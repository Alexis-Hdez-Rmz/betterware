package com.betterware.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtils { private static Connection connection;

    public static Connection connectToDatabase(String username, String password) {
        try {
            String url = "jdbc:sqlserver://34.82.83.88;" +
                    "databaseName=BN3Product;" +
                    "encrypt=optional;trustServerCertificate=false";

            connection = DriverManager.getConnection(url, username, password);
            // System.out.println("Connected to the database succesgisfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(query);

            //  closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }


    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
