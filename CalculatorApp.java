import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");

        // Get two numbers from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Choose operation
        System.out.println("Choose operation: add, subtract, multiply, divide");
        String operation = scanner.next();

        double result = 0;

        switch (operation.toLowerCase()) {
            case "add":
                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "multiply":
                result = num1 * num2;
                break;

            case "divide":
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
