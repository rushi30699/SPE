package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.lang.Math;


@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);


    Scanner scanner = new Scanner(System.in);
    int choice;

        do {
        System.out.println("Scientific Calculator Menu:");
        System.out.println("1. Square Root (√x)");
        System.out.println("2. Factorial (x!)");
        System.out.println("3. Natural Logarithm (ln(x))");
        System.out.println("4. Power function (x^b)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double sqrtInput = scanner.nextDouble();
                double sqrtResult = Math.sqrt(sqrtInput);
                System.out.println("Square Root: " + sqrtResult);
                break;

            case 2:
                System.out.print("Enter a number: ");
                int factorialInput = scanner.nextInt();
                long factorialResult = calculateFactorial(factorialInput);
                System.out.println("Factorial: " + factorialResult);
                break;

            case 3:
                System.out.print("Enter a number: ");
                double lnInput = scanner.nextDouble();
                double lnResult = Math.log(lnInput);
                System.out.println("Natural Logarithm: " + lnResult);
                break;

            case 4:
                System.out.print("Enter the base (x): ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent (b): ");
                double exponent = scanner.nextDouble();
                double powerResult = Math.pow(base, exponent);
                System.out.println("Power: " + powerResult);
                break;

            case 5:
                System.out.println("Exiting the calculator. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    } while (choice != 5);

        scanner.close();
}

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
