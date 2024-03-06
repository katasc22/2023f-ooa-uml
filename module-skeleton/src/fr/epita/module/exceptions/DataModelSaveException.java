package fr.epita.module.exceptions;

import java.sql.SQLException;

public class DataModelSaveException extends Exception {
    public DataModelSaveException(SQLException e) {
        super(e);
    }
}
