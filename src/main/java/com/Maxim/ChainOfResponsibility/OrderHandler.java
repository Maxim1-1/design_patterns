package com.Maxim.ChainOfResponsibility;

public abstract class OrderHandler {
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void processOrder(Order order) {
        if (canHandle(order)) {
            handle(order);
        } else if (nextHandler != null) {
            nextHandler.processOrder(order);
        } else {
            System.out.println("Нет обработчика для этого заказа");
        }
    }

    protected abstract boolean canHandle(Order order);
    protected abstract void handle(Order order);
}
