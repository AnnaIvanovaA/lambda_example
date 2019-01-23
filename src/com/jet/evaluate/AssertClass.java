package com.jet.evaluate;

public class AssertClass {


    public static void main(String[] args) {
        AssertClass assertClass = new AssertClass();
        //assertClass.sum(13243567, 43344);
        System.out.println();

        int value = 15;
        assert value >= 20 : "Error message";
        System.out.println("value is "+value);


    }

    public int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Value of " + a + " + " + b + " is too large to add.";
        final int result = a + b +1000;
        assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
        return result;
    }
}
