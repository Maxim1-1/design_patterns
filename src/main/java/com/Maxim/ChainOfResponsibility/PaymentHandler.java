package com.Maxim.ChainOfResponsibility;

public class PaymentHandler extends OrderHandler {
    protected boolean canHandle(Order order) {
        return order.getStatus().equals("Оплата прошла");
    }

    protected void handle(Order order) {
        System.out.println("Заказ оплачен, обрабатываю оплату " + order.getId());
        // обработка оплаты заказа
    }
}
