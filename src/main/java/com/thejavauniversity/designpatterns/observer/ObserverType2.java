package com.thejavauniversity.designpatterns.observer;

public class ObserverType2 implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Observer type 2 got update = " + event);
    }
}
