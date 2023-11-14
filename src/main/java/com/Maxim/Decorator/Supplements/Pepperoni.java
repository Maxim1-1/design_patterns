package com.Maxim.Decorator.Supplements;

public class Pepperoni implements Ingredient{
    String ingredient = "пеперони";

    @Override
    public String getIngredient() {
        return ingredient;
    }
}
