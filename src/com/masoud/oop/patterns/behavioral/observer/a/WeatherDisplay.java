package com.masoud.oop.patterns.behavioral.observer.a;

public class WeatherDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("Current temperature: " + temperature + " degrees Celsius");
    }
}