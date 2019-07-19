package com.stackroute;
import java.sql.*;
import java.sql.DriverManager;
import  javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

    public void RowSetDemo() throws Exception
    {
        /* Load and Register the Driver */
        Class.forName("com.mysql.cj.jdbc.Driver");

    }

    public void getRowSetDemo() throws Exception
    {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb","root", "Root@123");

        //Creating and executing Rowset
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/mdb");
        rowSet.setUsername("root");
        rowSet.setPassword("Root@123");

        //Passing Sql Query
        rowSet.setCommand("select * from employee");
        rowSet.execute();

        //Printing data using RowSet
        while(rowSet.next())
        {
            //Generating cursor Moved event
            System.out.println("-----------------------------------------");
            System.out.println("Id: "+ rowSet.getString(1));
            System.out.println("-----------------------------------------");
            System.out.println("Name: "+rowSet.getString(2));
            System.out.println("-----------------------------------------");
            System.out.println("Age: " + rowSet.getString(3));
            System.out.println("-----------------------------------------");
            System.out.println("Gender: "+rowSet.getString(4));

        }

        //Commit and Close the connection
        connection.commit();
        connection.close();
    }

}
