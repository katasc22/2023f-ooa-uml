package fr.epita.module.tests;

import fr.epita.module.datamodel.DataModel;     /**import datamodel(and services,..) from sources root**/

public class ModuleTestClass {

    public static void main(String[] args){
        System.out.println("This is the TestClass");
        DataModel d = new DataModel("Hello World");
        System.out.println(d.getAttribute());
        //TODO: run tests here
    }
}
