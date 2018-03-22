package com.jet.lambda_tutorials;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MyLambda {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        for (int number : numbers) {
            System.out.println(number);
        }

        numbers.forEach(value -> System.out.println(value));
        numbers.forEach(System.out::println);

        System.out.println(MyLambda.sumAll(numbers, n -> n % 2 == 0));
        System.out.println(MyLambda.sumAll(numbers, n -> n < 4));


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
        names.forEach(System.out::println);



    }


    public static int sumAll(@NotNull List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}
