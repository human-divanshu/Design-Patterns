package com.thejavauniversity.designpatterns.strategy;

public class NewStrategy implements Strategy {
    @Override
    public void doAction() {
        System.out.println("Action by new strategy");
    }
}
