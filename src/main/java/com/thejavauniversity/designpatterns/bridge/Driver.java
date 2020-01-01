package com.thejavauniversity.designpatterns.bridge;

public class Driver {

    public static void main(String[] args) {
        Logger logger = new Logger();
        User user = new User(logger);
        user.isValid("dummy", "dummy");
    }

}
