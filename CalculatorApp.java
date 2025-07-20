import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();

            try {
                System.out.print("Choose an option (1–16 or 0 to Exit): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> performAddition(scanner);
                    case 2 -> performSubtraction(scanner);
                    case 3 -> performMultiplication(scanner);
                    case 4 -> performDivision(scanner);
                    case 5 -> performSquareRoot(scanner);
                    case 6 -> performPower(scanner);
                    case 7 -> performSine(scanner);
                    case 8 -> performCosine(scanner);
                    case 9 -> performTangent(scanner);
                    case 10 -> performNaturalLog(scanner);
                    case 11 -> performLogBase10(scanner);
                    case 12 -> performAbsolute(scanner);
                    case 13 -> performRound(scanner);
                    case 14 -> performCeil(scanner);
                    case 15 -> performFloor(scanner);
                    case 16 -> performMinMax(scanner);
                    case 0 -> {
                        System.out.println("Exiting calculator. Goodbye!");
                        running = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
                scanner.nextLine(); // Clear invalid input
            }
            System.out.println("--------------------------------------");
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Min/Max");
        System.out.println("0. Exit");
    }

    public static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a + b));
    }

    public static void performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a - b));
    }

    public static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a * b));
    }

    public static void performDivision(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double a = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double b = scanner.nextDouble();
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of negative number.");
        } else {
            System.out.println("Square root: " + Math.sqrt(num));
        }
    }

    public static void performPower(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exp = scanner.nextDouble();
        System.out.println("Power: " + Math.pow(base, exp));
    }

    public static void performSine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        System.out.println("Sine: " + Math.sin(Math.toRadians(angle)));
    }

    public static void performCosine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        System.out.println("Cosine: " + Math.cos(Math.toRadians(angle)));
    }

    public static void performTangent(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        // Handle special cases where tangent is undefined
        double modAngle = angle % 180;
        if (modAngle == 90 || modAngle == -90) {
            System.out.println("Error: Tangent undefined at " + angle + " degrees.");
        } else {
            System.out.println("Tangent: " + Math.tan(Math.toRadians(angle)));
        }
    }

    public static void performNaturalLog(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        if (num <= 0) {
            System.out.println("Error: Natural logarithm undefined for non-positive numbers.");
        } else {
            System.out.println("Natural log: " + Math.log(num));
        }
    }

    public static void performLogBase10(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        if (num <= 0) {
            System.out.println("Error: Logarithm base 10 undefined for non-positive numbers.");
        } else {
            System.out.println("Log base 10: " + Math.log10(num));
        }
    }

    public static void performAbsolute(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        System.out.println("Absolute value: " + Math.abs(num));
    }

    public static void performRound(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        System.out.println("Rounded: " + Math.round(num));
    }

    public static void performCeil(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        System.out.println("Ceiling: " + Math.ceil(num));
    }

    public static void performFloor(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        System.out.println("Floor: " + Math.floor(num));
    }

    public static void performMinMax(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Max: " + Math.max(a, b));
    }
}
