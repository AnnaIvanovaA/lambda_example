package com.jet.reproduce.a.b.c;

public class RenameClass {
    public static void main(String[] args) {
        System.out.println("rename class");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        renameMethod("someVar");
    }

    public static void renameMethod(String renameVariable){
        renameVariable += "rename";
    }
}
