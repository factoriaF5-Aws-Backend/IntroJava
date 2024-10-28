package org.vir.basics;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // byte
        byte byteNumber = 127;
        System.out.println("byte number: " + byteNumber);
        // short
        short shortNumber = 32767;
        System.out.println("short number: " + shortNumber);
        // int
        int intNumber = 2147483647;
        System.out.println("int number: " + intNumber);
        // long
        long longNumber = 9223372036854775807L;
        System.out.println("ling number: " + longNumber);

        //float
        float floatNumber = 1.3333334F; //6 to 7 decimal digits
        System.out.println("float number : " + floatNumber);
        //double
        double doubleNumber = 1.3333333333333335; //15 to 16 decimal digits
        System.out.println("double number: " + doubleNumber);

        // characters
        char character = 'A';
        System.out.println("character: " + character);
        // boolean
        boolean isBoolean = true;
        System.out.println("boolean: " + isBoolean);
    }
}
