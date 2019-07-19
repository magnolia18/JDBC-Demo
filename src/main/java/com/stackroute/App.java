package com.stackroute;

import java.sql.DatabaseMetaData;
import java.text.SimpleDateFormat;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception {
//
//      /*SimpleJdbcDemo class*/
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

        /*DatabaseMetaDataDemo class*/
        DatabaseMetadataDemo databaseMetadataDemoMainObj = new DatabaseMetadataDemo();
        databaseMetadataDemoMainObj.getDatabaseMetaData();

        /* JdbcBatchDemo class */
        JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
        jdbcBatchDemo.getJdbcBatchDemo();

        /* ResultSetMetaData class */
        ResultSetMetaData resultSetMetaData = new ResultSetMetaData();
        resultSetMetaData.getResultSetMetaData();
//
        /*JdbcTransactionDemo class */
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.getJdbcTransactionDemo();

//        /* RowSetDemo class */
//        RowSetDemo rowSetDemo = new RowSetDemo();
//        rowSetDemo.getRowSetDemo();
    }
}
