package fr.epita.patients.services;

public class PatientSaveException extends Throwable {
    public PatientSaveException(Exception e) {
        super(e);
    }
}
