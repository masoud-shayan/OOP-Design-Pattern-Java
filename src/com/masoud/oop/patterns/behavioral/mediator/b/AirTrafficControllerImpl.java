package com.masoud.oop.patterns.behavioral.mediator.b;

import com.masoud.oop.patterns.behavioral.mediator.a.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControllerImpl implements AirTrafficController {
    private List<Aircraft> aircrafts;

    public AirTrafficControllerImpl() {
        aircrafts = new ArrayList<>();
    }

    @Override
    public void registerAircraftUnderGuidance(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public void requestLanding(Aircraft aircraft) {
        System.out.println(aircraft.getManufacturer() + " - " + aircraft.getCallSign() + " requesting landing clearance.");
        // Logic to grant landing clearance based on other aircraft status, runway availability, etc.
    }

    @Override
    public void acknowledgeLanding(Aircraft aircraft) {
        System.out.println(aircraft.getManufacturer() + " - " + aircraft.getCallSign() + " acknowledged landing clearance.");
        // Logic to handle landing sequence and ensure safe distance between aircraft, etc.
    }
}
