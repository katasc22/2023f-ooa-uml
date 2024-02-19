package fr.epita.patients.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileExtractionTest {


    public static void main(String[] args) throws IOException {
        Path currentFilePath = Path.of("patients-data-extraction/data/patients.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = Files.readAllLines(currentFilePath);
        System.out.println(lines);
    }
}
