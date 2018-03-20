package com.jet;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Person> pl = Person.createShortList();

        System.out.println("all persons list");

        pl.forEach( p -> p.printWesternName() );

        System.out.println("done");
    }

}
