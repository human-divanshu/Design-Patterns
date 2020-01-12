package com.thejavauniversity.designpatterns.visitor;

public class System1 implements System {
    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
