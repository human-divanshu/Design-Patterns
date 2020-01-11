package com.thejavauniversity.designpatterns.state;

public class Context {

    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void displayState() {
        currentState.printState();
    }
}
