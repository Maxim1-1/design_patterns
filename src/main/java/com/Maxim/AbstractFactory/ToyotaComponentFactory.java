package com.Maxim.AbstractFactory;

public class ToyotaComponentFactory implements ComponentFactory{
    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }
    @Override
    public Wheels createWheels() {
        return new ToyotaWheels();
    }
}
