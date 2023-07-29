package com.masoud.oop.patterns.behavioral.mediator;

import com.masoud.oop.patterns.behavioral.mediator.a.Aircraft;
import com.masoud.oop.patterns.behavioral.mediator.a.Atr;
import com.masoud.oop.patterns.behavioral.mediator.a.Boeing;
import com.masoud.oop.patterns.behavioral.mediator.b.AirTrafficControllerImpl;

public class Client {
    public static void main(String[] args) {

        AirTrafficControllerImpl atcSystem = new AirTrafficControllerImpl();

        Aircraft atr72 = new Atr("Flight A", atcSystem);
        Aircraft boeing747 = new Boeing("Flight B", atcSystem);

        atr72.acknowledgeLanding();
        atr72.requestLanding();


        boeing747.acknowledgeLanding();
        boeing747.requestLanding();
    }
}
