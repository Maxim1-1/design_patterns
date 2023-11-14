package com.Maxim.Strategy;

public class DeliveredOrderState implements OrderState {

    @Override
    public void trackOrder(Order order) {
        System.out.print("Заказ доставлен");
    }
}
