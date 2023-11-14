package com.Maxim.FactoryMethod;

public class BmwFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BMW();
    }
}
