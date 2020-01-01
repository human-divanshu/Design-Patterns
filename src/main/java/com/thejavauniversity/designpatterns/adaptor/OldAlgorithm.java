package com.thejavauniversity.designpatterns.adaptor;

public class OldAlgorithm implements Algorithm {
    @Override
    public void process() {
        System.out.println("Being processed by old algorithm");
    }
}
