package com.Maxim.Command;

class ChangeChannelCommand implements Command {
    private Television television;
    private int channel;

    public ChangeChannelCommand(Television television, int channel) {
        this.television = television;
        this.channel = channel;
    }

    public void execute() {
        television.changeChannel(channel);
    }
}
