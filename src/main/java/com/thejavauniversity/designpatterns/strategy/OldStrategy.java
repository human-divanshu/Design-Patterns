package com.thejavauniversity.designpatterns.strategy;

public class OldStrategy implements Strategy {
    @Override
    public void doAction() {
        System.out.println("Action by old strategy");
    }
}
