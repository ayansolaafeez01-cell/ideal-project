public class Bike {

    private boolean isTurnOn = false;
    private int currentSpeed = 0;
    private int gear = 1;

    public void turnOn() {
        isTurnOn = true;
    }
    public void turnOff() {
        isTurnOn = false;
    }
    public boolean checkPower() {
        return isTurnOn;
    }
    public void accelerate() {
        if (isTurnOn) {
            if (gear == 1) {
                currentSpeed += 1;
            }
            else if (gear == 2) {
                currentSpeed += 2;
            }
            else if (gear == 3) {
                currentSpeed += 3;
            }
            else if (gear == 4) {
                currentSpeed += 4;
            }
            changeGear();
          }
        }

    public void decelerate() {
        if (isTurnOn) {
            if (gear == 1) {
                currentSpeed -= 1;
            }
            else if (gear == 2) {
                currentSpeed -= 2;
            }
            else if (gear == 3) {
                currentSpeed -= 3;
            }
            else if (gear == 4) {
                currentSpeed -= 4;
            }
            changeGear();
          }
         }

    public void changeGear() {
        if (currentSpeed < 21) {
            gear = 1;
        }
        else if (currentSpeed <= 30) {
            gear = 2;
        }
        else if (currentSpeed <= 40) {
            gear = 3;
        }
        else {
            gear = 4;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public int getGear() {
        return gear;
    }
}