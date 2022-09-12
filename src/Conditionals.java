import java.lang.ProcessBuilder.Redirect.Type;
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

        System.out.println("Give me a number between 1 and 12:");
        int month = 0;
        do {
            month = getInt();
        } while (1 <= month <= 12);
    }
}
