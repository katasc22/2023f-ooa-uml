package fr.epita.module.tests;

import fr.epita.module.datamodel.DataModel;
import fr.epita.module.services.CSVDAO;
import fr.epita.module.exceptions.CSVWriteException;
import fr.epita.module.exceptions.DataExtractionException;

import java.util.List;

public class CSVWriteTest {

    public void test() throws DataExtractionException, CSVWriteException {
        CSVDAO csvdao = new CSVDAO();
        List<DataModel> list = csvdao.read();
        csvdao.writeData(list);
    }
}
