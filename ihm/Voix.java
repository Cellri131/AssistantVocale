package ihm;


public class Voix {
    public void parler(String texte) {
        try {
            // Utilisation de eSpeak via une commande système
                String cmd = String.format("espeak\\espeak-ng.exe -v fr -s 140 -p 60 -a 200 \"%s\"", texte.replace('\"', ' '));
            Process p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
        } catch (Exception e) {
            System.out.println("[Synthèse vocale indisponible] " + texte);
            e.printStackTrace();
        }
    }
}