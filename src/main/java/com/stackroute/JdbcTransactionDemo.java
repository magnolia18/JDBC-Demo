/*A simple demo on Transaction management using Statement*/
package com.stackroute;

import java.sql.*;
import java.sql.Connection;

public class JdbcTransactionDemo {

    public void JdbcTransactionDemo() throws Exception
    {
        /*Load and Register the Driver at time of object creation*/
            Class.forName("com.mysql.cj.jdbc.Driver");
    }

    public void getJdbcTransactionDemo() throws Exception
    {
        Connection connection;
        /*Get Connected to DB using Driver Manager*/
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb", "root", "Root@123");

        /*Making AutoCommit to false*/
        connection.setAutoCommit(false);

        Statement statement  = connection.createStatement();
        statement.executeUpdate("insert into employee values(5,'Zoha',5,'F')");

        /*Storing data in ResultSet from Statement*/
        ResultSet resultSet = statement.executeQuery("select * from employee");


        /*Printing values in the ResultSet which are updated using Transaction*/
        while (resultSet.next())
        {
            System.out.println("Id: " + resultSet.getInt(1)+ " Name: "+ resultSet.getString(2)+" Age: "+resultSet.getInt(3)+" Gender: "+resultSet.getString(4));
        }

        connection.commit();
        connection.close();
    }

}
