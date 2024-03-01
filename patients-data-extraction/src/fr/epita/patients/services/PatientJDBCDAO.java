package fr.epita.patients.services;

import fr.epita.patients.datamodel.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientJDBCDAO {

    public void create(Patient patient) throws PatientSaveException {
        try(Connection connection = DriverManager.getConnection("jdbc:h2:mem:whatever");) {
            connection.prepareStatement("CREATE TABLE PATIENTS(healthcareNumber int, lastName varchar, subscriptionDate date)").execute();
            PreparedStatement insert = connection.prepareStatement("INSERT INTO PATIENTS(healthcareNumber, lastName, subscriptionDate) values (?, ?, ?)");
            insert.setString(1, patient.getHealthCareNumber());
            insert.setString(2, patient.getLastName());
            insert.setDate(3, Date.valueOf(patient.getSubscriptionDate()));
            insert.execute();

        }catch (SQLException sqlException){
            throw new PatientSaveException(sqlException);
        }
    }


    List<Patient> readAll(){
        return new ArrayList<>();
    }

    Patient readOne(String id){

    }
}
