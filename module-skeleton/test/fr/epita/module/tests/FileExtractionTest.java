package fr.epita.module.tests;


import fr.epita.module.datamodel.DataModel;
import fr.epita.module.services.CSVDAO;
import fr.epita.module.exceptions.DataExtractionException;

import java.util.List;

import static fr.epita.module.services.loggingService.printDataModelList;


public class FileExtractionTest {

    public void test() throws DataExtractionException {
        CSVDAO CSVDAO = new CSVDAO();
        List<DataModel> list = CSVDAO.read();
        printDataModelList(list);
    }

}
