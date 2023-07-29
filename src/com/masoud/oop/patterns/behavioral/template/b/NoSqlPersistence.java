package com.masoud.oop.patterns.behavioral.template.b;

import com.masoud.oop.patterns.behavioral.template.a.DataPersistence;

public class NoSqlPersistence extends DataPersistence {

    protected void convertData(String[] data) {
        System.out.println("Convert Data To Documents ......");
    }

    @Override
    protected void initializeDatabase() {
        System.out.println("Initialize Mongo Database and Create a connection to it .....");
    }

    @Override
    protected void saveData() {
        System.out.println("Save the Data in a Json type .....");
    }
}
