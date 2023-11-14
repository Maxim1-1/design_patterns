package com.Maxim.Memento;

public class Save {

    public String getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }

    private final String level;
    private final int time;

    public Save(String level, int time) {
        this.level = level;
        this.time = time;
    }
}
