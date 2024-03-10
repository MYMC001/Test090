import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to our program.");
        
        // Close the scanner
        scanner.close();
    }
}
