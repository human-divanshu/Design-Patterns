package com.thejavauniversity.designpatterns.observer;

public class Driver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ObserverType1();
        Observer observer2 = new ObserverType2();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.update("Foobar1");

        subject.unRegister(observer1);

        subject.update("Foobar2");
    }
}
