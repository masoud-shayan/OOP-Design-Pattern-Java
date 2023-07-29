package com.masoud.oop.patterns.behavioral.mediator.a;

public interface Aircraft {

    void requestLanding();

    void acknowledgeLanding();

    String getManufacturer();

    String getCallSign();

}
