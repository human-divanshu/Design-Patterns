package com.thejavauniversity.designpatterns.chainofresponsibility;

public class Request {

    private Integer amount;

    public Integer getAmount() {
        return this.amount;
    }

    Request(Integer amount) {
        this.amount = amount;
    }
}
