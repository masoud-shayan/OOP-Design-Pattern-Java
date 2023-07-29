package com.masoud.oop.patterns.behavioral.template.b;

import com.masoud.oop.patterns.behavioral.template.a.DataPersistence;

public class SqlPersistence extends DataPersistence {

    @Override
    protected void convertData(String[] data) {
        System.out.println("Convert Data To rows and columns ....");
    }

    @Override
    protected void initializeDatabase() {
        System.out.println("Initialize MySql Database and Create a connection to it .....");
    }

    @Override
    protected void saveData() {
        System.out.println("Save the Data in a relational manner .....");
    }
}
