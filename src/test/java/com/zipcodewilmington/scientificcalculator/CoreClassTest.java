package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class CoreClassTest extends TestCase {

    public void testAdd() {
        Double expected = 4.0;
        Double actual = CoreClass.add(2.0,2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testTestAdd() {
        Double expected = 4.0;
        Double actual = CoreClass.add(2.0,2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testSubtract() {
        Double expected = 0.0;
        Double actual = CoreClass.subtract(2.0,2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testMultiply() {
        Double expected = 16.0;
        Double actual = CoreClass.multiply(8.0,2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testDivide() {
        Double expected = 4.0;
        Double actual = CoreClass.divide(16,4.0);
        Assert.assertEquals(expected,actual);
    }

    public void testSquare() {
        Double expected = 4.0;
        Double actual = CoreClass.square(2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testExponent() {
        Double expected = 9.0;
        Double actual = CoreClass.exponent(3.0,2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testSquareRoot() {
        Double expected = 4.0;
        Double actual = CoreClass.squareRoot(16.0);
        Assert.assertEquals(expected,actual);
    }

    public void testInverse() {
        Double expected = -0.5;
        Double actual = CoreClass.inverse(2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testSwitchSign() {
        Double expected = -2.0;
        Double actual = CoreClass.switchSign(2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testMod() {
        Double expected = 0.0;
        Double actual = CoreClass.mod(2.0,2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testAbs() {
        Double expected = 2.0;
        Double actual = CoreClass.abs(2.0);
        Assert.assertEquals(expected,actual);
    }

    public void testRound() {
        Double expected = 2.0;
        Double actual = CoreClass.round(2.3);
        Assert.assertEquals(expected,actual);
    }

    public void testFloor() {
        Double expected = 2.0;
        Double actual = CoreClass.floor(2.1);
        Assert.assertEquals(expected,actual);
    }
}