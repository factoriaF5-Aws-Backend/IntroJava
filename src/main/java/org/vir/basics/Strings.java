package org.vir.basics;

public class Strings {

    public static void main(String[] args) {

        String name = "Sergi";

        String surname = new String("Vir");

        String fullName = name + " " + surname;
        System.out.println(fullName);

        // Imprime por consola una comparacion de dos strings usando .equals();
        System.out.println(name.equals(surname)); //returns false
    }
}
