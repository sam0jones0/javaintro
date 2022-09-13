public class ReformatExercise {
    public static void main(String[] args) {
        // Consider the following code snippet.
        // if (aNumber >= 0)
        // if (aNumber == 0)
        // System.out.println("first string");
        // else System.out.println("second string");
        // System.out.println("third string");
        // What output do you think the code will produce if aNumber is 3?
        // Using only spaces and line breaks, reformat the code snippet to make the
        // control flow easier to understand.
        // Use braces, { and }, to further clarify the code.

        int aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0)
                System.out.println("First string");
            else
                System.out.println("Second string");

        }
        System.out.println("Third String");

        // int no = 3;
        // if (no >= 0)
        //     System.out.println("First String");
        // else
        //     System.out.println("Third String");
        // if (no == 0)
        //     System.out.println("Second String");

    }
}
