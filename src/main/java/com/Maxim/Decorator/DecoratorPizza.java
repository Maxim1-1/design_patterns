package com.Maxim.Decorator;

import com.Maxim.Decorator.Supplements.Ingredient;

public class DecoratorPizza implements PizzaMaker{
    Pizza pizza;

    DecoratorPizza (Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza();
    }
}
