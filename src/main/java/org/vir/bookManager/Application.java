package org.vir.bookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private ArrayList<Book> bookList = new ArrayList<>();

    public Application() {
        this.bookList.add(new Book("A123", "Clean Code", "Robert C Martin"));
        this.bookList.add(new Book("A124", "Clean Architecture", "Robert C Martin"));
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {
                "1. Añadir libro",
                "2. Ver todos los libros",
                "3. Eliminar libro",
                "4. Cambiar repositorio",
                "5. Salir"
        };

        byte option = 0;

        while (option != 5) {

            for (String menuItem : menu) {
                System.out.println(menuItem);
            }

            System.out.println("Seleccione una opción:");

            String input = scanner.nextLine();

            try {
                option = Byte.parseByte(input);
            } catch (Exception ex) {
                System.out.println("Esto no es un numero");
                continue;
            }

            if (option < 1 || option > 5) {
                System.out.println("Numero fuera de rango");
                continue;
            }

            System.out.println("Ha elegido: " + menu[option - 1]);
            this.optionSelector(option);

            System.out.println("------------------------------------------");
        }
    }

    private void optionSelector(byte option) {
        if (option == 2) this.printBookList();
    }

    private void printBookList() {
        if (bookList.isEmpty()) System.out.println("No hay libros");

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}