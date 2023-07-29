package com.masoud.oop.patterns.structural.facade.b;

import com.masoud.oop.patterns.structural.facade.a.Subsystem1;
import com.masoud.oop.patterns.structural.facade.a.Subsystem2;
import com.masoud.oop.patterns.structural.facade.a.Subsystem3;

// Facade Class
public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
        subsystem3.operation3();
    }
}
