import org.junit.Test;

import static org.junit.Assert.*;

public class youngphysicistTest {

    @Test
    public void checksum1() {
        var young = new youngphysicist();
        int x[][]={{3,2,1},{-3,-2,-1},{0,0,0}};
        assertTrue(young.checkSum(3, x));
    }
    @Test
    public void checksum2() {
        var young = new youngphysicist();
        int x[][]={{0,0,0},{0,0,0},{0,0,0}};
        assertTrue(young.checkSum(3, x));
    }
    @Test
    public void checksum3() {
        var young = new youngphysicist();
        int x[][]={{0,1,0},{5,0,-6},{-13,15,99}};
        assertFalse(young.checkSum(3, x));
    }
    @Test
    public void checksum4() {
        var young = new youngphysicist();
        int x[][]={{0,2,-2},{1,-1,3},{-3,0,0}};
        assertFalse(young.checkSum(3, x));
    }
}