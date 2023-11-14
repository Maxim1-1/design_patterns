package com.Maxim.Mediator;

interface Mediator {
    void sendOrder(Order order, String recipient);
    void shipOrder(Order order);
    void updateStock(Item item);
}
