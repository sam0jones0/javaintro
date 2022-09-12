import java.util.Scanner;

public class SayHello {
    static Scanner reader = new Scanner(System.in);

    /**
     * Reads a single line from standard input and returns.
     * 
     * @return The next line of standard input. Or an error message if there is no
     *         next line.
     */
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
        Boolean repeat = true;
        while (repeat) {
            try {
                final int countTo = Integer.parseInt(readStdIn());
                count(countTo);
                repeat = false;
            } catch (NumberFormatException e) {
                System.out.println("Please supply an int:");
            }
        }

        int intA = 7;
        double doubleA = 3.141;
        boolean boolA = true;
        char charA = '\u2611';

        System.out.println("I am an int " + intA);
        System.out.println("I am a double " + doubleA);
        System.out.println("I am a boolean " + boolA);
        System.out.println("I am a char " + charA);

        System.out.println("Goodbye.");
        reader.close();
    }
}
