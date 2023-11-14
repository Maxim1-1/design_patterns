package com.Maxim.Command;

class Television {
    public void powerOn() {
        System.out.println("Телевизор включен");
    }

    public void changeChannel(int channel) {
        System.out.println("Переключение на канал " + channel);
    }

    public void adjustVolume(int volume) {
        System.out.println("Регулировка громкости на " + volume + " уровень");
    }
}
