package com.thejavauniversity.designpatterns.command;

public class BuyOrder implements Order {

    private Stock stock;

    BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
