package com.Maxim.TemplateMethod;

public class ChessGame extends Game{
    @Override
    void initialize() {
        System.out.print("Шахматная игра - создание\n");
    }

    @Override
    void startGame() {
        System.out.print("Шахматная игра - начало\n");

    }
}
