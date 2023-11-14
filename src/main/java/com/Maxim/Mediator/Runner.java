package com.Maxim.Mediator;

public class Runner {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Supplier supplier1 = new Supplier("Supplier 1", warehouse);
        Supplier supplier2 = new Supplier("Supplier 2", warehouse);


        warehouse.registerSupplier(supplier1);
        warehouse.registerSupplier(supplier2);

        Order order1 = new Order("Product 1", 10);
        Order order2 = new Order("Product 2", 5);

        supplier1.sendOrder(order1, "Supplier 1");
        supplier2.sendOrder(order2, "Supplier 2");
    }
}
