package com.masoud.oop.patterns.behavioral.mediator.a;

import com.masoud.oop.patterns.behavioral.mediator.b.AirTrafficController;

public class Atr implements Aircraft {
    private String manufacturer;
    private String callSign;
    private AirTrafficController atc;

    public Atr(String callSign, AirTrafficController atc) {
        this.callSign = callSign;
        manufacturer = "ATR";
        this.atc = atc;
        atc.registerAircraftUnderGuidance(this);
    }

    @Override
    public void requestLanding() {
        atc.requestLanding(this);
    }

    @Override
    public void acknowledgeLanding() {
        atc.acknowledgeLanding(this);
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getCallSign() {
        return callSign;
    }
}
