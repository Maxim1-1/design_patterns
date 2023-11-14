package com.Maxim.TemplateMethod;


public class FootballGame extends Game{
    @Override
    void initialize() {
        System.out.print("Футбол- создание игры\n");
    }

    @Override
    void startGame() {
        System.out.print("Футбол- начало\n");
    }

    @Override
    protected void endGame(){
        System.out.print("Футбол- конец игры\n");

    }
}
