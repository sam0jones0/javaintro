package com.qa.VarargsExample;

public class VarArgsPrinter {
    VarArgsPrinter(int... args) {
        for (int i : args) {
            System.out.print(i + ", ");
            if (i == args.length - 1) {
                System.out.println(args[args.length - 1]);
                break;
            }
        }
    }

    VarArgsPrinter(String... args) {
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
            if (i == args.length - 2) {
                System.out.println(args[args.length - 1]);
                break;
            }
        }
    }
}
