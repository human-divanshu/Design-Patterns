package com.thejavauniversity.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList;

    Subject() {
        observerList = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        if(!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(String event) {
        observerList.forEach(observer -> observer.update(event));
    }

    public void update(String event) {
        System.out.println("Subject got event = " + event);
        notifyObservers(event);
    }
}
