package com.masoud.oop.patterns.creational.singleton.c;

public class MultiThreadSingleton {
    private static MultiThreadSingleton instance = null;

    private MultiThreadSingleton() {
    }

    public static synchronized MultiThreadSingleton getInstance() {

        if (instance == null) {
            instance = new MultiThreadSingleton();
        }

        return instance;
    }
}
