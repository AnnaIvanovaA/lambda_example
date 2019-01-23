package com.jet.settings;

import java.io.IOException;

public class GracefulExit {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Exit (by default)
        System.out.println("smth");
        System.out.println("--------------");

        //Turn on the setting (stop)
        //Settings | Build, Execution, Deployment | Debugger | Kill the debug process immediatelly

        System.out.println("you shouldn't see it");
        //1st exit stop here

        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("line after exit")));
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1000);
            System.out.println("tick");
        }
        //2nd exit stop here
        System.out.println("after cycle");

    }


}
