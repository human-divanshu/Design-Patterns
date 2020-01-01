package com.thejavauniversity.designpatterns.bridge;

public class Logger {
    void logError(String message) {
        System.out.println("Error : " + message);
    }

    void logInfo(String message) {
        System.out.println("Info : " + message);
    }
}
