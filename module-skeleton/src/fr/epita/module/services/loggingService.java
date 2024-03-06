package fr.epita.module.services;

import fr.epita.module.datamodel.DataModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class loggingService {

    public static void printCSVEntries(List<String> lines){
        System.out.println("-------Loaded DB-----------");
        for (String line : lines){
            System.out.println(line);
        }
    }

    public static void printDataModelList(List<DataModel> list){
        System.out.println("--------Object List----------");
        for (DataModel d : list){
            System.out.println(d.toString());
        }
    }

    public static void printDB(Connection connection) throws SQLException {
        ResultSet r = connection.prepareStatement("SELECT name FROM PERSONS").executeQuery();
        while (r.next()) {
                System.out.println(r.getString("name"));
        }
    }


}
