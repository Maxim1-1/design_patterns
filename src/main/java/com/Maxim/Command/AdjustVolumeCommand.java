package com.Maxim.Command;

class AdjustVolumeCommand implements Command {
    private Television television;
    private int volume;

    public AdjustVolumeCommand(Television television, int volume) {
        this.television = television;
        this.volume = volume;
    }

    public void execute() {
        television.adjustVolume(volume);
    }
}
