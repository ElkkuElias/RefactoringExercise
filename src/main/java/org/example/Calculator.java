package org.example;

public class Calculator {
    public final int ZERO = 0;

    public int addTwoNumbers(int a, int b) {

        return a + b;

    }

    public int subtractTwoNumbers(int a, int b) {

        return a - b;

    }

    public int multiplyTwoNumbers(int a, int b) {

        return a * b;

    }

    public int divide(int a, int b) {


        checkForZero(b);

        return a / b;

    }
    public void checkForZero(int number) throws IllegalArgumentException {
        if (number == ZERO) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }


    }

}