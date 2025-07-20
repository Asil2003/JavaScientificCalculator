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

    // We'll define methods like performAddition(scanner) in upcoming steps
}
