package fr.epita.module.exceptions;

import java.io.IOException;

public class CSVWriteException extends Exception {
    public CSVWriteException(IOException e) {
        super(e);
    }
}
