package fr.epita.patients.tests;

import java.sql.*;

public class JDBCTestH2 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:whatever");
        connection.prepareStatement("CREATE TABLE PATIENTS(healthcareNumber int, lastName varchar, subscriptionDate date)").execute();
        connection.prepareStatement("INSERT INTO PATIENTS(healthcareNumber, lastName, subscriptionDate) values (123, 'toto', '2023-05-17')").execute();
        ResultSet resultSet = connection.prepareStatement("SELECT lastName FROM PATIENTS").executeQuery();
        while (resultSet.next()){
            System.out.println( resultSet.getString("lastName"));
        }
    }
}
