package com.jet.reproduce.a.b.c;

public class RenameClass {
    public static void main(String[] args) {
        System.out.println("rename class");

        renameMethod("someVar");
    }

    public static void renameMethod(String renameVariable){
        renameVariable += "rename";
    }
}
