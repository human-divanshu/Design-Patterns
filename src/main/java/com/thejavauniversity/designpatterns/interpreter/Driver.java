package com.thejavauniversity.designpatterns.interpreter;

public class Driver {

    public static void main(String[] args) {
        Expression e1 = new VowelChecker("a");
        Expression e2 = new VowelChecker("s");

        System.out.println(new OrExpression(e1, e2).interpret());
        System.out.println(new AndExpression(e1, e2).interpret());


    }
}
