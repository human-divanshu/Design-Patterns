package com.thejavauniversity.designpatterns.strategy;

public class Client {

    private Strategy strategy;

    Client(Strategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        strategy.doAction();
    }
}
