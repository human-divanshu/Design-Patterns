package com.thejavauniversity.designpatterns.singleton;

public class EagerInit {
    private static final EagerInit eagerInit = new EagerInit();

    private EagerInit() {
        System.out.println("I am making the object for EagerInit class");
    }

    public static EagerInit getInstance() {
        return eagerInit;
    }
}
