package com.thejavauniversity.designpatterns.command;

public class Stock {

    private String stockName;
    private int count;

    Stock(String stockName, int count) {
        this.stockName = stockName;
        this.count = count;
    }

    void buy() {
        System.out.println("Buying " + this.count + " stocks of "  + this.stockName );
    }

    void sell() {
        System.out.println("Selling " + this.count + " stocks of "  + this.stockName );
    }
}
