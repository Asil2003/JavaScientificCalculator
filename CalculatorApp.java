import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();

            int choice = getValidInt(scanner, "Choose an option (0 to Exit): ");

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
                    System.out.println("👋 Exiting calculator. Goodbye!");
                    running = false;
                }
                default -> System.out.println("❌ Invalid option. Please choose a valid menu number.");
            }

            System.out.println("--------------------------------------");
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n=== 🔢 Scientific Calculator ===");
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

    // Helper method to get a valid int from user
    public static int getValidInt(Scanner scanner, String prompt) {
        int num;
        while (true) {
            System.out.print(prompt);
            try {
                num = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input! Please enter an integer.");
                scanner.nextLine(); // clear invalid input
            }
        }
        return num;
    }

    // Helper method to get a valid double from user
    public static double getValidDouble(Scanner scanner, String prompt) {
        double num;
        while (true) {
            System.out.print(prompt);
            try {
                num = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
        return num;
    }

    public static void performAddition(Scanner scanner) {
        double a = getValidDouble(scanner, "Enter first number: ");
        double b = getValidDouble(scanner, "Enter second number: ");
        System.out.printf("✅ Result: %.4f + %.4f = %.4f%n", a, b, a + b);
    }

    public static void performSubtraction(Scanner scanner) {
        double a = getValidDouble(scanner, "Enter first number: ");
        double b = getValidDouble(scanner, "Enter second number: ");
        System.out.printf("✅ Result: %.4f - %.4f = %.4f%n", a, b, a - b);
    }

    public static void performMultiplication(Scanner scanner) {
        double a = getValidDouble(scanner, "Enter first number: ");
        double b = getValidDouble(scanner, "Enter second number: ");
        System.out.printf("✅ Result: %.4f * %.4f = %.4f%n", a, b, a * b);
    }

    public static void performDivision(Scanner scanner) {
        double a = getValidDouble(scanner, "Enter numerator: ");
        double b;
        while (true) {
            b = getValidDouble(scanner, "Enter denominator (non-zero): ");
            if (b != 0) break;
            System.out.println("❌ Error: Denominator cannot be zero.");
        }
        System.out.printf("✅ Result: %.4f / %.4f = %.4f%n", a, b, a / b);
    }

    public static void performSquareRoot(Scanner scanner) {
        double num;
        while (true) {
            num = getValidDouble(scanner, "Enter a non-negative number: ");
            if (num >= 0) break;
            System.out.println("❌ Error: Number must be non-negative.");
        }
        System.out.printf("✅ Square root of %.4f is %.4f%n", num, Math.sqrt(num));
    }

    public static void performPower(Scanner scanner) {
        double base = getValidDouble(scanner, "Enter base: ");
        double exp = getValidDouble(scanner, "Enter exponent: ");
        System.out.printf("✅ Result: %.4f ^ %.4f = %.4f%n", base, exp, Math.pow(base, exp));
    }

    public static void performSine(Scanner scanner) {
        double angle = getValidDouble(scanner, "Enter angle in degrees: ");
        System.out.printf("✅ sin(%.4f°) = %.4f%n", angle, Math.sin(Math.toRadians(angle)));
    }

    public static void performCosine(Scanner scanner) {
        double angle = getValidDouble(scanner, "Enter angle in degrees: ");
        System.out.printf("✅ cos(%.4f°) = %.4f%n", angle, Math.cos(Math.toRadians(angle)));
    }

    public static void performTangent(Scanner scanner) {
        double angle = getValidDouble(scanner, "Enter angle in degrees: ");
        double modAngle = angle % 180;
        if (modAngle == 90 || modAngle == -90) {
            System.out.println("❌ Error: Tangent undefined at " + angle + " degrees.");
        } else {
            System.out.printf("✅ tan(%.4f°) = %.4f%n", angle, Math.tan(Math.toRadians(angle)));
        }
    }

    public static void performNaturalLog(Scanner scanner) {
        double num;
        while (true) {
            num = getValidDouble(scanner, "Enter a positive number: ");
            if (num > 0) break;
            System.out.println("❌ Error: Number must be positive.");
        }
        System.out.printf("✅ Natural log of %.4f is %.4f%n", num, Math.log(num));
    }

    public static void performLogBase10(Scanner scanner) {
        double num;
        while (true) {
            num = getValidDouble(scanner, "Enter a positive number: ");
            if (num > 0) break;
            System.out.println("❌ Error: Number must be positive.");
        }
        System.out.printf("✅ Log base 10 of %.4f is %.4f%n", num, Math.log10(num));
    }

    public static void performAbsolute(Scanner scanner) {
        double num = getValidDouble(scanner, "Enter a number: ");
        System.out.printf("✅ Absolute value of %.4f is %.4f%n", num, Math.abs(num));
    }

    public static void performRound(Scanner scanner) {
        double num = getValidDouble(scanner, "Enter a number: ");
        System.out.printf("✅ Rounded value of %.4f is %d%n", num, Math.round(num));
    }

    public static void performCeil(Scanner scanner) {
        double num = getValidDouble(scanner, "Enter a number: ");
        System.out.printf("✅ Ceiling value of %.4f is %.4f%n", num, Math.ceil(num));
    }

    public static void performFloor(Scanner scanner) {
        double num = getValidDouble(scanner, "Enter a number: ");
        System.out.printf("✅ Floor value of %.4f is %.4f%n", num, Math.floor(num));
    }

    public static void performMinMax(Scanner scanner) {
        double a = getValidDouble(scanner, "Enter first number: ");
        double b = getValidDouble(scanner, "Enter second number: ");
        System.out.printf("✅ Min(%.4f, %.4f) = %.4f%n", a, b, Math.min(a, b));
        System.out.printf("✅ Max(%.4f, %.4f) = %.4f%n", a, b, Math.max(a, b));
    }
}
