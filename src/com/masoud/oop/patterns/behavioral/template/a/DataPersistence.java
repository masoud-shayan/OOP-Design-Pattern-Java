package com.masoud.oop.patterns.behavioral.template.a;

public abstract class DataPersistence {

    public void persist(String... data) {
        convertData(data);
        initializeDatabase();
        saveData();
        cleanUp();
    }

    private void cleanUp() {
        System.out.println("close the connection and clean up ....\n\n");
    }

    protected abstract void saveData();

    protected abstract void initializeDatabase();

    protected abstract void convertData(String[] data);
}
