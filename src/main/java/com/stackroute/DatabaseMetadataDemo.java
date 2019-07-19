package com.stackroute;

import java.sql.*;

public class DatabaseMetadataDemo {

   public void DatabaseMetadataDemo() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();

       }
   }


        Connection connection;
   public void getDatabaseMetaData()
   {


            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb", "root", "Root@123");
                DatabaseMetaData dbmd = connection.getMetaData();
                connection.setAutoCommit(false);

                System.out.println("Database Name: " + dbmd.getUserName());
                System.out.println(" Database Driver Name: " + dbmd.getDriverName());
                System.out.println("Database Driver version: " + dbmd.getDriverVersion());
                System.out.println("Database product name:" + dbmd.getDatabaseProductName());

                connection.commit();
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }


    }
}
