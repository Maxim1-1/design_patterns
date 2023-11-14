package com.Maxim.Observed;

public class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.print("Погода изменилась, температура:"+temp+" давление:"+presser+"\n");
    }
}
