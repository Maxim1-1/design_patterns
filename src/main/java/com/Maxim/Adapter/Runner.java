package com.Maxim.Adapter;

public class Runner {
    public static void main(String[] args) {
        Adapter computer = new Adapter(new FlashCard());
        computer.readFiles();
        computer.editFiles();
    }
}
