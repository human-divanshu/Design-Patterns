package com.thejavauniversity.designpatterns.templateMethod;

public abstract class ATM {

    public void performTransaction() {
        sendCardDetails();
        authenticate();
        enterAmount();
        withDraw();
    }

    public abstract void sendCardDetails();
    public abstract void authenticate();
    public abstract void enterAmount();
    public abstract void withDraw();

}
