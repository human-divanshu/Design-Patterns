package com.thejavauniversity.designpatterns.proxy;

public class Driver {

    public static void main(String[] args) {

        String fileName = "dummy.png";
        ProxyImage proxyImage = new ProxyImage(fileName);
        proxyImage.loadFromDisk();
        proxyImage.showName();
        proxyImage.display();

    }
}
