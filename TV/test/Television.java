public class Television {

    private boolean isOn = false;
    private int volume = 1;
    private int channel = 1;

    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }
    public void decreaseVolume() {
        if (volume > 1) {
            volume--;
        }
    }
    public int getVolume() {
        return volume;
    }
    public void changeChannel(int channel) {

        if (channel >= 1 && channel <= 4) {
            this.channel = channel;
         } else if (isOn) {
            this.channel = 0;
         }
      }
    public String getProgram() {

        if (channel == 1) {
            return "Aljazeera";
         }
        if (channel == 2) {
            return "Yoruba Movie";
         }
        if (channel == 3) {
            return "Action Movie";
         }
        if (channel == 4) {
            return "Sport Activities";
         }
        return "";
    }
 }