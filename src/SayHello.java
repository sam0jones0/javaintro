import java.util.Scanner;

public class SayHello {
    static Scanner reader = new Scanner(System.in);

    private static String readStdIn() {
        while (reader.hasNextLine()) {
            String input = reader.nextLine();
            return input;
        }
        return "Error: Read empty line";
    }

    public static void greeting(String name) {
        if (name != null) {
            System.out.println("Hello " + name + ".");
        } else {
            System.out.println("Hello");
        }
    }

    public static void count(int countTo) {
        for (int i = 1; i < countTo + 1; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        final String name = readStdIn();
        greeting(name);

        System.out.println("Count to what number?");
        final int countTo = Integer.parseInt(readStdIn());
        count(countTo);

        System.out.println("Goodbye.");
        reader.close();
    }
}
