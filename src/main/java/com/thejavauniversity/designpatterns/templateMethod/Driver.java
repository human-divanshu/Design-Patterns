package com.thejavauniversity.designpatterns.templateMethod;

public class Driver {
    public static void main(String[] args) {
       AtmVendor atmVendor = new AtmVendor();
       atmVendor.performTransaction();
    }
}
