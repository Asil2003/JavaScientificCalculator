import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main loop to keep calculator running
        while (true) {
            showMenu();  // Display operations menu
            System.out.print("Choose an operation (0 to Exit): ");

            try {
                choice = scanner.nextInt();  // Read user's choice
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.nextLine();  // Clear invalid input
                continue;
            }

            if (choice == 0) {
                System.out.println("👋 Goodbye! Thank you for using the Scientific Calculator.");
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
                        System.out.println("❗ Invalid choice. Please select a number from 0 to 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid number entered. Please try again.");
                scanner.nextLine();  // Clear invalid input
            }

            System.out.println("--------------------------------------");
        }

        scanner.close();  // Close the scanner at end
    }

    // Display the operations menu
    public static void showMenu() {
        System.out.println("\n📐 === Scientific Calculator Menu ===");
        System.out.println("1️⃣  Square Root");
        System.out.println("2️⃣  Power (base ^ exponent)");
        System.out.println("3️⃣  Trigonometric (sin, cos, tan)");
        System.out.println("4️⃣  Logarithms (Natural, Base-10)");
        System.out.println("5️⃣  Absolute / Round / Ceil / Floor");
        System.out.println("6️⃣  Min / Max of two numbers");
        System.out.println("0️⃣  Exit");
    }

    // Calculate square root of a number
    public static void squareRoot(Scanner scanner) {
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();
        System.out.println("✅ Square root of " + number + " is: " + Math.sqrt(number));
    }

    // Raise base to the power of exponent
    public static void power(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("✅ " + base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));
    }

    // Calculate sin, cos, tan of an angle in degrees
    public static void trigonometric(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);  // Convert degrees to radians
        System.out.println("✅ sin(" + degrees + "°) = " + Math.sin(radians));
        System.out.println("✅ cos(" + degrees + "°) = " + Math.cos(radians));
        System.out.println("✅ tan(" + degrees + "°) = " + Math.tan(radians));
    }

    // Show logarithmic values
    public static void logarithms() {
        System.out.println("✅ Natural log of e: " + Math.log(Math.E));  // log base e
        System.out.println("✅ Base-10 log of 100: " + Math.log10(100)); // log base 10
    }

    // Show absolute, round, ceil and floor examples
    public static void roundFunctions() {
        System.out.println("✅ Absolute value of -10: " + Math.abs(-10));
        System.out.println("✅ Rounded value of 3.6: " + Math.round(3.6));
        System.out.println("✅ Ceil value of 4.1: " + Math.ceil(4.1));
        System.out.println("✅ Floor value of 4.9: " + Math.floor(4.9));
    }

    // Show minimum and maximum between two numbers
    public static void minMax() {
        System.out.println("✅ Min of 5 and 10: " + Math.min(5, 10));
        System.out.println("✅ Max of 5 and 10: " + Math.max(5, 10));
    }
}
