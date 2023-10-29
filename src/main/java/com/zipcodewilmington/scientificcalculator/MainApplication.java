package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import static java.lang.Integer.*;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        while(true) {
            System.out.println("Enter first value");
            final String value1 = scanner.nextLine();
            final Double doubleValue1 = Double.parseDouble(value1);

            System.out.println("Enter second value");
            final String value2 = scanner.nextLine();
            final Double doubleValue2 = Double.parseDouble(value2);

            System.out.println(String.format("Enter operation: [*, /, +, -]"));
            final String selectedOperation = scanner.nextLine();

            Double result = 0.0;

            if ("+".equals(selectedOperation)) {
                result = doubleValue1 + doubleValue2;
            } else if ("-".equals(selectedOperation)) {
                result = doubleValue1 - doubleValue2;
            } else if (("*").equals(selectedOperation)) {
                result = doubleValue1 * doubleValue2;
            } else if ("/".equals(selectedOperation)) {
                if (doubleValue2 == 0) {
                    System.out.println("Error: Division by zero.");
                    continue;
                }
                result = doubleValue1 / doubleValue2;
            } else {
                System.out.println ("Invalid operation. Please choose valid operation");
                continue;
            }
            System.out.println("Your answer = " + result);
        }

        }
        public static Double parseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
        }

    }