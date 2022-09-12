import java.util.Scanner;

public class VariablesExercise {

    static Scanner reader = new Scanner(System.in);

    private static String readStdIn() {
        while (reader.hasNextLine()) {
            String input = reader.nextLine();
            return input;
        }
        return "Error: Read empty line";
    }

    public static void main(String[] args) {
        // String firstName = "Sam";
        // String lastName = "Jones";
        // String name = firstName + " " + lastName;
        // System.out.println(name);

        // int num1 = 1000000;
        // int num2 = 1231;
        // System.out.println(num1 + num2);

        // float result = (float) num1 / num2;
        // System.out.println(result);

        // int num3 = 8;
        // System.out.println(num3++);
        // System.out.println(num3);
        // System.out.println(++num3);

        System.out.println("Please enter your first name:");
        String fname = readStdIn();
        System.out.println("And your second name?");
        System.out.println("Hello " + fname + " " + readStdIn());
    }
}
