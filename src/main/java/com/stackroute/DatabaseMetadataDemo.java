package com.stackroute;

import java.sql.*;

public class DatabaseMetadataDemo {

    public static void main(String[] args) {


        Connection connection;

        {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb", "root", "Root@123");
                DatabaseMetaData dbmd = connection.getMetaData();

                System.out.println("Database Name: " + dbmd.getUserName());
                System.out.println(" Database Driver Name: " + dbmd.getDriverName());
                System.out.println("Database Driver version: " + dbmd.getDriverVersion());
                System.out.println("Database product name:" + dbmd.getDatabaseProductName());

                connection.commit();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
