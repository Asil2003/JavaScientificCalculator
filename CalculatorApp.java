import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.println("You entered: " + number);
        scanner.close();

        double result = Math.sqrt(number);
        System.out.println("Square root: " + result);

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double powerResult = Math.pow(base, exponent);
        System.out.println("Power result: " + powerResult);


    }
}
