package com.Maxim.Observed;

public class Runner {

    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());

        station.setMeasurements(11,4545);
    }

}
