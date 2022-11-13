import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Básico, pero importante");

        /* if */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce tu edad: ");
            int age = scanner.nextInt();

            if (age > 0) {
                if (age < 18) {
                    System.out.println("Too young");
                } else if (age > 100) {
                    System.out.println("Really?");
                } else {
                    System.out.println("Good!");
                }
            }

        }

    }
}
