public class MusicPlayer {

    private boolean on ;
    private boolean playing;

    public boolean isOn() {
        return on;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
        playing = false;
    }

    public void play() {
        if (on) {
            playing = true;
        }
      }

    public void pause() {
        if (on) {
            playing = false;
        }
       }
    public void continuePlaying() {
        if (on) {
            playing = true;
        }
       }
      }