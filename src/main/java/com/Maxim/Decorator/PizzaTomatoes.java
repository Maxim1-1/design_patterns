package com.Maxim.Decorator;

import com.Maxim.Decorator.Supplements.Ingredient;

public class PizzaTomatoes extends DecoratorPizza {
    Ingredient supplement;

    PizzaTomatoes(Pizza pizza, Ingredient ingredient) {
        super(pizza);
        supplement = ingredient;
    }


    @Override
    public String makePizza() {
        return super.makePizza() + supplement.getIngredient();
    }
}
