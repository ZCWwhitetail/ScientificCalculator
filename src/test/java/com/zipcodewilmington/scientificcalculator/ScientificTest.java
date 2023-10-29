package com.zipcodewilmington.scientificcalculator;

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
        Double expected = 0.76604444311;
        Double actual = Scientific.sine(50);
        Assert.assertEquals(expected, actual);
    }

    public void testCosine() {
    }

    public void testTan() {
    }

    public void testAsin() {
    }

    public void testAcos() {
    }

    public void testAtan() {
    }

    public void testSwitchUnitsMode() {
    }

    public void testTestSwitchUnitsMode() {
    }

    public void testLog() {
    }

    public void testInverseLog() {
    }

    public void testNatLog() {
    }

    public void testInverseNatLog() {
    }

    public void testFactorial() {
    }
}