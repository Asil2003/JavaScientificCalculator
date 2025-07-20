import java.util.Scanner; // Step 1: Import Scanner class

public class CalculatorApp {
    public static void main(String[] args) {
        // Step 2: Create Scanner object
        Scanner inputReader = new Scanner(System.in);

        // Step 3: Read different input types
        System.out.print("Enter your name: ");
        String name = inputReader.nextLine();

        System.out.print("Enter your age: ");
        int age = inputReader.nextInt();

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = inputReader.nextDouble();

        // Step 4: Display output
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("And you are " + height + " meters tall.");

        // Step 5: Close Scanner
        inputReader.close();
    }
}
