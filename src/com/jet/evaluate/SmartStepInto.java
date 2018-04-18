package com.jet.evaluate;

public class SmartStepInto {
    //breakpoint for main method
    public static void main(String[] args) {
        bar(() -> System.out.println("Hello"));
    }

    public static void bar(Runnable r) {
        r.run();
    }
}
