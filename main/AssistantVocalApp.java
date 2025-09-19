package main;

import ihm.ConsoleIHM;
import ihm.Voix;
import metier.Commande;
import metier.TraitementCommande;

public class AssistantVocalApp {
    public static void main(String[] args) {
        ConsoleIHM ihm = new ConsoleIHM();
        Voix voix = new Voix();
        TraitementCommande traitement = new TraitementCommande();

        System.out.println("=== Assistant Vocal Java ===");

        while (true) {
            String saisie = ihm.demanderCommande();
            if (saisie.equalsIgnoreCase("quit")) break;

            Commande commande = new Commande(saisie);
            String reponse = traitement.traiter(commande);

            ihm.afficher(reponse);
            voix.parler(reponse);
        }
    }
}