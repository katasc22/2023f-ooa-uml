package fr.epita.patients.tests;

import fr.epita.patients.datamodel.Patient;

import java.sql.*;
import java.time.LocalDate;

public class JDBCTestH2 {

    public static void main(String[] args) throws SQLException {
        Patient patient = new Patient();
        patient.setHealthCareNumber("1234");
        patient.setLastName("toto");
        patient.setSubscriptionDate(LocalDate.of(2023,5, 17));

        Connection connection = DriverManager.getConnection("jdbc:h2:mem:whatever");
        createPatient(patient, connection);
        ResultSet resultSet = connection.prepareStatement("SELECT lastName FROM PATIENTS").executeQuery();


        while (resultSet.next()){
            System.out.println( resultSet.getString("lastName"));
        }
    }

    private static void createPatient(Patient patient, Connection connection) throws SQLException {
        connection.prepareStatement("CREATE TABLE PATIENTS(healthcareNumber int, lastName varchar, subscriptionDate date)").execute();
        PreparedStatement insert = connection.prepareStatement("INSERT INTO PATIENTS(healthcareNumber, lastName, subscriptionDate) values (?, ?, ?)");
        insert.setString(1, patient.getHealthCareNumber());
        insert.setString(2, patient.getLastName());
        insert.setDate(3, Date.valueOf(patient.getSubscriptionDate()));
        insert.execute();
    }
}
