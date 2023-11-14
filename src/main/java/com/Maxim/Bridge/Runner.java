package com.Maxim.Bridge;

public class Runner {
    public static void main(String[] args) {
        Drawer[] drawersArray = {
                new DrawerLine(new Line()),
                new DrawerCircle(new Circle())
        };

        for (Drawer drawer: drawersArray) {
            drawer.draw();
        }

    }


}
