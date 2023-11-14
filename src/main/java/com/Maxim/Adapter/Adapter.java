package com.Maxim.Adapter;

public class Adapter implements Computer{

    private FlashCard flashCard;

    Adapter (FlashCard flashCard) {
        this.flashCard = flashCard;
    }

    @Override
    public void readFiles() {
        flashCard.getFilesFromCard();

    }

    @Override
    public void editFiles() {
        flashCard.putFilesFromCard();
    }
}
