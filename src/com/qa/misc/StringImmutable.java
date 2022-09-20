package com.qa.misc;

public class StringImmutable {
    public static void main(String[] args) {
        String s = "Hello";
        meth(s);
        System.out.println(s);
    }

    public static void meth(String x) {
        x = x + " World!";
    }
}
