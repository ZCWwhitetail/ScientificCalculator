package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Scientific;
import junit.framework.TestCase;
import org.junit.Assert;


public class ScientificTest extends TestCase {

    public void testSwitchDisplayMode() {
    }

    public void testTestSwitchDisplayMode() {
    }

    public void testMemoryAdd() {
    }

    public void testMemoryClear() {
    }

    public void testMemoryRecall() {
    }

    public void testSine() {
        Double expected = 0.766044443118978;
        Double actual = Scientific.sine(50);
        Assert.assertEquals(expected, actual);
    }

    public void testCosine() {
        Double expected = 0.6427876096865394;
        Double actual = Scientific.cosine(50);
        Assert.assertEquals(expected, actual);
    }

    public void testTan() {
        Double expected = 1.19175359259421;
        Double actual = Scientific.tan(50);
        Assert.assertEquals(expected, actual);
    }

    public void testAsin() {
        Double expected = 1.0606327182515918;
        Double actual = Scientific.asin(50);
        Assert.assertEquals(expected, actual);
    }

    public void testAcos() {
        Double expected = 0.5101636085433048;
        Double actual = Scientific.acos(50);
        Assert.assertEquals(expected, actual);
    }

    public void testAtan() {
        Double expected = 1.550798992821746;
        Double actual = Scientific.atan(50);
        Assert.assertEquals(expected, actual);
    }

    public void testSwitchUnitsMode() {
    }

    public void testTestSwitchUnitsMode() {
    }

    public void testLog() {
        Double expected = 0.6989700043360189;
        Double actual = Scientific.log(5);
        Assert.assertEquals(expected, actual);
    }

    public void testInverseLog() {
        Double expected = 100000.0;
        Double actual = Scientific.inverseLog(5);
        Assert.assertEquals(expected, actual);
    }

    public void testNatLog() {
        Double expected = 1.6094379124341003;
        Double actual = Scientific.natLog(5);
        Assert.assertEquals(expected, actual);
    }

    public void testInverseNatLog() {
        Double expected = 148.4131591025766;
        Double actual = Scientific.inverseNatLog(5);
        Assert.assertEquals(expected, actual);
    }

    public void testFactorial() {
        Double expected = 120.0;
        Double actual = Scientific.factorial(5);
        Assert.assertEquals(expected, actual);
    }

}