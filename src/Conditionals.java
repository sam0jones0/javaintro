import java.util.Scanner;

public class Conditionals {
    static Scanner reader = new Scanner(System.in);

    private static int getInt() {
        while (true) {
            try {
                final int myInt = Integer.parseInt(reader.nextLine());
                return myInt;
            } catch (NumberFormatException e) {
                System.out.println("Please supply an int:");
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println("Give me a int:");
        // int num1 = getInt();
        // System.out.println("and another one:");
        // int num2 = getInt();
        // System.out.println(Integer.max(num1, num2));

        int month = 0;
        do {
            System.out.println("Give me a number between 1 and 12:");
            month = getInt();
        } while (month < 1 || month > 12);

        switch (month) {
        case 6:
        case 7:
        case 8: {
            System.out.println("Month number " + month + " is in Summer");
        }
        case 9:
        case 10:
        case 11: {
            System.out.println("Month number " + month + " is in Autumn");
        }
        case 12:
        case 1:
        case 2: {
            System.out.println("Month number " + month + " is in Winter");
        }
        case 3:
        case 4:
        case 5: {
            System.out.println("Month number " + month + " is in Spring");
        }
        }
    }
}
