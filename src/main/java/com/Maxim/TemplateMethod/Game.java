package com.Maxim.TemplateMethod;

public abstract class Game {

    public  final void play(){
        initialize();
        startGame();
        endGame();

    }

    abstract void initialize();
    abstract void startGame();
    protected void endGame(){
        System.out.print("Игра завершена");
    };


}
