package com.Maxim.Memento;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("lvl-1",30);
        System.out.print(game);

        File file = new File();
        file.setSave(game.save());

        game.set("lvl-3",35550);
        System.out.print(game);

        game.loadSave(file.getSave());
        System.out.print(game);

    }
}
