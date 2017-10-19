package Observers;

import java.util.ArrayList;
import java.util.List;

public abstract class ObserverEntity {
    private List<Observer> observers = new ArrayList<>();

    protected void callNotifiers() {
        observers.forEach(Observer::notifyWhenCompanyGrows);
    }

    protected void addObserver(Observer observer) {
        observers.add(observer);
    }
}
