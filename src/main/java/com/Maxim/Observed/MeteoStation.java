package com.Maxim.Observed;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {

    int temperature;
    int pressure;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.handleEvent(temperature, pressure);
        }
    }

    public void setMeasurements(int temp, int pres) {
        temperature = temp;
        pressure = pres;
        notifyObservers();
    }
}
