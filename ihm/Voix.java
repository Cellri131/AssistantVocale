package ihm;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Voix {
    private static final String VOICE_NAME = "kevin16";

    public void parler(String texte) {
        Voice voice = VoiceManager.getInstance().getVoice(VOICE_NAME);
        if (voice != null) {
            voice.allocate();
            voice.speak(texte);
            voice.deallocate();
        } else {
            System.out.println("[Synthèse vocale indisponible] " + texte);
        }
    }
}