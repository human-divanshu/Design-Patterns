package com.thejavauniversity.designpatterns.chainofresponsibility;

public class BottomLevelApprover extends RequestHandler {

    BottomLevelApprover() {
        this.approvalLimit = 1000;
        this.handlerName = "BottomLevelApprover";
    }
}
