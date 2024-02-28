package fr.epita.patients.services;

import java.io.IOException;

public class PatientUpdateException extends Throwable {
    public PatientUpdateException(Exception e) {
        super(e);
    }
}
