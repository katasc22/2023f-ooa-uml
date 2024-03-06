package fr.epita.module.services;

import fr.epita.module.datamodel.DataModel;
import fr.epita.module.exceptions.CSVWriteException;
import fr.epita.module.exceptions.DataExtractionException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class CSVDAO {

    public List<DataModel> read() throws DataExtractionException {
        Path currentFilePath = Path.of("module-skeleton/data/data.csv");
        System.out.println("[READ] looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines;
        try {
            lines = Files.readAllLines(currentFilePath);
        } catch (IOException e) {
            throw new DataExtractionException(e);
        }
        //printDatabaseEntries(lines);

        //remove first line with column names
        lines.remove(0);
        List<DataModel> list = new ArrayList<>();
        for (String line : lines){
            String[] parts = line.split(",");
            DataModel d = extractData(parts);
            list.add(d);
        }

        /*System.out.println("sort by date");
        list.sort(Comparator.comparing(DataModel::getAttributeDate));
        printDataModelList(list);
        System.out.println("sort by Int");
        list.sort(Comparator.comparing(DataModel::getAttributeInt));
        printDataModelList(list);
        System.out.println("sort by String");
        list.sort(Comparator.comparing(DataModel::getAttributeString));
        printDataModelList(list);*/

        return list;
    }

    private static DataModel extractData(String[] row) {
        DataModel d = new DataModel();
        d.setAttributeString(row[0].replaceAll("\"", ""));
        d.setAttributeInt(Integer.parseInt(row[2].replaceAll(" ", "")));        //str.trim() removes leading and trailing whitespaces
        d.setAttributeDate(LocalDate.of(2024, 2, 19));
        //d.setAttributeDate( LocalDate.parse(row[6], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return d;
    }

    public void writeData(List<DataModel> list) throws CSVWriteException {
        Path currentFilePath = Path.of("module-skeleton/data/data_output.csv");
        String dataAsCSV = "";
        for (DataModel dataModel : list){
            //pat_num_HC;pat_lastname;pat_firstname;pat_address;pat_tel;pat_insurance_id;pat_subscription_date
            dataAsCSV += dataModel.getAttributeDate().format( DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            dataAsCSV += dataModel.getAttributeString() +";";
            dataAsCSV += dataModel.getAttributeInt() +";";
            dataAsCSV += System.getProperty("line.separator");
        }
        try {
            Files.write(currentFilePath, dataAsCSV.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e){
            throw new CSVWriteException(e);
        }
    }
}
