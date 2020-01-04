package com.thejavauniversity.designpatterns.composite;

public class Driver {

    public static void main(String[] args) {
        Developer d1 = new Developer("Bob");
        Developer d2 = new Developer("Alice");

        Manager m1 = new Manager("Dug");

        m1.addEmployee(d1);
        m1.addEmployee(d2);

        Manager generalManager = new Manager("Steve");
        generalManager.addEmployee(m1);

        generalManager.showDetails();
    }
}
