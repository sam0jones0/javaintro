package com.qa.misc;

import java.util.Scanner;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input the length: ");
        int l = reader.nextInt();
        System.out.println("input the width: ");
        int w = reader.nextInt();

        System.out.println("Area of rectangle is: " + Rectangle.getArea(l, w));
        reader.close();
    }
}
