package tictactoe;

import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.InputStream;

public class MP3 extends Thread {
    public static AdvancedPlayer play_music;
    public static String music_game = "src/main/resources/music/Roses.mp3";

    @Override
    public void run() {

        try {
            InputStream myStream = new FileInputStream(music_game);
            AudioDevice auDev = new JavaSoundAudioDevice();
            play_music = new AdvancedPlayer(myStream, auDev);
            play_music.play();


        } catch (Exception err) {
            err.printStackTrace();
        }

    }
}
