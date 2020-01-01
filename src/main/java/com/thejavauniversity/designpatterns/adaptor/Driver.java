package com.thejavauniversity.designpatterns.adaptor;

public class Driver {
    public static void main(String[] args) {
        Algorithm algorithm = new OldAlgorithm();
        doSomething(algorithm);

        Algorithm newAlgorithm = new Adapter();
        doSomething(newAlgorithm);
    }

    static void doSomething(Algorithm algorithm) {
        algorithm.process();
    }
}

/*
Hi, I wanted to have a little chat with you. I am bit confused about my next step in career and I have no one else to talk to.
So, I am here seeking advice. Last month I declined the offer from Microsoft and Goldman to accept the offer from C2FO.
But yesterday, HR from Goldman called me with an updated offer which is way more than I will make at C2FO.
I never told them about offer from C2FO, nor I am here to negotiate with you. I am just confused about my next step because
whatever I will choose now will be a long term commitment as I am planning to settle down in year or two.
I see you as a mentor not a boss. Hence, I was looking for a advice from your side.
 */