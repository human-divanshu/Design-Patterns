package com.thejavauniversity.designpatterns.visitor;

public class Driver {
    public static void main(String[] args) {
        Application application = new Application();
        application.accept(new VisitorImpl());
    }
}
