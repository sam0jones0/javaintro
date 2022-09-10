import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = reader.nextLine();
        if (name != null) {
            System.out.println("Hello " + name + ".");
        } else {
            System.out.println("Hello");
        }
    }

    public void Greeting() {

    }
}
