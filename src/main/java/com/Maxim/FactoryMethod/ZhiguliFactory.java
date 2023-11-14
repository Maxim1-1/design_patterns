package com.Maxim.FactoryMethod;

public class ZhiguliFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Zhiguli();
    }
}
