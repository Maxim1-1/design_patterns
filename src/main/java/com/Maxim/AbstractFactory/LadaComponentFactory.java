package com.Maxim.AbstractFactory;

public class LadaComponentFactory implements ComponentFactory{
    @Override
    public Engine createEngine() {
        return new LadaEngine();
    }
    @Override
    public Wheels createWheels() {
        return new LadaWheels();
    }
}
