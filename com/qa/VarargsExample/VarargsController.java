package com.qa.VarargsExample;

public class VarargsController {
    public static void main(String[] args) {
        printArgs(1, 2, 3, 4, 5);
    }

    public static void printArgs(int... args) {
        VarArgsPrinter vargs = new VarArgsPrinter(args);
        System.out.println("Number of Arguments: " + args.length);
    }
}
