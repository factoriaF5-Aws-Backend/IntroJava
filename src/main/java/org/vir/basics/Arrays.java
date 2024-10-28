package org.vir.basics;

public class Arrays {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        String[] cities = {"Valencia", "Barcelona"};

        for (int number : numbers) {
            if (number %2 == 0) {
                System.out.println(number);
            }
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
