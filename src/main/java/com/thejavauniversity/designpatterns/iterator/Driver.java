package com.thejavauniversity.designpatterns.iterator;

public class Driver {

    public static void main(String[] args) {
        CarContainer carContainer = new CarContainer();

        for(Iterator i = carContainer.getIterator(); i.hasNext();) {
            System.out.println((String) i.next());
        }
    }
}
