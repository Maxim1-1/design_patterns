package com.Maxim.Command;

public class Runner {
    public static void main(String[] args) {
        Television television = new Television();

        Command powerOnCommand = new PowerOnCommand(television);
        Command changeChannelCommand = new ChangeChannelCommand(television, 5);
        Command adjustVolumeCommand = new AdjustVolumeCommand(television, 10);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(powerOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannelCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();
    }
}
