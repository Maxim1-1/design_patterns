package com.Maxim.Strategy;

public class ProcessingOrderState implements OrderState {


    @Override
    public void trackOrder(Order order) {
        System.out.print("Заказ находится в обработке");
    }
}