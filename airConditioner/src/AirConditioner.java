public class AirConditioner {
    private boolean power;
    private int temperature = 16;


    public boolean checkPower() {
        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public void temperatureIncrease(int number) {
        if (number <= 30) {
            temperature = temperature + number;
        }
        else {
            temperature = 30;
        }

    }

    public int checkTemperature() {
        return temperature;
    }

    public void temperatureDecrease(int number) {
        int numberdecrease = temperature - 16;

        if (number <= numberdecrease) {
            temperature = temperature - number;
        }

        else{
            temperature = 16;
        }
    }
}

