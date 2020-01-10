package com.thejavauniversity.designpatterns.mediator;

public class User {

    private String name;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
