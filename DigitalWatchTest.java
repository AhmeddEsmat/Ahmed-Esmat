import junit.framework.TestCase;
import org.junit.Test;


public class DigitalWatchTest extends TestCase {

    @Test
    public void test1(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
    }
    @Test
    public void test2(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
    }
    @Test
    public void test3(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
        assertEquals("Turned off",d.turnOff());
    }
    @Test
    public void test4(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
    }
    @Test
    public void test5(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        assertEquals("Wait for timer to end",d.doSomething());
    }
    @Test
    public void test6(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimerSet = false;
        assertEquals("Accepted",d.doSomething());
    }
    @Test
    public void test7(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimerSet = false;
        assertEquals("Accepted",d.doSomething());
        assertEquals("Turned off",d.turnOff());
    }
    @Test

    public void test8(){
        var d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimerSet = false;
        assertEquals("Accepted",d.doSomething());
        d.isOpen = false;
        assertEquals("Error",d.turnOff());
    }
}