package com.thejavauniversity.designpatterns.bridge;

public class User {

    Logger logger;

    // assume these have been loaded from database
    String username = "dummy";
    String password = "dummy";

    User(Logger logger) {
        this.logger = logger;
    }

    boolean isValid(String username, String password) {
        if(username.equalsIgnoreCase(this.username)
                && password.equalsIgnoreCase(this.password)) {
            logger.logInfo("Valid details");
            return true;
        }
        logger.logError("Invalid details");
        return false;
    }
}
