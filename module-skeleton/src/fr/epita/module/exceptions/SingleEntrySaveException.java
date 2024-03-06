package fr.epita.module.exceptions;

import java.sql.SQLException;

public class SingleEntrySaveException extends Exception {
    public SingleEntrySaveException(SQLException sqlException) {
        super(sqlException);
    }
}
