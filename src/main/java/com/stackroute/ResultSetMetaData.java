package com.stackroute;
import java.sql.*;

public class ResultSetMetaData {

    public void ResultSetMetaData()
    {
        /* Load and Register the driver */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }

    public void getResultSetMetaData()
    {
        Connection connection;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb", "root", "Root@123");

            PreparedStatement preparedStatement = connection.prepareStatement("Select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            System.out.println("-------------------------------------------------------------");
            System.out.println("Name of the Table: " + resultSetMetaData.getTableName(1));
            System.out.println("-------------------------------------------------------------");

            //System.out.println("Schema Name: "+resultSetMetaData.getSchemaName(2));

            System.out.println("Total number of columns: "+ resultSetMetaData.getColumnCount());
            System.out.println("-------------------------------------------------------------");

            System.out.println("Name of the column 2: "+resultSetMetaData.getColumnName(2));
            System.out.println("-------------------------------------------------------------");

            System.out.println("Type of the column 2: "+resultSetMetaData.getColumnTypeName(2));

            System.out.println("-------------------------------------------------------------");

        }
        catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
