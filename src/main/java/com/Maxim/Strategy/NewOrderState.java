package com.Maxim.Strategy;

public class NewOrderState implements OrderState {

    @Override
    public void trackOrder(Order order) {
        System.out.print("Заказ создан");
    }
}
