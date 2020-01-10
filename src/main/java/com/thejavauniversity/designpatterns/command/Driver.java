package com.thejavauniversity.designpatterns.command;

public class Driver {

    public static void main(String[] args) {

        Stock appleStock = new Stock("APPL", 10);
        Stock microsoftStock = new Stock("MSFT", 20);
        Stock teslaStock = new Stock("TSLA", 15);

        BuyOrder buyOrder1 = new BuyOrder(appleStock);
        SellOrder sellOrder = new SellOrder(microsoftStock);
        BuyOrder buyOrder2 = new BuyOrder(teslaStock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder1);
        broker.takeOrder(sellOrder);
        broker.takeOrder(buyOrder2);

        broker.placeOrders();
    }

}
