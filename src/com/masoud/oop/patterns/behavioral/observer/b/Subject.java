package com.masoud.oop.patterns.behavioral.observer.b;


import com.masoud.oop.patterns.behavioral.observer.a.Observer;

interface Subject {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}