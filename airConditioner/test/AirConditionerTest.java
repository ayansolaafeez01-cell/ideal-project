import org.junit.Test;

import static org.junit.Assert.*;

public class AirConditionerTest {

    @Test
    public void testThatIHaveAnAcItIsOff_ITurnItOn_ItIsOn(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse (airConditioner.checkPower());

        airConditioner.turnOn();
        assertTrue(airConditioner.checkPower());
    }

    @Test
    public void testThatIHaveAnAcItIsOn_ITurnItOff_ItIsOff(){
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.turnOn();
        assertTrue(airConditioner.checkPower());

        airConditioner.turnOff();
        assertFalse(airConditioner.checkPower());


    }

    @Test
    public void testThatIHaveAnAcItIsOn_WhenIIncreaseTheTemperature_TheTemperatureIncrease() {
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.turnOn();
        assertTrue(airConditioner.checkPower());

        airConditioner.temperatureIncrease(8);
        assertEquals(24, airConditioner.checkTemperature());

    }


    @Test
    public void testThatIHaveAnAcItIsOn_WhenIIncreaseTheTemperature_TheTemperatureIncrease_WhenIDecreaseTheTemperature_TheTemperatureDecrease() {
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.turnOn();
        assertTrue(airConditioner.checkPower());

        airConditioner.temperatureIncrease(8);
        assertEquals(24, airConditioner.checkTemperature());


        airConditioner.temperatureDecrease(4);
        assertEquals(20, airConditioner.checkTemperature());

    }

    @Test
    public void testThatIHaveAnAcItIsOn_WhenIncreaseTheTemperatureBeyond30_TheTemperatureIsStill30() {
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.turnOn();
        assertTrue(airConditioner.checkPower());

        airConditioner.temperatureIncrease(32);
        assertEquals(30, airConditioner.checkTemperature());

    }


    @Test
    public void testThatIHaveAnAcItIsOn_WhenIDecreaseTheTemperatureBelow16_TheTemperatureMoveToAnyNumberUnder16() {
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.turnOn();
        assertTrue(airConditioner.checkPower());

        airConditioner.temperatureDecrease(12);
        assertEquals(16, airConditioner.checkTemperature());

    }
}
