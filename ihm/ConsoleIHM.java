package ihm;

import java.util.Scanner;

public class ConsoleIHM {
    private Scanner scanner = new Scanner(System.in);

    public String demanderCommande() {
        System.out.print("Vous: ");
        return scanner.nextLine();
    }

    public void afficher(String message) {
        System.out.println("Assistant: " + message);
    }
}