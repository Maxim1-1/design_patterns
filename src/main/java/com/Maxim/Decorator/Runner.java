package com.Maxim.Decorator;

import com.Maxim.Decorator.Supplements.Tomat;

public class Runner {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.print(pizza.makePizza());

        PizzaTomatoes pizzaTomatoes = new PizzaTomatoes(new Pizza(),new Tomat());
        System.out.print(pizzaTomatoes.makePizza());
    }
}
