package com.Maxim.Observed;

public interface Observed {
    void addObserver (Observer o);
    void removeObserver (Observer o);
    void notifyObservers ();

}
