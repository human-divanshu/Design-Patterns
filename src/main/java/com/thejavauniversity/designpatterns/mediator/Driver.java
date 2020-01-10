package com.thejavauniversity.designpatterns.mediator;

public class Driver {

    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");

        alice.sendMessage("Hi Bob!");
        bob.sendMessage("Hello Alice!");
    }
}
