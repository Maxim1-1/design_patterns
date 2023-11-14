package com.Maxim.AbstractFactory;

public class Runner {
    public static void main(String[] args) {
        ToyotaComponentFactory toyotaComponentFactory = new ToyotaComponentFactory();
        LadaComponentFactory ladaComponentFactory = new LadaComponentFactory();

        System.out.print("Create components for Toyota\n");

        Engine toyotaEngine = toyotaComponentFactory.createEngine();
        Wheels toyotaWheels = toyotaComponentFactory.createWheels();

        toyotaEngine.start();
        toyotaWheels.run();


        System.out.print("Create components for Toyota\n");

        Engine ladaEngine = ladaComponentFactory.createEngine();
        Wheels ladaWheels =ladaComponentFactory.createWheels();

        ladaEngine.start();
        ladaWheels.run();


    }
}
