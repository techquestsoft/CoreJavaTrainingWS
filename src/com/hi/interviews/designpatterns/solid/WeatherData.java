package com.hi.interviews.designpatterns.solid;

import java.util.List;

// Concrete Subject
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // Methods for registering, removing, and notifying observers

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(com.hi.interviews.designpatterns.solid.Observer observer) {

    }

    @Override
    public void removeObserver(com.hi.interviews.designpatterns.solid.Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    // Other methods for updating weather conditions
}