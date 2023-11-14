package com.Maxim.Command;

class PowerOnCommand implements Command {
    private Television television;

    public PowerOnCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.powerOn();
    }
}
