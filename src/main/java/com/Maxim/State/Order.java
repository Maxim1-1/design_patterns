package com.Maxim.State;

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

    public void changeStatusOrder () {
        if (currentState instanceof NewOrderState){
            setState(new ProcessingOrderState());

        }
        else if (currentState instanceof ProcessingOrderState){
            setState(new ShippedOrderState());

        } else if (currentState instanceof ShippedOrderState){
            setState(new DeliveredOrderState());
            currentState.trackOrder(this);

        }

    }
}
