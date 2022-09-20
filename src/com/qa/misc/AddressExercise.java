package com.qa.misc;

public class AddressExercise {
    public static void main(String[] args) {
        int x = 100;
        int y = 5;
        int z = -30;
        int result = x * y * z;
        System.out.println(result);

        String street = "1600 Pennsylvania Avenue NW";
        String city = "Washington";
        String state = "DC";
        int zip = 20500;
        String whitehouseAddress = street + ", " + city + ", " + state + ", " + zip;
        System.out.println(whitehouseAddress);
    }
}
