package com.zipcodewilmington.scientificcalculator;

public class Scientific {

    public static void switchDisplayMode(){
        //should rotate through the options
        //not sure what this means yet
    }

    public static void switchDisplayMode(String mode){
        //should set the display to the mode given
        //not sure what this means yet
    }

    public static void memoryAdd(Double input){
        //memory = input;
        //Where is memory stored though? Should this be in console/main?
    }

    public static void memoryClear(){
        //memory = 0;
    }

    public static double memoryRecall(){
        //return memory;
        return 0;
    }

    public static double sine(double input){ return Math.sin(Math.toRadians(input));}

    public static double cosine(double input){ return Math.cos(Math.toRadians(input));}

    public static double tan(double input) { return Math.tan(Math.toRadians(input));}

    public static double asin(double input) { return Math.asin(Math.toRadians(input));}

    public static double acos(double input) { return Math.acos(Math.toRadians(input));}

    public static double atan(double input) { return Math.atan(input);}

    public static void switchUnitsMode() {
        //should rotate through the options
    }

    public static void switchUnitsMode(String mode) {
        // should set the trig units to the type given
    }

    public static double log(double input) {
        return Math.log10(input);
    }

    public static double inverseLog(double input) {
        return Math.pow(10, input);
    }

    public static double natLog(double input){
        return Math.log(input);
    }

    public static double inverseNatLog(double input) {
        return Math.exp(input);
    }

    public static double factorial(double input) {
        double result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }


}
