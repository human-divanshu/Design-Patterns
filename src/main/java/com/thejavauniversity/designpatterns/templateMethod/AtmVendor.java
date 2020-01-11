package com.thejavauniversity.designpatterns.templateMethod;

public class AtmVendor extends ATM {
    @Override
    public void sendCardDetails() {
        System.out.println("Sending card details");
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating user");
    }

    @Override
    public void enterAmount() {
        System.out.println("Amount details");
    }

    @Override
    public void withDraw() {
        System.out.println("Withdrawal done");
    }
}
