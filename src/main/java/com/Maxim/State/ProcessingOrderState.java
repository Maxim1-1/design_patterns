package com.Maxim.State;

public class ProcessingOrderState implements OrderState {


    @Override
    public void trackOrder(Order order) {
        System.out.print("Заказ находится в обработке");
    }
}