import java.util.*;

public class calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;

            case '-':
                System.out.println("Difference: " + (a - b));
                break;

            case '*':
                System.out.println("Product: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Quotient: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation.");
                break;
        }

        sc.close();
    }
}

