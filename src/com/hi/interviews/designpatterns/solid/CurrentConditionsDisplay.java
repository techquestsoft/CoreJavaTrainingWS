package com.hi.interviews.designpatterns.solid;

// Concrete Observer
public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    // Implementation of the update method to display current conditions
}
