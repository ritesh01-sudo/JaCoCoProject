
package com.example;



public class Cal {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Cal c = new Cal();

        System.out.println(c.add(10, 5));
        System.out.println(c.subtract(10, 5));
        System.out.println(c.multiply(10, 5));
        System.out.println(c.divide(10, 5));
    }
}