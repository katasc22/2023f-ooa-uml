package fr.epita.module.services;

import fr.epita.module.datamodel.DataModel;
import fr.epita.module.exceptions.DataModelSaveException;
import fr.epita.module.exceptions.SingleEntrySaveException;

import java.sql.*;
import java.util.List;

import static fr.epita.module.services.loggingService.printDB;

public class JDBCDAO {

    public void createAll(Connection connection, List<DataModel> list) throws DataModelSaveException {
        //mem = in memory database, myDBname = whatever your database should be named
        try {
            connection.prepareStatement("CREATE TABLE PERSONS(id int, weight int, name varchar, subscriptionDate date)").execute();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PERSONS(id,weight, name, subscriptionDate) values (?,?, ?, ?)");
            //ATTENTION: starts at idx 1 NOT 0!!
            int idCounter = 1;
            for (DataModel dataModel : list){
                preparedStatement.setInt(1, idCounter);
                preparedStatement.setInt(2, dataModel.getAttributeInt());
                preparedStatement.setString(3, dataModel.getAttributeString());
                preparedStatement.setDate(4, Date.valueOf(dataModel.getAttributeDate()));
                preparedStatement.execute();
                idCounter++;
            }
            ResultSet resultSet = connection.prepareStatement("SELECT id FROM PERSONS").executeQuery();   //ATTENTION: if we want resultset use executeQuery() if its "void" use execute()
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
            }
        } catch (SQLException e) {
            throw new DataModelSaveException(e);
        }
    }

    public void createDBEntry(Connection connection,DataModel dataModel) throws SingleEntrySaveException {
        //mem = in memory database, myDBname = whatever your database should be named
        try {
            connection.prepareStatement("CREATE TABLE PERSONS(id int, weight int, name varchar, subscriptionDate date)").execute();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PERSONS(id,weight, name, subscriptionDate) values (?,?, ?, ?)");
            //ATTENTION: starts at idx 1 NOT 0!!
            preparedStatement.setInt(1, 0);
            preparedStatement.setInt(2, dataModel.getAttributeInt());
            preparedStatement.setString(3, dataModel.getAttributeString());
            preparedStatement.setDate(4, Date.valueOf(dataModel.getAttributeDate()));
            preparedStatement.execute();
        }catch (SQLException sqlException){
            throw new SingleEntrySaveException(sqlException);
        }
    }

    //preparedStatement doc : https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html

    public void searchEntrybyName(Connection connection, String name) throws SearchExeption {
        System.out.println("Searching for "+name);
        try {
            //printDB(connection);  //check if db is correct
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, weight, name,subscriptionDate FROM PERSONS WHERE name= ?");
            preparedStatement.setString(1,name);
            ResultSet resultSet =  preparedStatement.executeQuery();   //ATTENTION: if we want resultset use executeQuery() if its "void" use execute()
            while (resultSet.next()) {
                System.out.println("Result for "+name+":");
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getInt("weight"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getDate("subscriptionDate"));
            }
        } catch (SQLException e) {
            throw new SearchExeption(e);
        }
    }
}
