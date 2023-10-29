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

            System.out.println("Enter second value, if needed. Else enter 0.");
            final String value2 = scanner.nextLine();
            final Double doubleValue2 = Double.parseDouble(value2);

            System.out.println(String.format("Enter operation: [*, /, +, -]"));
            System.out.println(String.format("[square, exponent, square root]"));
            System.out.println(String.format("[inverse, switch sign, modulo]"));
            System.out.println(String.format("[absolute, round, floor, ceiling]"));
            System.out.println(String.format("[sine, cosine, tan]"));
            System.out.println(String.format("[inverse sine, inverse cosine, inverse tan]"));
            System.out.println(String.format("[log, inverse log, natural log]"));
            System.out.println(String.format("[inverse natural log, factorial]"));

            final String selectedOperation = scanner.nextLine();

            Double result = 0.0;

            //core functions
            if ("+".equals(selectedOperation)) {
                result = CoreClass.add(doubleValue1,doubleValue2);
            } else if ("-".equals(selectedOperation)) {
                result = CoreClass.subtract(doubleValue1, doubleValue2);
            } else if (("*").equals(selectedOperation)) {
                result = CoreClass.multiply(doubleValue1, doubleValue2);
            } else if ("/".equals(selectedOperation)) {
                if (doubleValue2 == 0) {
                    System.out.println("Error: Division by zero.");
                    continue;
                } result = CoreClass.divide(doubleValue1, doubleValue2);
            } else if ("square".equals(selectedOperation)){
                result  = CoreClass.square(doubleValue1);
            } else if ("exponent".equals(selectedOperation)){
                result  = CoreClass.exponent(doubleValue1, doubleValue2);
            } else if ("square root".equals(selectedOperation)){
                result  = CoreClass.squareRoot(doubleValue1);
            } else if ("inverse".equals(selectedOperation)){
                result  = CoreClass.inverse(doubleValue1);
            } else if ("switch sign".equals(selectedOperation)){
                result  = CoreClass.switchSign(doubleValue1);
            } else if ("modulo".equals(selectedOperation)){
                result  = CoreClass.mod(doubleValue1, doubleValue2);
            } else if ("absolute".equals(selectedOperation)){
                result  = CoreClass.abs(doubleValue1);
            } else if ("round".equals(selectedOperation)){
                result  = CoreClass.round(doubleValue1);
            } else if ("floor".equals(selectedOperation)){
                result  = CoreClass.floor(doubleValue1);
            } else if ("ceiling".equals(selectedOperation)){
                result  = CoreClass.ceiling(doubleValue1);

                //scientific functions
            } else if ("sine".equals(selectedOperation)){
                result = Scientific.sine(doubleValue1);
            } else if ("cosine".equals(selectedOperation)){
                result = Scientific.cosine(doubleValue1);
            } else if ("tan".equals(selectedOperation)){
                result = Scientific.tan(doubleValue1);
            } else if ("inverse sine".equals(selectedOperation)){
                result = Scientific.asin(doubleValue1);
            } else if ("inverse cosine".equals(selectedOperation)){
                result = Scientific.acos(doubleValue1);
            } else if ("inverse tan".equals(selectedOperation)){
                result = Scientific.atan(doubleValue1);
            } else if ("log".equals(selectedOperation)){
                result = Scientific.log(doubleValue1);
            } else if ("inverse log".equals(selectedOperation)){
                result = Scientific.inverseLog(doubleValue1);
            } else if ("natural log".equals(selectedOperation)){
                result = Scientific.natLog(doubleValue1);
            } else if ("inverse natural log".equals(selectedOperation)){
                result = Scientific.inverseNatLog(doubleValue1);
            } else if ("factorial".equals(selectedOperation)){
                result = Scientific.factorial(doubleValue1);
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