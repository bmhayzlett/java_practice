package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double test;

        for(int i=8; i > 1; i--) {
            test = calculateInterest(10000.0, (double) i);
            System.out.println("10000 at " + i + "% interest is " + String.format("%.2f",test));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
