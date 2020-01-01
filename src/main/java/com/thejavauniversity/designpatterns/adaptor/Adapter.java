package com.thejavauniversity.designpatterns.adaptor;

public class Adapter implements Algorithm {

    NewAlgorithm algorithm = new NewAlgorithm();

    @Override
    public void process() {
        algorithm.execute();
    }
}
