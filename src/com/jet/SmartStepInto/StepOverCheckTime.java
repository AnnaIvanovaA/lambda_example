package com.jet.SmartStepInto;

import java.util.HashMap;
import java.util.Map;

public class StepOverCheckTime {
    public static void main(String[] args) {
//        someAction(); /*breakpoint here*/
        someAction(); /*breakpoint here*/
        someAction(); /*breakpoint here*/
        someAction(); /*breakpoint here*/
        System.out.println("STOP");
    }

    public static void someAction() {
        final Map<String, String> map = new HashMap<>();

        System.out.println("ManagerImpl.someAction implementation start");
        long start = System.currentTimeMillis();
        for (int idx = 0; idx < 100000; idx++) {
            map.put(String.valueOf(idx), "Number " + idx);
        }
        System.out.println("someAction() stop, " + (System.currentTimeMillis() - start));
    }
}
