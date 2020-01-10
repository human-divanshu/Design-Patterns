package com.thejavauniversity.designpatterns.command;

public class SellOrder implements Order {

    private Stock stock;

    SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
