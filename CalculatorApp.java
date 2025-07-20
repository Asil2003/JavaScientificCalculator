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

        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("sin: " + Math.sin(radians));
        System.out.println("cos: " + Math.cos(radians));
        System.out.println("tan: " + Math.tan(radians));

        System.out.println("Natural log of E: " + Math.log(Math.E));
        System.out.println("Base-10 log of 100: " + Math.log10(100));

        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Round of 3.6: " + Math.round(3.6));
        System.out.println("Ceil of 4.1: " + Math.ceil(4.1));
        System.out.println("Floor of 4.9: " + Math.floor(4.9));


    }
}
