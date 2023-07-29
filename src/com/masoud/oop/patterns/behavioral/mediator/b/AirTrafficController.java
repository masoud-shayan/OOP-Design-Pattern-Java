package com.masoud.oop.patterns.behavioral.mediator.b;

import com.masoud.oop.patterns.behavioral.mediator.a.Aircraft;

public interface AirTrafficController {

    void registerAircraftUnderGuidance(Aircraft aircraft);

    void requestLanding(Aircraft aircraft);

    void acknowledgeLanding(Aircraft aircraft);
}
