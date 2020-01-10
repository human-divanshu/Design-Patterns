package com.thejavauniversity.designpatterns.memento;

public class Memento {

    private String state;

    Memento(String url) {
        this.state = url;
    }

    public String getState() {
        return this.state;
    }
}
