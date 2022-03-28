package com.android.s19110159;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
   Calculator mCalculator = new Calculator();

    //Add
    @Test
    public void addTwoNumbers() {
        double result = mCalculator.add(6d,4d);
        assertEquals(result, 10d,0);
    }

    @Test
    public void addTwoNumbersNegative() {
        double result = mCalculator.add(-1d, 5d);
        assertEquals(result, 4d,0);
    }

    @Test
    public void addTwoNumbersFloats() {
        double result = mCalculator.add(3.333f, 2.222d);
        assertEquals(result, 5.555d,0.01d);
    }

    @Test
    public void addTwoNumbersInfinity() {
        double result = mCalculator.add(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void addTwoNumbersNegativeResult() {
        double result = mCalculator.add(-25d, 10d);
        assertEquals(result, -15d,0);
    }

    //Sub
    @Test
    public void subTwoNumbers() {
        double result = mCalculator.sub(10d,5d);
        assertEquals(result, 5d,0);
    }

    @Test
    public void subTwoNumbersNegative() {
        double result = mCalculator.sub(-1d, -5d);
        assertEquals(result, 4d,0);
    }

    @Test
    public void subTwoNumbersFloats() {
        double result = mCalculator.sub(3.111f, 2.222d);
        assertEquals(result, 0.89d,0.001d);
    }

    @Test
    public void subTwoNumbersInfinity() {
        double result = mCalculator.sub(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void subTwoNumbersNegativeResult() {
        double result = mCalculator.sub(-22d, 10d);
        assertEquals(result, -32d,0);
    }

    //Mul
    @Test
    public void mulTwoNumbers() {
        double result = mCalculator.mul(5d,2d);
        assertEquals(result, 10d,0);
    }

    @Test
    public void mulTwoNumbersNegative() {
        double result = mCalculator.mul(-5d, -2d);
        assertEquals(result, 10d,0);
    }

    @Test
    public void mulTwoNumbersFloats() {
        double result = mCalculator.mul(3.111f, 2.222d);
        assertEquals(result, 6.912d,0.001d);
    }

    @Test
    public void mulTwoNumbersInfinity() {
        double result = mCalculator.mul(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void mulTwoNumbersNegativeResult() {
        double result = mCalculator.mul(-10d, 10d);
        assertEquals(result, -100d,0);
    }
    @Test
    public void mulTwoNumbersZero() {
        double result = mCalculator.mul(10d, 0d);
        assertEquals(result, 0,0);
    }

    // Div
    @Test
    public void divTwoNumbers() {
        double result = mCalculator.div(10d,2d);
        assertEquals(result, 5d,0);
    }

    @Test
    public void divTwoNumbersNegative() {
        double result = mCalculator.div(-10d, -2d);
        assertEquals(result, 5d,0);
    }

    @Test
    public void divTwoNumbersFloats() {
        double result = mCalculator.div(3.111f, 2.222d);
        assertEquals(result, 1.4d,0.001d);
    }

    @Test
    public void divTwoNumbersInfinity() {
        double result = mCalculator.div(2.222d,Double.POSITIVE_INFINITY);
        assertEquals(result, 0,0);
    }
    @Test
    public void divTwoNumbersNegativeResult() {
        double result = mCalculator.div(-25d, 10d);
        assertEquals(result, -2.5d,0);
    }
    @Test
    public void divTwoNumbersZero() {
        double result = mCalculator.div(22d, 0d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }

    //Pow
    @Test
    public void powTwoNumbers() {
        double result = mCalculator.pow(2d,4d);
        assertEquals(result, 16d,0);
    }

    @Test
    public void powTwoNumbersNegative() {
        double result = mCalculator.pow(-1d, -2d);
        assertEquals(result, 1d,0);
    }

    @Test
    public void powTwoNumbersFloats() {
        double result = mCalculator.pow(3.111f, 2.222d);
        assertEquals(result, 12.451d,0.001d);
    }

    @Test
    public void powTwoNumbersInfinity() {
        double result = mCalculator.pow(2.222d,Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void powTwoNumbersNegativeResult() {
        double result = mCalculator.pow(-5d, 3d);
        assertEquals(result, -125d,0);
    }
    @Test
    public void powTwoNumbersZero() {
        double result = mCalculator.pow(25d, 0d);
        assertEquals(result, 1,0);
    }
    @Test
    public void powTwoNumbers0AndNegativeOne() {
        double result = mCalculator.pow(0, -1d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }

    //Fact
    @Test
    public void factNumber() {
        double result = mCalculator.fact(5d);
        assertEquals(result, 120d,0);
    }

    @Test
    public void factNumbersNegative() {
        double result = mCalculator.fact(-5d);
        assertEquals(result, 0d,0);
    }

    @Test
    public void factNumberFloats() {
        Double result = mCalculator.fact(3.111f);
        assertEquals(result, 0d,0);
    }
    @Test
    public void factNumberNegativeResult() {
        double result = mCalculator.fact(-2d);
        assertEquals(result, 0d,0);
    }
    @Test
    public void factNumberZero() {
        double result = mCalculator.fact(0);
        assertEquals(result, 1, 0);
    }

    //Log
    @Test
    public void logTwoNumbers() {
        double result = mCalculator.log(4d,2d);
        assertEquals(result, 0.5d,0);
    }

    @Test
    public void logTwoNumbersNegative() {
        double result = mCalculator.log(-1d, -2d);
        assertEquals(result, Double.NaN,0);
    }

    @Test
    public void logTwoNumbersFloats() {
        double result = mCalculator.log(3.111f, 2.222d);
        assertEquals(result, 0.7034d,0.001d);
    }

    @Test
    public void logTwoNumbersBaseE() {
        double result = mCalculator.log(Math.E,1d);
        assertEquals(result, 0d,0);
    }
    @Test
    public void logTwoNumbers0AndNegativeOne() {
        double result = mCalculator.log(0, 3d);
        assertEquals(result, 0,0);
    }
}