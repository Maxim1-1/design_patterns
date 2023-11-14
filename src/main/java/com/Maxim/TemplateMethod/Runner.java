package com.Maxim.TemplateMethod;

public class Runner {
    public static void main(String[] args) {
        Game football = new FootballGame();
        football.play();

        Game chess = new ChessGame();
        chess.play();
    }
}
