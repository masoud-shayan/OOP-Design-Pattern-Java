package com.masoud.oop.patterns.behavioral.observer;

import com.masoud.oop.patterns.behavioral.observer.a.WeatherDisplay;
import com.masoud.oop.patterns.behavioral.observer.b.WeatherStation;

public class Client {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay weatherDisplay = new WeatherDisplay();

        weatherStation.registerObserver(weatherDisplay);
        weatherStation.setTemperature(25);

        weatherStation.unregisterObserver(weatherDisplay);
        weatherStation.setTemperature(30);
    }
}
