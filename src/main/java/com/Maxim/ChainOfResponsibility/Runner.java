package com.Maxim.ChainOfResponsibility;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        OrderHandler paymentHandler = new PaymentHandler();
        OrderHandler shippingHandler = new ShippingHandler();

        paymentHandler.setNextHandler(shippingHandler);

        Order order = new Order();
        order.setId("123");
        order.setStatus("Оплата прошла");
        order.setItems(Arrays.asList(new Item("Товар 1", 100.0), new Item("Товар 2", 200.0)));

        paymentHandler.processOrder(order);
    }
}
