package fr.epita.patients.tests;

import java.sql.*;

public class JDBCTestH2 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:randomName");
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE PATIENTS(healthcareNumber int, lastName varchar, subscriptionDate date)");
        preparedStatement.execute();


    }
}
