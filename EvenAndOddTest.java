import org.junit.Test;

import static org.junit.Assert.*;

public class EvenAndOddTest {

    @Test
    public void check1() {
        var checker = new EvenAndOdd();
        assertEquals("Even",checker.check(2));
    }
    @Test
    public void check2() {
        var checker = new EvenAndOdd();
        assertEquals("Even",checker.check(0));
    }
    @Test
    public void check3() {
        var checker = new EvenAndOdd();
        assertEquals("Odd",checker.check(5));
    }
    @Test
    public void check4() {
        var checker = new EvenAndOdd();
        assertEquals("Odd",checker.check(-521));
    }
    @Test
    public void check5() {
        var checker = new EvenAndOdd();
        assertEquals("Even",checker.check(-250));
    }
}