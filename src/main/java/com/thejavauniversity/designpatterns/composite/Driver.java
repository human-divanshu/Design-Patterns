package com.thejavauniversity.designpatterns.composite;

public class Driver {

    public static void main(String[] args) {
        Developer d1 = new Developer("Bob");
        Developer d2 = new Developer("Alice");
        Designer d3 = new Designer("Amanda");
        Manager m1 = new Manager("Bossy");

        m1.addEmployee(d1);
        m1.addEmployee(d2);
        m1.addEmployee(d3);

        Manager generalManager = new Manager("Super bossy");
        generalManager.addEmployee(m1);

        generalManager.showDetails();
    }
}
