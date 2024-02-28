package fr.epita.patients.services;

import fr.epita.patients.datamodel.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PatientCSVExtractionService {

    public List<Patient> read() throws PatientExtractionException {
        Path currentFilePath = Path.of("patients-data-extraction/data/patients.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(currentFilePath);
        } catch (IOException e){
            throw new PatientExtractionException(e);
        }
        List<Patient> patients = new ArrayList<>();
        for (String line : lines){
            String[] parts = line.split(";");
            Patient patient = extractPatient(parts);
            patients.add(patient);
        }
        return patients;
    }

    public void update(List<Patient> patients) throws PatientExtractionException {
        Path currentFilePath = Path.of("patients-data-extraction/data/patients.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = new ArrayList<>();

        List<Patient> patients = new ArrayList<>();
        for (String line : lines){
            String[] parts = line.split(";");
            Patient patient = extractPatient(parts);
            patients.add(patient);
        }
        try {
            Files.writeString(currentFilePath, "", StandardOpenOption.WRITE);
        } catch (IOException e){
            throw new PatientExtractionException(e);
        }
    }


    private static Patient extractPatient(String[] row) {
        //data mapping
        //pat_num_HC;pat_lastname;pat_firstname;pat_address;pat_tel;pat_insurance_id;pat_subscription_date
        //"1256987452365";Martin;Bernard;Chatillon;"0106060606";2;01/10/2010
        Patient patient = new Patient();
        patient.setHealthCareNumber(row[0]);
        patient.setLastName(row[1]);
        patient.setFirstName(row[2]);
        patient.setAddress(row[3]);
        patient.setPhoneNumber(row[4]);
        patient.setInsuranceId(Integer.parseInt(row[5]));
        //LocalDate today = LocalDate.of(2024, 02, 19);
        LocalDate subscriptionDate = LocalDate.parse(row[6], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        patient.setSubscriptionDate(subscriptionDate);
        return patient;
    }

}
