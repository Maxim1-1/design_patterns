package com.Maxim.Strategy;

public class Runner {
    public static void main(String[] args) {

        Order order = new Order();

        order.setState(new ShippedOrderState());
        order.trackOrder();
        order.setState(new ProcessingOrderState());
        order.trackOrder();
    }
}
