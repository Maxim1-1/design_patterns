package com.Maxim.Mediator;

class Supplier {
    private String name;
    private Mediator mediator;

    public Supplier(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendOrder(Order order, String recipient) {
        mediator.sendOrder(order, recipient);
    }

    public void receiveOrder(Order order) {
        System.out.println(name + " received order: " + order);
        mediator.shipOrder(order);
    }
}
