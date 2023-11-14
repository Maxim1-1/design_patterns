package com.Maxim.State;

public class Runner {
    public static void main(String[] args) {

        Order order = new Order();


        for (int i = 0;i<5;i++) {
            order.trackOrder();
            order.changeStatusOrder();
        }

    }
}
