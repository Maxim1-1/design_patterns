package com.Maxim.Facad;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client();
        Operator operator = new Operator();

        client.makeAnOrder("пиццу");
        operator.processTheOrder("пицца", "test");

    }
}
