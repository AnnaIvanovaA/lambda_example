package com.jet.packageRetestReproduce.threedots;

import java.awt.*;

public class ThreeDotsClass implements MySum {
    public static void main(String[] args) {

        ThreeDotsClass threeDotsClass = new ThreeDotsClass();
        Object object = new Object();

        threeDotsClass.sum(object, 2, 5, 6);
        threeDotsClass.sum(new Integer[]{1,2,3});


        threeDotsClass.polygonFrom(object, new Point(1,1), new Point(2,2));

        String name = "qq";
        int idnum = 44;
        String address = "zz";
        System.out.printf("%s: %d, %s%n", name, idnum, address);




    }

    @Override
    public int sum(Integer... args) {
        int sum = 10;
        for(int arg : args) {
            sum += arg +2;
        }
        return sum;
    }

    @Override
    public int sum(Object object, int... args) {
        int sum = 0;
        for(int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public Polygon polygonFrom(Object object, Point... corners) {
        int numberOfSides = corners.length;
        double squareOfSide1, lengthOfSide1;
        squareOfSide1 = (corners[1].x - corners[0].x)
                * (corners[1].x - corners[0].x)
                + (corners[1].y - corners[0].y)
                * (corners[1].y - corners[0].y);
        lengthOfSide1 = Math.sqrt(squareOfSide1);

        // more method body code follows that creates and returns a
        // polygon connecting the Points
        return new Polygon();
    }



}
