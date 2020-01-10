package com.thejavauniversity.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> history = new ArrayList<>();

    public void storeState(String state) {
        history.add(new Memento(state));
    }

    public String getState(int index) {
        return (index < 0 || index > history.size() - 1)
                ? null : history.get(index).getState();
    }
}
