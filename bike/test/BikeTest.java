import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testThatbikeIsOff() {
        Bike bike = new Bike();
        assertFalse(bike.checkPower());
    }

    @Test
    public void testThatbikeIsOffWhenITurnItOnItOn() {
        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.checkPower());
    }

    @Test
    public void testThatbikeIsOnWhenITurnItOffItOff() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.checkPower());
    }

    @Test
    public void testThatbikeAcceleratesBy1_OnGearOne() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.accelerate();
        assertEquals(1, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeAcceleratesBy2_OnGearTwo() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        bike.accelerate();
        assertEquals(23, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeAcceleratesBy3_OnGearThree() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 26; i++) {
            bike.accelerate();
        }
        assertEquals(3, bike.getGear());
        bike.accelerate();
        assertEquals(34, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeAcceleratesBy4_OnGearFour() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.accelerate();
        }
        assertEquals(4, bike.getGear());
        bike.accelerate();
        assertEquals(47, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeDeceleratesBy1_OnGearOne() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.accelerate();
        bike.decelerate();
        assertEquals(0, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeDeceleratesBy2_OnGearTwo() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }
        bike.decelerate();
        assertEquals(19, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeDeceleratesBy3_OnGearThree() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 26; i++) {
            bike.accelerate();
        }
        bike.decelerate();
        assertEquals(28, bike.getCurrentSpeed());
    }

    @Test
    public void testThatbikeDeceleratesBy4_OnGearFour() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.accelerate();
        }
        bike.decelerate();
        assertEquals(39, bike.getCurrentSpeed());
    }

    @Test
    public void bikeChangesToGearOneBelow21() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.accelerate();
        }
        bike.decelerate();
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeChangesToGearTwoBetween21And30() {
        Bike bike = new Bike();
        bike.turnOn();
        for (int i = 21; i < 30; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeChangesToGearThreeBetween31And40() {
        Bike bike = new Bike();
        bike.turnOn();

        for (int i = 31; i <= 40; i++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeChangesToGearFourAt41AndAbove() {
        Bike bike = new Bike();
        bike.turnOn();

    }
}