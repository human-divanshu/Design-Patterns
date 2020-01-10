package com.thejavauniversity.designpatterns.iterator;

public class CarContainer implements Container {

    private String[] cars = new String[] {"BMW", "Audi", "Volvo", "Maruti"};

    @Override
    public Iterator getIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator {

        private int num = 0;

        @Override
        public boolean hasNext() {
            return num < cars.length;
        }

        @Override
        public Object next() {
            return cars[num++];
        }
    }
}
