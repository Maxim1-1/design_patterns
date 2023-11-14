package com.Maxim.Prototype;

public class Human implements Copytable{
    private String name;
    private String weight;
    private int height;

    Human (String name, String weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public Human copy() {
        return new Human(name,weight,height);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", height=" + height +
                '}';
    }
}
