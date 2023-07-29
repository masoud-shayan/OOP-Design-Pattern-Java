package com.masoud.oop.patterns.structural.facade;

import com.masoud.oop.patterns.structural.facade.b.Facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
