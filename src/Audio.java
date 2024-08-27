import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;

public class Audio {
    private static Clip clip;

    public static void iniciarMusica() {
        try {
            if (clip == null) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Audio.class.getResource("/Music/Cancion.wav"));

                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            }
            clip.loop(Clip.LOOP_CONTINUOUSLY); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void detenerMusica() {
        if (clip != null) {
            clip.stop();
        }
    }
}
