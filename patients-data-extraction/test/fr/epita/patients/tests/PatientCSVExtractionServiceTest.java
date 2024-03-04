package fr.epita.patients.tests;

import fr.epita.patients.datamodel.Patient;
import fr.epita.patients.services.PatientCSVDAO;
import fr.epita.patients.services.PatientSaveException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PatientCSVExtractionServiceTest {


    public static void main(String[] args) throws Exception, PatientSaveException {
        readTest();
        updateTest();
    }

    private static void updateTest() throws PatientSaveException, Exception {
        PatientCSVDAO service = new PatientCSVDAO();
        List<Patient> patients = new ArrayList<>();
        Patient p = new Patient();
        p.setHealthCareNumber("1234");
        patients.add(p);
        service.update(patients);
        String content = Files.readString(Path.of("patients-data-extraction/data/patients-out.csv"));
        if (!content.contains("1234")){
            throw new Exception("the expected content was not found in the file content, got :" + content);
        }
    }

    private static void readTest() throws Exception {
        PatientCSVDAO service = new PatientCSVDAO();
        List<Patient> patients = service.read();
        System.out.println("read patient list of size:" +patients.size());
        if (patients.size() != 6){
            throw new Exception("size of the list mismatch, expected 6, got " + patients.size());
        }
        System.out.println(patients.get(0).getLastName());
        System.out.println(patients.get(patients.size()-1).getLastName());
    }
}
