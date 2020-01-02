package com.thejavauniversity.designpatterns.composite;

public class Designer implements Employee {

    String name;

    Designer(String name){
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Designer name = " + this.name);
    }
}
