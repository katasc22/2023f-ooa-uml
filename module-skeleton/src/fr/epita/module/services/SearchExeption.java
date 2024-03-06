package fr.epita.module.services;

import java.sql.SQLException;

public class SearchExeption extends Exception {
    public SearchExeption(SQLException e) {
        super(e);
    }
}
