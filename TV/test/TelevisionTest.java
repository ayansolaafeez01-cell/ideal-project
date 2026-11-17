import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void testThatTelevisionIsOff() {
        Television tv = new Television();

        assertFalse(tv.isOn());
    }

    @Test
    public void testThatTelevisionIsOffwhenTurnOnItOn() {
        Television tv = new Television();

        tv.turnOn();

        assertTrue(tv.isOn());
    }

    @Test
    public void testThatTelevisionIsOnWhenIturnedOffItOff() {
        Television tv = new Television();

        tv.turnOn();
        tv.turnOff();

        assertFalse(tv.isOn());
    }

    @Test
    public void testThatvolumeCannotMoveAbove100() {
        Television tv = new Television();
        tv.turnOn();

        for (int i = 0; i < 100; i++) {
            tv.increaseVolume();
        }

        assertEquals(100, tv.getVolume());
    }

    @Test
    public void testThatvolumeCanBeDecreased() {
        Television tv = new Television();
        tv.turnOn();

        tv.increaseVolume();
        tv.increaseVolume();
        tv.decreaseVolume();

        assertEquals(2, tv.getVolume());
    }

    @Test
    public void testThatvolumeCannotGoBelow1() {
        Television tv = new Television();
        tv.turnOn();

        for (int i = 0; i < 1; i++) {
            tv.decreaseVolume();
        }

        assertEquals(1, tv.getVolume());
    }

    @Test
    public void testThatchannel1ShouldShowAljazeera() {
        Television tv = new Television();
        tv.turnOn();

        tv.changeChannel(1);

        assertEquals("Aljazeera", tv.getProgram());
    }

    @Test
    public void testThatchannel2ShouldShowYorubaMovie() {
        Television tv = new Television();
        tv.turnOn();

        tv.changeChannel(2);

        assertEquals("Yoruba Movie", tv.getProgram());
    }

    @Test
    public void testThatchannel3ShouldShowActionMovie() {
        Television tv = new Television();
        tv.turnOn();

        tv.changeChannel(3);

        assertEquals("Action Movie", tv.getProgram());
    }

    @Test
    public void testThatchannel4ShouldShowSportActivities() {
        Television tv = new Television();
        tv.turnOn();

        tv.changeChannel(4);

        assertEquals("Sport Activities", tv.getProgram());
    }

}