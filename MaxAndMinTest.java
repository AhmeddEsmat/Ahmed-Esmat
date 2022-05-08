import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAndMinTest {

    @Test
    public void testcase1() {
        var tester = new MaxAndMin();
        int x[] = {0, -52, -30, 250, 345, 0, 212, 443};
        assertEquals(-52,tester.Min(x));
        assertEquals(443,tester.Max(x));
    }

    @Test
    public void testcase2() {
        var tester = new MaxAndMin();
        int x[] = {5, 6, 16, 17, 20};
        assertEquals(5,tester.Min(x));
        assertEquals(20,tester.Max(x));
    }

    @Test
    public void testcase3() {
        var tester = new MaxAndMin();
        int x[] = {-189, -128, -106, -25, 86};
        assertEquals(-189,tester.Min(x));
        assertEquals(86,tester.Max(x));
    }

    @Test
    public void testcase4() {
        var tester = new MaxAndMin();
        int x[] = {-112, -102, 48, 151, 188};
        assertEquals(-112,tester.Min(x));
        assertEquals(188,tester.Max(x));
    }
}