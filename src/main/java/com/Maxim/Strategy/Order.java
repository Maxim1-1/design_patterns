package com.Maxim.Strategy;

public class Order {
    private OrderState currentState;

    public Order() {
        currentState = new NewOrderState();
    }


    public void trackOrder() {
        currentState.trackOrder(this);
    }

    public void setState(OrderState newState) {
        currentState = newState;
    }


}
