package org.vir.scanner;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = "admin";
        String password = "1234";

        int intentos = 3;
        String inputName = "";
        String inputPass = "";

        while (intentos > 0) {
            System.out.println("nombre: ");
            inputName = scanner.nextLine();
            System.out.println("password: ");
            inputPass = scanner.nextLine();

            if (inputName.equals(userName) && inputPass.equals(password)) {
                System.out.println("Estas dentro");
                break;
            }

            System.out.println("Intento Fallido");
            intentos--;
        }

        scanner.close();
    }
}
