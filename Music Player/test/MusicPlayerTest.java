import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTest {

    @Test
    public void testThatNewMusicShouldBeOff() {
        MusicPlayer music = new MusicPlayer();
        assertFalse(music.isOn());
    }

    @Test
    public void testThatMusicShouldTurnOn() {
        MusicPlayer music = new MusicPlayer();
        music.turnOn();
        assertTrue(music.isOn());
    }

    @Test
    public void testThatMusicShouldTurnOff() {
        MusicPlayer music = new MusicPlayer();
        music.turnOn();
        music.turnOff();
        assertFalse(music.isOn());
    }

    @Test
    public void testThatMusicShouldPlay() {
        MusicPlayer music = new MusicPlayer();
        music.turnOn();
        music.play();
        assertTrue(music.isPlaying());
    }

    @Test
    public void testThatMusicShouldPause() {
        MusicPlayer music = new MusicPlayer();
        music.turnOn();
        music.play();
        music.pause();
        assertFalse(music.isPlaying());
    }

    @Test
    public void testThatMusicShouldContinueAfterPause() {
        MusicPlayer music = new MusicPlayer();
        music.turnOn();
        music.play();
        music.pause();
        music.continuePlaying();
        assertTrue(music.isPlaying());
    }
}