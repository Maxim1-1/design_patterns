package com.Maxim.ChainOfResponsibility;

public class ShippingHandler extends OrderHandler {
    protected boolean canHandle(Order order) {
        return order.getStatus().equals("Оплата прошла") && order.getItems().size() > 0;
    }

    protected void handle(Order order) {
        System.out.println("Заказ готов к отправке, обрабатываю доставку " + order.getId());
        // обработка доставки заказа
    }
}
