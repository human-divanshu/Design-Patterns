package com.thejavauniversity.designpatterns.proxy;

public class RealImage implements Image {

    String imageFile;

    RealImage(String imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public void display() {
        loadFromDisk();
        System.out.println("Displaying image");
    }

    @Override
    public void showName() {
        System.out.println("Image name is : " + this.imageFile);
    }

    @Override
    public void loadFromDisk() {
        System.out.println("Loading image from disk");
    }
}
