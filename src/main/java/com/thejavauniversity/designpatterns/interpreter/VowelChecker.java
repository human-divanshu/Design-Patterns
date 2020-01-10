package com.thejavauniversity.designpatterns.interpreter;

import java.util.Arrays;
import java.util.List;

public class VowelChecker implements Expression {

    private String s;
    private List<String> vowels = Arrays.asList(new String[]{"a", "e", "i", "o", "u"});

    VowelChecker(String s) {
        this.s = s;
    }

    @Override
    public boolean interpret() {
        return s.length() == 1 &&
                vowels.stream().anyMatch(x -> x.equalsIgnoreCase(s));
    }
}
