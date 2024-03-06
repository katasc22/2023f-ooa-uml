package fr.epita.module.tests;

import fr.epita.module.datamodel.DataModel;
import fr.epita.module.exceptions.DataExtractionException;
import fr.epita.module.services.CSVDAO;
import fr.epita.module.exceptions.DataModelSaveException;
import fr.epita.module.services.JDBCDAO;
import fr.epita.module.services.SearchExeption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JDBCTest {

    public void test() throws DataExtractionException, DataModelSaveException, SearchExeption {
        CSVDAO csvdao = new CSVDAO();
        List<DataModel> dataModelList = csvdao.read();
        JDBCDAO jdbcdao = new JDBCDAO();

        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:myDBname")) {
            jdbcdao.createAll(connection, dataModelList);
            jdbcdao.searchEntrybyName(connection, "Neil");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
