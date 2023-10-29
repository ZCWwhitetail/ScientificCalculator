package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Integer.*;

/**
 * Created by leon on 2/9/18.
 */
public class Console {


    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }





    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userStringInput = scanner.nextLine();
        Integer userIntegerInput = parseInt(userStringInput);
        return userIntegerInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String stringInput = scanner.nextLine();
        double doubleInput = Double.parseDouble(stringInput);
        return doubleInput;
    }
}
