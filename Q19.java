import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        if (op == '+') {
            result = a + b;
            System.out.println("Result = " + result);
        } 
        else if (op == '-') {
            result = a - b;
            System.out.println("Result = " + result);
        } 
        else if (op == '*') {
            result = a * b;
            System.out.println("Result = " + result);
        } 
        else if (op == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } 
        else {
            System.out.println("Invalid operator.");
        }
    }
}