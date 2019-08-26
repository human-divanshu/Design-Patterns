package com.thejavauniversity.designpatterns.chainofresponsibility;

public abstract class RequestHandler {
    public Integer approvalLimit;

    public String handlerName;

    private RequestHandler successor;

    public void addSuccessor(RequestHandler requestHandler) {
        this.successor = requestHandler;
    }

    public void handleRequest(Request request) {
        if(request.getAmount() < approvalLimit) {
            System.out.println(handlerName + " is handling the request");
        } else {
            if(null != successor) {
                successor.handleRequest(request);
            } else {
                System.out.println("Unable to handle the request!");
            }
        }
    }
}
