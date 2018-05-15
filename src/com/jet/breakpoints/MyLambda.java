package com.jet.breakpoints;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MyLambda {

    //4 BPs - Java Field Watchpoint, line, lambda, All -- fixed in 182
    private static final Predicate<Object> isNull = x -> x == null;

    public static void main(String[] args) {

        method1();
        method2();
        method3();


        if (isNull.test(null)) {
            int m = testMethod(3);
            System.out.println("Hello World!");
        }


        User user1 = new User(); // should stop at User class - default constructor

        user1.setName("John"); //BPs in User class
        user1.setAge(6);

        //Exception BP - NPE
        User user2 = null;
        user2.getAge(); //--NPE is thrown

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        String s;

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 150; i++) {
            numbersList.add(i);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        numbers.forEach(value -> System.out.println(value));
        numbers.forEach(System.out::println);

        System.out.println(MyLambda.sumAll(numbers, n ->n % 2 == 0));  //condition BP - removal confirmation - in later builds (182)
        System.out.println(MyLambda.sumAll(numbers, n -> n < 4));       //lambda BP


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
        names.forEach(System.out::println);

        int v = testMethod(8);
        int k = testMethod(6);

    }

    public static int testMethod(int value) {
        return value+3;
    }


    public static int sumAll(@NotNull List<Integer> numbers, Predicate<Integer> p) {  //Method BP
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

    public static void method1(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void method2(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void method3(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
