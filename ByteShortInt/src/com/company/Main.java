package com.company;

public class Main {

    public static void main(String[] args) {
//	      comment!
        byte myByte = 10;
//        int has a width of 32
//        short has a width of 16
//        byte has a width of 8
        byte halfByte = (byte) (myByte / 2);

        long myLong = 100L;
//        long has a width of 64

        byte first = 8;
        short second = 200;
        int third = 1_000_000_000;

        int total = (int) (first + second + third);

        long output = (long)  (5000 + 10 * total);

        System.out.println(output);
    }
}
