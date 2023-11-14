package com.Maxim.Facad;

public class Operator {

    public void processTheOrder (String order, String address) {
        Cook cook = new Cook();
        Delivery delivery = new Delivery();

        if (!order.isEmpty()) {

            while (!cook.orderStatus) {
                cook.prepareAnOrder(order);
            }

            delivery.pickUpAnOrderFromkitchen(order);
            delivery.deliverOrderToCustomer();

        }

    }
}
