package com.thejavauniversity.designpatterns.memento;

public class Driver {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("https://google.com");
        System.out.println("Current state : " + originator.getState());

        careTaker.storeState(originator.getState());

        originator.setState("https://facebook.com");
        System.out.println("Current state : " + originator.getState());

        originator.setState(careTaker.getState(0));
        System.out.println("Current state : " + originator.getState());
    }
}
