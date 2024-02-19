package fr.epita.patients;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileExtractionsTest {


    public static void main (String[] args) {

        try {
            List<String> lines = Files.readAllLines(Path.of("datahandling/data/patients.csv"));
            System.out.println("Looking at this location: "+Path.of("data/patients"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
