package com.thejavauniversity.designpatterns.composite;

public class Developer implements Employee {

    String name;

    Developer(String name){
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer name = " + this.name);
    }
}
