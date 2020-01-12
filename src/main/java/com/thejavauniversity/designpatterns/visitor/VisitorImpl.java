package com.thejavauniversity.designpatterns.visitor;


public class VisitorImpl implements Visitor {

    @Override
    public void visit(System system) {
        java.lang.System.out.println("Visiting " + system.getClass().getName());
    }
}
