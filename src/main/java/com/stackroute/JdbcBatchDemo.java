package com.stackroute;

import java.sql.*;

public class JdbcBatchDemo {
    public static void main(String[] args) {



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb", "root", "Root@123");
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);

            statement.addBatch("insert into employee values(4,'Arshia',10,'F')");
            statement.executeBatch();

            connection.commit();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("New rows added.");



    }
}
