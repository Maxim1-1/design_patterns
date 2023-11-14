package com.Maxim.State;

public class ShippedOrderState implements OrderState {


    @Override
    public void trackOrder(Order order) {
        System.out.print("Заказ отправлен");
    }
}
