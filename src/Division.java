import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void divide() {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;

        try {
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            denominator = scanner.nextInt();

            double result = numerator / (double) denominator;

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Infinity result: Division by zero is not allowed!");
            }

            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
