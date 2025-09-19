package metier;

public class TraitementCommande {

    public String traiter(Commande commande) {
        String texte = commande.getTexte().toLowerCase();
        String sRet = "";
        int cpt = 0;

        if (texte.contains("bonjour")) {
            sRet += "Bonjour Romain, comment puis-je vous aider ? \n";
        }
        if (texte.contains("heure")) {
            sRet += "Il est " + java.time.LocalTime.now().withNano(0) + "\n";
        } 
        if (texte.contains("date")) {
            sRet += "Nous sommes le " + java.time.LocalDate.now()  + "\n";
        } 
        //    return "Désolé, je n'ai pas compris la commande. \n";
        
        return sRet;
    }
}