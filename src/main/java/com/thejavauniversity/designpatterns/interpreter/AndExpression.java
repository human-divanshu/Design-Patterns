package com.thejavauniversity.designpatterns.interpreter;

public class AndExpression implements Expression {

    private Expression e1;
    private Expression e2;

    AndExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public boolean interpret() {
        return e1.interpret() && e2.interpret();
    }
}
