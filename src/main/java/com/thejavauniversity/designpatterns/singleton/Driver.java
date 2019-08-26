package com.thejavauniversity.designpatterns.singleton;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Starting main");

        LazyInit lazyInit1 = LazyInit.getInstance();
        LazyInit lazyInit2 = LazyInit.getInstance();

        EagerInit eagerInit1 = EagerInit.getInstance();
        EagerInit eagerInit2 = EagerInit.getInstance();

        System.out.println(lazyInit1.equals(lazyInit2));
        System.out.println(eagerInit1.equals(eagerInit2));
    }

}
