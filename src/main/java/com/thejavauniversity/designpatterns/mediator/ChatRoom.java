package com.thejavauniversity.designpatterns.mediator;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "] : " + message);
    }
}
