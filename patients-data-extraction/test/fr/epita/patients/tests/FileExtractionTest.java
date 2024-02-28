package fr.epita.patients.tests;

import fr.epita.patients.datamodel.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FileExtractionTest {


    public static void main(String[] args) throws IOException {
        Path currentFilePath = Path.of("patients-data-extraction/data/patients.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = Files.readAllLines(currentFilePath);
        System.out.println(lines);

        List<Patient> patients = new ArrayList<>();
        //data mapping
        //pat_num_HC;pat_lastname;pat_firstname;pat_address;pat_tel;pat_insurance_id;pat_subscription_date
        //"1256987452365";Martin;Bernard;Chatillon;"0106060606";2;01/10/2010
        for (String line : lines){
            String[] parts = line.split(";");
            Patient patient = extractPatient(parts);
            patients.add(patient);
        }

        List<Patient> patientsWithSteam = lines.stream()
                .map(s -> extractPatient(s.split(";")))
                .toList();


    }

    private static Patient extractPatient(String[] row) {
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
