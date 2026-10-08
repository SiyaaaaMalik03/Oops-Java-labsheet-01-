import java.util.Scanner;

/*
 * Labsheet 1 - Object Oriented Java
 * 
 * Course  : MCA 3rd Semester, College of Smart Computing
 *
 * Each question is written as a method of the class LabPrograms.
 * main() creates an object of LabPrograms and calls the methods through a menu.
 */

class LabPrograms {

    Scanner sc = new Scanner(System.in);

    // 1. Display name, age and college using appropriate data types
    void q1() {
        String name = "xyz";
        int age = 22; // change to your actual age
        String college = "College of Smart Computing";
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
    }

    // 2. Arithmetic operations on two integers
    void q2() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        if (b != 0) {
            System.out.println("Division       : " + (a / b));
            System.out.println("Modulus        : " + (a % b));
        } else {
            System.out.println("Division and modulus not possible (divide by zero).");
        }
    }

    // 3. Even or odd
    void q3() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    // 4. Relational operators
    void q4() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " >  " + b + " : " + (a > b));
        System.out.println(a + " <  " + b + " : " + (a < b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
    }

    // 5. Float to int explicit conversion
    void q5() {
        System.out.print("Enter a floating-point number: ");
        float f = sc.nextFloat();
        int i = (int) f;
        System.out.println("Original value  : " + f);
        System.out.println("Converted value : " + i);
    }

    // 6. ASCII value of a character
    void q6() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value of '" + ch + "' is " + (int) ch);
    }

    // 7. Divisible by both 3 and 5
    void q7() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0)
            System.out.println(n + " is divisible by both 3 and 5");
        else
            System.out.println(n + " is NOT divisible by both 3 and 5");
    }

    // 8. Vowel or consonant
    void q8() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet.");
            return;
        }
        char c = Character.toLowerCase(ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println(ch + " is a Vowel");
        else
            System.out.println(ch + " is a Consonant");
    }

    // 9. Marks, total, percentage, pass/fail (>=40% in all subjects)
    void q9() {
        System.out.print("Enter marks of three subjects (out of 100): ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double total = m1 + m2 + m3;
        double percentage = total / 3;
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result     : PASS");
        else
            System.out.println("Result     : FAIL");
    }

    // 10. Greatest of two numbers
    void q10() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both numbers are equal");
    }

    // 11. Largest of three using nested if-else
    void q11() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if (a >= b) {
            if (a >= c)
                largest = a;
            else
                largest = c;
        } else {
            if (b >= c)
                largest = b;
            else
                largest = c;
        }
        System.out.println("Largest number is " + largest);
    }

    // 12. Leap year
    void q12() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }

    // 13. Positive, negative or zero
    void q13() {
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    // 14. Character classification
    void q14() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase letter");
        else
            System.out.println("Special character");
    }

    // 15. Armstrong number (3-digit)
    void q15() {
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Not a 3-digit number.");
            return;
        }
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is NOT an Armstrong number");
    }

    // 16. Tax calculation based on income slabs
    void q16() {
        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();
        double tax;
        if (salary <= 250000)
            tax = 0;
        else if (salary <= 500000)
            tax = salary * 0.05;
        else if (salary <= 1000000)
            tax = salary * 0.20;
        else
            tax = salary * 0.30;
        System.out.println("Tax payable : " + tax);
    }

    // 17. Palindrome number using arithmetic operations and type casting
    void q17() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        long rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        int reversed = (int) rev; // explicit type casting from long to int
        if (n >= 0 && reversed == n)
            System.out.println(n + " is a Palindrome");
        else
            System.out.println(n + " is NOT a Palindrome");
    }

    // 18. Prime or not
    void q18() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime)
            System.out.println(n + " is a Prime number");
        else
            System.out.println(n + " is NOT a Prime number");
    }

    // 19. Operator check and calculation
    void q19() {
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (op == '+')
                System.out.println("Result: " + (a + b));
            else if (op == '-')
                System.out.println("Result: " + (a - b));
            else if (op == '*')
                System.out.println("Result: " + (a * b));
            else {
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Division by zero is not possible.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }

    // 20. Marriage eligibility (male >= 21, female >= 18)
    void q20() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char g = Character.toUpperCase(sc.next().charAt(0));
        if (g == 'M') {
            if (age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else if (g == 'F') {
            if (age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else {
            System.out.println("Invalid gender entered.");
        }
    }
}

public class Labsheet1 {
    public static void main(String[] args) {
        LabPrograms lab = new LabPrograms(); // object of the class
        Scanner sc = lab.sc;
        int choice;

        do {
            System.out.println("\n========== LABSHEET 1 - JAVA (OOP) ==========");
            System.out.println(" 1. Name, age, college        11. Largest of three");
            System.out.println(" 2. Arithmetic operations     12. Leap year");
            System.out.println(" 3. Even / Odd                13. Positive / Negative / Zero");
            System.out.println(" 4. Relational operators      14. Character classification");
            System.out.println(" 5. Float to int              15. Armstrong number");
            System.out.println(" 6. ASCII value               16. Income tax");
            System.out.println(" 7. Divisible by 3 and 5      17. Palindrome number");
            System.out.println(" 8. Vowel / Consonant         18. Prime number");
            System.out.println(" 9. Marks and result          19. Operator and calculation");
            System.out.println("10. Greatest of two           20. Marriage eligibility");
            System.out.println(" 0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:  lab.q1();  break;
                case 2:  lab.q2();  break;
                case 3:  lab.q3();  break;
                case 4:  lab.q4();  break;
                case 5:  lab.q5();  break;
                case 6:  lab.q6();  break;
                case 7:  lab.q7();  break;
                case 8:  lab.q8();  break;
                case 9:  lab.q9();  break;
                case 10: lab.q10(); break;
                case 11: lab.q11(); break;
                case 12: lab.q12(); break;
                case 13: lab.q13(); break;
                case 14: lab.q14(); break;
                case 15: lab.q15(); break;
                case 16: lab.q16(); break;
                case 17: lab.q17(); break;
                case 18: lab.q18(); break;
                case 19: lab.q19(); break;
                case 20: lab.q20(); break;
                case 0:  System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
