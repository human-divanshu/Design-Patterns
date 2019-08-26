package com.thejavauniversity.designpatterns.chainofresponsibility;

public class TopLevelApprover extends RequestHandler {

    TopLevelApprover() {
        this.approvalLimit = 1000000;
        this.handlerName = "TopLevelApprover";
    }
}
