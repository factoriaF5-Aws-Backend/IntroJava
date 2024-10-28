package org.vir.basics;

public class Loops {

    public static void main(String[] args) {
        // Imprimir por consola los números de 5 a 10 usando un for.
        for (int i = 5; i <= 10; i++) {
            System.out.println("número: " + i);
        }

        // Imprimir por consola los números impares de 5 a 10 usando un for.
        for (int i = 5; i <= 10; i++) {
            if (i % 2 != 0) System.out.println("número impar: " + i);
        }

        // Cuenta atrás de 10 a 0  usando while
        byte counter = 10;
        while (counter > 0) {
            System.out.println("counter: " + counter);
            counter--;
        }
    }
}
