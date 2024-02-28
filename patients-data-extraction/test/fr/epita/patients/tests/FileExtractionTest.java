package fr.epita.patients.tests;

import fr.epita.patients.datamodel.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileExtractionTest {


    public static void main(String[] args) throws IOException {
        Path currentFilePath = Path.of("patients-data-extraction/data/patients.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = Files.readAllLines(currentFilePath);
        System.out.println(lines);

        List<Patient> patientList = new ArrayList<>();
        lines.remove(0);

        for (String line : lines) {
            String[] parts = line.split(";");
            String patientHCNr = parts[0];
            String lastname = parts[1];
            String firstname= parts[2];
            String address= parts[3];
            String tel = parts[4];
            String insuranceID= parts[5];

            //String[] dateParts = parts[6].split("/");

            LocalDate subscriptionDate = LocalDate.parse(parts[6], DateTimeFormatter.ofPattern("dd/MM/yyyy")); //OR: LocalDate.of(Integer.parseInt(dateParts[2]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[0]));

            patientList.add(new Patient(patientHCNr,lastname,firstname,address, tel,insuranceID,subscriptionDate));
        }

        for (Patient p : patientList){
            System.out.println(p.toString());
        }
    }
}
