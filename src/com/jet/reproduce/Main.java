package com.jet.reproduce;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int n;
        String s;

        someMethod();
        System.out.println("stmg");

    }

    public static void someMethod(){
        final HashMap<GiantClassNameToReproduceAnIssueFromYouTrack, HashMap<VeryLongClassNameToReproduceBug, HashMap<LongClassNameToReproduceBug, String>>>
                nameHashMap =
                new HashMap<>();
    }
}
