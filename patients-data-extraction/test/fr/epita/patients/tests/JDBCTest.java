package fr.epita.patients.tests;

import java.sql.*;

public class JDBCTest {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_data","root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT surname, firstname, address, zipcode FROM members");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String surname = resultSet.getString("surname");
            String firstname = resultSet.getString("firstname");
            String address = resultSet.getString("address");
            String zipcode = resultSet.getString("zipcode");
            System.out.println("surname: " + surname +", firstname: "+ firstname);
        }

    }
}
