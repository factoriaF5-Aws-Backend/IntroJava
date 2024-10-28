package org.vir.users;

public class Main {

    public static void main(String[] args) {
        // Utilizando algun bucle imprime los nombres completos de 3 usuarios diferentes
        User user1 = new User("Leandra", "Garcia");
        User user2 = new User("Leopoldo", "Sáez");
        User user3 = new User("Juana", "Thinker");

        User[] users = {user1, user2, user3};

        for (User user : users) {
            System.out.println(user.fullName());
        }
    }
}
