package com.qa.misc;

import java.lang.StringBuilder;

public class ArraysAndStrings {
    private char[] chars = { 'a', 'b', 'c', 'd' };

    public ArraysAndStrings() {
        System.out.print("For loop: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public void forEach() {
        System.out.print("For each loop: ");
        for (char c : chars) {
            System.out.print(c);
        }
    }

    public String myStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        ArraysAndStrings ex = new ArraysAndStrings();
        ex.forEach();
        System.out.println('\n' + "StringBuilder: " + ex.myStringBuilder());
    }
}
