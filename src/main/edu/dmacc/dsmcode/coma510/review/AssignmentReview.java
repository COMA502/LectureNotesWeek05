package edu.dmacc.dsmcode.coma510.review;

import java.util.Scanner;

public class AssignmentReview {

    public static void main(String[] args) {
//        problem1();
//        problem2();
//        problem3();
//        problem4();
        problem5();
    }

    public static void problem1() {
        // Problem 1.) Prompt user to input a number using a Scanner (from Week3).
        // Print a message to screen if and
        // only if the entered number is divisible by 7.
        int number = getNumberFromUser();

        if (number % 7 == 0) {
            System.out.println(number);
        }
    }

    public static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        return number;
    }

    public static void problem2() {
        // Problem 2.) Prompt user to input a number using a Scanner (from Week3).
        // Print a message to screen if and only if the entered number is between 10 and 20 inclusive.
        int number = getNumberFromUser();

        if (number >= 10 && number <= 20) {
            System.out.println(number);
        }
    }

    public static void problem3() {
        // Problem 3.) Prompt user to input a number using a Scanner (from Week3).
        // Print a message to screen if and only if the entered number is not between 10 and 20 inclusive.
        // do not return 10, do not return 20, do not return anything between 10 and 20
        int number = getNumberFromUser();

        if (number < 10 || number > 20) {
            System.out.println(number);
        }
    }

    public static void problem4() {
        // Problem 4.) Prints each number from 1 to 100 on a new line.  For each multiple of 3, print
        // "Fizz" instead of the number.  For each multiple of 5, print "Buzz" instead of the number.
        // For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
        for (int i = 1; i <= 100; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 && multipleOf5) {
                System.out.println("FizzBuzz");
            } else if (multipleOf3) {
                System.out.println("Fizz");
            } else if (multipleOf5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void problem5() {
        // Challenge Problem (Not required, no points)
        //
        // Problem 5.) Create a calculator - Prompt the user for the operation (+, -, *, /).
        // Then prompt the user for numbers to calculate.  When the user types 'q' the user
        // will stop being prompted and the total will be printed.
        // Example: If the user when prompted enters the following:
        // +
        // 20
        // 30
        // q
        // Output: 50
        Scanner input = new Scanner(System.in);

        System.out.print("Operator: ");
        String operator = input.next();

        double result = 0;
        boolean firstNumber = true;
        System.out.println("number: ");
        String number = input.next();

        while(!number.equals("q")) {
            if(operator.equals("+")) {
                result += Integer.parseInt(number);
            } else {
                if(firstNumber) {
                    result = Integer.parseInt(number);
                } else if(operator.equals("*")) {
                    result *= Integer.parseInt(number);
                } else if(operator.equals("/")) {
                    result /= Integer.parseInt(number);
                } else if(operator.equals("-")) {
                    result -= Integer.parseInt(number);
                }
            }

            firstNumber = false;
            System.out.print("number: ");
            number = input.next();
        }

        System.out.println("Result: " + result);
    }
}
