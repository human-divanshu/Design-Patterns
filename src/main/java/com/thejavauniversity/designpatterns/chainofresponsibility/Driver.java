package com.thejavauniversity.designpatterns.chainofresponsibility;

public class Driver {
    public static void main(String[] args) {
        BottomLevelApprover bottomLevelApprover = new BottomLevelApprover();
        MidLevelApprover midLevelApprover = new MidLevelApprover();
        TopLevelApprover topLevelApprover = new TopLevelApprover();

        bottomLevelApprover.addSuccessor(midLevelApprover);
        midLevelApprover.addSuccessor(topLevelApprover);

        Request r1 = new Request(20);
        Request r2 = new Request(2000);
        Request r3 = new Request(20000);
        Request r4 = new Request(20000000);

        bottomLevelApprover.handleRequest(r1);
        bottomLevelApprover.handleRequest(r2);
        bottomLevelApprover.handleRequest(r3);
        bottomLevelApprover.handleRequest(r4);
    }
}
