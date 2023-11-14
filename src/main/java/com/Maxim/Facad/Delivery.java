package com.Maxim.Facad;

public class Delivery {

    public void  pickUpAnOrderFromkitchen (String order) {
        System.out.print(String.format("Заказ %s передан в доставку\n",order));

    }

    public void deliverOrderToCustomer () {
        System.out.print("Заказ доставлен\n");
    }
}
