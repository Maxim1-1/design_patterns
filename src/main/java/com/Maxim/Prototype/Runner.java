package com.Maxim.Prototype;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human("Jeck","70",170);
        System.out.print(human.toString());
        Human human1 = human.copy();
        System.out.print(human1.toString());




    }
}
