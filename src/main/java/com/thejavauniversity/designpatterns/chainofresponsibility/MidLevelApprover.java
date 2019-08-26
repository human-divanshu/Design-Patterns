package com.thejavauniversity.designpatterns.chainofresponsibility;

public class MidLevelApprover extends RequestHandler {

    MidLevelApprover() {
        this.approvalLimit = 10000;
        this.handlerName = "MidLevelApprover";
    }
}
