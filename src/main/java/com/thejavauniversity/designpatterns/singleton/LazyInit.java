package com.thejavauniversity.designpatterns.singleton;

public class LazyInit {

    private static LazyInit lazyInit;

    private LazyInit() {
        System.out.println("I am making an object for the LazyInit class");
    }

    public static LazyInit getInstance() {
        if(lazyInit == null) {
            synchronized (LazyInit.class) {
                if(null == lazyInit)
                    lazyInit = new LazyInit();
            }
        }
        return lazyInit;
    }
}
