package com.jet.rendererTypeCheck;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        //rendererTypeChech();
        rendererLengthCheck();

    }

    public static void rendererLengthCheck() {
        String strFull = LongString.stringLength706;
        String strCutted = LongString.stringLength1412;
        String strFullLongest = LongString.stringLength4236;
        String strShort = LongString.shortString;

        System.out.println(LongString.stringLength706);
    }






    public static void rendererTypeChech(){
        Calendar eventStart = Calendar.getInstance();
        eventStart.set(2018, Calendar.FEBRUARY, 10);

        Calendar eventEnd = Calendar.getInstance();
        eventEnd.set(2018, Calendar.MARCH, 10);

        Duration eventDuration = new Duration(eventStart, eventEnd);

        System.out.println(calculations(eventDuration));
    }

    public static String calculations(Duration eventDuration){
        return "Smth";
    }


}
