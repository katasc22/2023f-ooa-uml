package fr.epita.patients.tests;

import fr.epita.patients.datamodel.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileExtractionTest {


    public static void main(String[] args) throws IOException {
        Path currentFilePath = Path.of("patients-data-extraction/data/patients.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = Files.readAllLines(currentFilePath);
        System.out.println(lines);

        String line = lines.get(1);
        System.out.println(line);
        String[] parts = line.split(";");

        Patient patient = new Patient();
        patient.setHealthCareNumber(parts[0]);

        int insuranceId = Integer.parseInt(parts[5]);

        LocalDate today = LocalDate.of(2024, 02, 19);

        LocalDate.parse(parts[6], DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }
}
