package org.example;

public class Calculator {

    public Calculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public boolean isEven(int a) {
        if(a%2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean isOdd(int a) {
        if(a%2 == 1) {
            return true;
        }

        else {
            return false;
        }
    }
}
