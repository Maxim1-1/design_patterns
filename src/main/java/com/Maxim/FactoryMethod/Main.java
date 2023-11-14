package com.Maxim.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = createFactoryByBrend("bmw");
        Car car = carFactory.createCar();

        car.drive();
    }

    static CarFactory createFactoryByBrend(String brend) {
        if (brend.equalsIgnoreCase("жигули")) {
            return new ZhiguliFactory();
        } else if (brend.equalsIgnoreCase("bmw")) {
            return new BmwFactory();
        } else {
            throw new RuntimeException(String.format("%s нет фабрики", brend));
        }
    }


}
