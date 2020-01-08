package com.thejavauniversity.designpatterns.proxy;

public class ProxyImage implements Image {

    RealImage realImage;
    String imageFile;

    ProxyImage(String imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public void display() {
        realImage = new RealImage(this.imageFile);
        realImage.display();
    }

    @Override
    public void showName() {
        System.out.println("Image name is : " + this.imageFile);
    }

    @Override
    public void loadFromDisk() {
        System.out.println("Proxy load. Image will not be loaded until this is actually required");
    }
}
