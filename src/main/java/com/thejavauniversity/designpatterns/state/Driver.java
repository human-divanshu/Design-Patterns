package com.thejavauniversity.designpatterns.state;

public class Driver {

    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new State1());
        context.displayState();

        context.setState(new State2());
        context.displayState();

    }
}
