package se.lexicon.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/todoit";
    private static String JDBC_USERNAME = "root";
    private static String JDBC_PASSWORD = "root";

    public static void set_url(String url)
    {
        JDBC_URL =  url;
    }
    public static void set_username(String username)
    {
        JDBC_USERNAME = username;
    }
    public static void set_password(String password)
    {
        JDBC_PASSWORD = password;
    }

    public static Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL , JDBC_USERNAME, JDBC_PASSWORD);
        }catch(SQLException e){
            //System.out.println("Cant connect to " + JDBC_URL);
        }
        return connection;
    }
}