package com.Maxim.Facad;

public class Cook {

    boolean orderStatus;
    public void prepareAnOrder(String order) {
        if (order.length() > 0) {
            System.out.print(order + " готова\n");
            orderStatus = true;
        }
    }
}
