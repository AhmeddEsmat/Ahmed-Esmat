import org.junit.Test;

import static org.junit.Assert.*;

public class watermelonTest {

    @Test
    public void twokilos() {
        var fruit = new watermelon();
        assertFalse(fruit.testeven(2));
    }

    @Test
    public void eightkilos() {
        var fruit = new watermelon();
        assertTrue(fruit.testeven(8));
    }

    @Test
    public void onekilos() {
        var fruit = new watermelon();
        assertFalse(fruit.testeven(1));
    }

    @Test
    public void zerokilos() {
        var fruit = new watermelon();
        assertFalse(fruit.testeven(0));
    }

    @Test
    public void fortyninekilos() {
        var fruit = new watermelon();
        assertFalse(fruit.testeven(49));
    }

    @Test
    public void fiftykilos() {
        var fruit = new watermelon();
        assertTrue(fruit.testeven(50));
    }

    @Test
    public void nintyninekilos() {
        var fruit = new watermelon();
        assertFalse(fruit.testeven(99));
    }
}