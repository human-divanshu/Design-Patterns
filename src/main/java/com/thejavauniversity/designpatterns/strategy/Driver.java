package com.thejavauniversity.designpatterns.strategy;

public class Driver {
    public static void main(String[] args) {

        Client client = new Client(new OldStrategy());
        client.work();

        client = new Client(new NewStrategy());
        client.work();
    }
}
