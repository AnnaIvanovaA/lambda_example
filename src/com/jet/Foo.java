package com.jet;

public class Foo {

    private final Integer i;
    private final String str;
    public Foo(Integer i, String str) {
        this.i = i;
        this.str = str;


    }
    public String getStr() {
        return str;
    }
    public Integer getI() {
        return i;
    }
    public static void func(Foo foo) {
        String s = foo.getStr(); // bt is here
    }

    public static void main(String[] args) {
        Foo.func(new Foo(155, "Qwrewerwe"));
    }
}
