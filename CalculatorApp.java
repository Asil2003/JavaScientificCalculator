import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            showMenu();
            System.out.print("Choose an operation (0 to Exit): ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                switch (choice) {
                    case 1:
                        squareRoot(scanner);
                        break;
                    case 2:
                        power(scanner);
                        break;
                    case 3:
                        trigonometric(scanner);
                        break;
                    case 4:
                        logarithms();
                        break;
                    case 5:
                        roundFunctions();
                        break;
                    case 6:
                        minMax();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number entered. Please try again.");
                scanner.nextLine();
            }

            System.out.println("--------------------------------------");
        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("\n=== Scientific Calculator Menu ===");
        System.out.println("1. Square Root");
        System.out.println("2. Power");
        System.out.println("3. Trigonometric (sin, cos, tan)");
        System.out.println("4. Logarithms");
        System.out.println("5. Absolute / Round / Ceil / Floor");
        System.out.println("6. Min / Max");
        System.out.println("0. Exit");
    }

    public static void squareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.println("Square root: " + Math.sqrt(number));
    }

    public static void power(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("Power result: " + Math.pow(base, exponent));
    }

    public static void trigonometric(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("sin: " + Math.sin(radians));
        System.out.println("cos: " + Math.cos(radians));
        System.out.println("tan: " + Math.tan(radians));
    }

    public static void logarithms() {
        System.out.println("Natural log of E: " + Math.log(Math.E));
        System.out.println("Base-10 log of 100: " + Math.log10(100));
    }

    public static void roundFunctions() {
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Round of 3.6: " + Math.round(3.6));
        System.out.println("Ceil of 4.1: " + Math.ceil(4.1));
        System.out.println("Floor of 4.9: " + Math.floor(4.9));
    }

    public static void minMax() {
        System.out.println("Min of 5 and 10: " + Math.min(5, 10));
        System.out.println("Max of 5 and 10: " + Math.max(5, 10));
    }
}
