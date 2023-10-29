package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreClass {
// Creating basic commands for calculator

    //adds the values
    public static double add(double x, double y) {
        return (x + y);
    }

    public int add(int x, int y) {
        return (x + y);
    }

    //subtracts the values
    public static double subtract(double x, double y) {
        return (x - y);
    }

    // multiplies the values
    public static double multiply(double x, double y) {
        return (x * y);
    }

    // divides the values
    public static double divide(double x, double y) {
        return (x / y);
    }

    // advanced commands below
// square the value
    public static double square(double x) {
        return (x * x);
    }

    //increases X to the power of Y
    public static double exponent(double x, double y) {
        return Math.pow(x, y);
    }

    //Gets the square root
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    //reverses the value of x
    public static double inverse(double x) {
        return (-1 / x);
    }

    public static double switchSign(double x) {
        return (-1 * x);
    }

    public static double mod(double x, double y) {
        return (x % y);
    }

    // finds the absolute value
    public static double abs(double x) {
        return Math.abs(x);

    }

    public static double round(double x) {
        return Math.round(x);

    }

    //Rounds value down
    public static double floor(double x) {
        return Math.floor(x);

    }

    //Round value upward
    public static double ceiling(double x) {
        return Math.ceil(x);
    }

    CoreClass coreClass = new CoreClass();
    Scanner scanner = new Scanner(System.in);
/*
    while (true)

    {

        int input = 0;

        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
        } else {
            System.out.println("ERROR not a number");
            break;
        }

        System.out.println("Please choose second number");
        int input2 = 0;

        if (scanner.hasNextInt()) {
            input2 = scanner.nextInt();
        } else {
            System.out.println("ERROR not a number");
            break;
        }
        int sumAdd = coreClass.add(input, input2);
        double sumSubtract = coreClass.subtract(input, input2);


        System.out.println("The sum of addition is:" + sumAdd);
        System.out.println("The sum of subtraction is:" + sumSubtract);

        int sum = coreClass.add(input, input2);
        System.out.println("The sum is: " + sum);

        if (scanner.hasNext()) {
            String myString = scanner.next();

            boolean found = false;
            String[] letters = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f",
                    "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};

            for (String letter : letters)
                if (letter.equals(myString)) {
                    found = true;
                    break;
                }
        }
    }

 */
}






