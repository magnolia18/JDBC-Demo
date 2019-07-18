package com.stackroute;

import java.text.SimpleDateFormat;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        DatabaseMetadataDemo databaseMetadataDemo = new DatabaseMetadataDemo();
        System.out.println("--------------------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println("--------------------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println("--------------------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println("--------------------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("Alisha", "F");
        System.out.println("--------------------------------------------------------------");

    }
}
