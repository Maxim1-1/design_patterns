package com.Maxim.Mediator;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Warehouse implements Mediator {
    private Map<String, Supplier> suppliers;
    private List<Order> orders;
    private List<Item> stock;

    public Warehouse() {
        this.suppliers = new HashMap<>();
        this.orders = new ArrayList<>();
        this.stock = new ArrayList<>();
    }

    public void registerSupplier(Supplier supplier) {
        suppliers.put(supplier.getName(), supplier);
    }

    @Override
    public void sendOrder(Order order, String recipient) {
        Supplier supplier = suppliers.get(recipient);
        if (supplier != null) {
            supplier.receiveOrder(order);
            orders.add(order);
        } else {
            System.out.println("Unknown recipient: " + recipient);
        }
    }

    @Override
    public void shipOrder(Order order) {
        orders.remove(order);
        System.out.println("Shipping order: " + order);
    }

    @Override
    public void updateStock(Item item) {
        stock.add(item);
        System.out.println("Updating stock: " + item);
    }
}
