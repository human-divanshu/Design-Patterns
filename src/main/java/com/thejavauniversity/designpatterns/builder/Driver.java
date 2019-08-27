package com.thejavauniversity.designpatterns.builder;

public class Driver {

    public static void main(String[] args) {
        SampleBuilder sampleBuilder1 = new SampleBuilder.Builder("abc", "xyz").field3("pqr").field4("qwerty").build();
        SampleBuilder sampleBuilder2 = new SampleBuilder.Builder("abc", "xyz").field4("qwerty").build();

        System.out.println(sampleBuilder1);
        System.out.println(sampleBuilder2);
    }
}
