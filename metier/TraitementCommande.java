package metier;

public class TraitementCommande {

    public String traiter(Commande commande) {
        String texte = commande.getTexte().toLowerCase();

        if (texte.contains("bonjour")) {
            return "Bonjour Romain, comment puis-je vous aider ?";
        } else if (texte.contains("heure")) {
            return "Il est " + java.time.LocalTime.now().withNano(0);
        } else if (texte.contains("date")) {
            return "Nous sommes le " + java.time.LocalDate.now();
        } else {
            return "Désolé, je n'ai pas compris la commande.";
        }
    }
}