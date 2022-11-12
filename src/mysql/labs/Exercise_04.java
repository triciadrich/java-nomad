package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

import com.mysql.jdbc.Driver;
import mysql.examples.MySQLAccess;

import java.sql.*;

public class Exercise_04 {
    static Connection connection;
    static Statement statement;
    PreparedStatement preparedStatement;
    static ResultSet resultSet;


    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

//        createFlight();
//        queryFlight();
//        updateFlight();
//        deleteFlight();
//        createPass();
        queryPass();
        updatePass();
        queryPass();
        deletePass();

        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */
    }
    public static void createFlight() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");
        statement = connection.createStatement();
        int x = statement.executeUpdate("INSERT INTO airtravel.flights (date, destId,passId) VALUES (20230620, 2,2)");
        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();
                connection.close();
            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }

    public static void queryFlight() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");

            statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from airtravel.flights");
        while (resultSet.next()){
            System.out.println(resultSet.getInt("flightId"));
            System.out.println(resultSet.getString("date"));
            System.out.println(resultSet.getInt("destId"));
            System.out.println(resultSet.getInt("passId"));
        }
        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }

    public static void updateFlight(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");
            statement = connection.createStatement();
            int x = statement.executeUpdate("UPDATE airtravel.flights set date = 20230707 where flightId = 1");

        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();

            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }
    public static void deleteFlight(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");
            statement = connection.createStatement();
            int x = statement.executeUpdate("DELETE from airtravel.flights where flightId= 1");

        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();

                connection.close();

            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }

    public static void createPass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");
            statement = connection.createStatement();
            int x =statement.executeUpdate("INSERT INTO airtravel.passengers (first_name, last_name,birth_date, meal_pref) VALUES ('Bob', 'Adams', 19720202, 'Carnviore')");
        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();

                connection.close();

            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }

    public static void queryPass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from passengers");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("Id"));
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("birth_date"));
                System.out.println(resultSet.getString("meal_pref"));
            }
        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();

            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }

    public static void updatePass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                    "user=root&password=root" +
                    "&useSSL=false&allowPublicKeyRetrieval=true");
            statement = connection.createStatement();
            int x = statement.executeUpdate("UPDATE airtravel.passengers set meal_pref = 'vegan' where first_name = 'Wayne'");
        }catch (SQLException sqle){
            System.out.println("Exception occured");
            sqle.printStackTrace();
        }catch (ClassNotFoundException classe){
            System.out.println("Exception occured - driver not found on classpath");
            classe.printStackTrace();
        }finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();

            }catch (SQLException esql){
                esql.printStackTrace();
            }
        }
    }

    public static void deletePass(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/airtravel?" +
                "user=root&password=root" +
                "&useSSL=false&allowPublicKeyRetrieval=true");
        statement = connection.createStatement();
            int x = statement.executeUpdate("DELETE from airtravel.passengers where Id= 1");

    }catch (SQLException sqle){
        System.out.println("Exception occured");
        sqle.printStackTrace();
    }catch (ClassNotFoundException classe){
        System.out.println("Exception occured - driver not found on classpath");
        classe.printStackTrace();
    }finally {
        try {
            statement.close();
            resultSet.close();
            connection.close();

        }catch (SQLException esql){
            esql.printStackTrace();
        }
    }

    }

}
