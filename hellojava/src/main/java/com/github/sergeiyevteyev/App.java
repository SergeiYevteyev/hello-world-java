package com.github.sergeiyevteyev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        String connectionUrl = "jdbc:sqlserver://:1433;databaseName=sls;user=;password=;";

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.println("Connecting to SQL Server ... ");            
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("Done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}
