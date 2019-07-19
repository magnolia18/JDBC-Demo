package com.stackroute;

import java.sql.*;

public class JdbcBatchDemo {

    /*Load and Register Driver*/
    public void JdbcBatchDemo()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*Fetch data using JdbcDemo*/
    public void getJdbcBatchDemo()
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb", "root", "Root@123");
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);
            statement.addBatch("insert into employee values(4,'Arshia',10,'F')");
            statement.executeBatch();

            System.out.println("New rows added.");

            /*Storing data into result set to display it later */
            ResultSet resultSet = statement.executeQuery("select * from employee");

            /*Printing the tabe data along with new rows added using Batch */
            while (resultSet.next())
            {
                System.out.println("Id: "+ resultSet.getInt(1) + " Name: " + resultSet.getString(2) + " Age: " + resultSet.getInt(3) + " Gender: " + resultSet.getString(4));
            }

            /* Closing the connection */
            connection.commit();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
