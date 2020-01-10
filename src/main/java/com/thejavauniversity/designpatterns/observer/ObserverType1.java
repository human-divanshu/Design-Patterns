package com.thejavauniversity.designpatterns.observer;

public class ObserverType1 implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Observer Type 1 got update = " + event);
    }
}
