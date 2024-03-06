package fr.epita.module.tests;

import fr.epita.module.exceptions.CSVWriteException;
import fr.epita.module.exceptions.DataExtractionException;
import fr.epita.module.exceptions.DataModelSaveException;
import fr.epita.module.services.SearchExeption;

public class TestLauncher {

    public static void main(String[] args) throws DataExtractionException, CSVWriteException, DataModelSaveException, SearchExeption {
        System.out.println("[Test] This is the TestLauncher");
        //TODO: run tests here
        FileExtractionTest fileExtractionTest = new FileExtractionTest();
        fileExtractionTest.test();

        CSVWriteTest csvWriteTest = new CSVWriteTest();
        csvWriteTest.test();

        JDBCTest jdbcTest = new JDBCTest();
        jdbcTest.test();

    }
}
