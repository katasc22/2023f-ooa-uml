package fr.epita.module.exceptions;

import java.io.IOException;

public class DataExtractionException extends Exception {
    public DataExtractionException(IOException e) {
        super(e);
    }
}
