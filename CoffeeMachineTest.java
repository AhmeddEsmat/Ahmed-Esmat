import junit.framework.TestCase;
import org.junit.Test;

public class CoffeeMachineTest extends TestCase {
    @Test
    public void test1(){
        var machine = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",machine.openMachine());
    }
    @Test
    public void test2(){
        var machine = new CoffeeMachine();
        machine.isPowerOn = true;
        assertEquals("Error!",machine.openMachine());
    }
    @Test
    public void test3(){
        var machine = new CoffeeMachine();
        assertEquals("Turn Machine On first!", machine.addMoney(30));
    }
    @Test
    public void test4(){
        var machine = new CoffeeMachine();
        machine.openMachine();
        assertEquals("Successfully added money",machine.addMoney(30));
    }
    @Test
    public void test5(){
        var machine = new CoffeeMachine();
        machine.openMachine();
        machine.closeMachine();
        assertEquals("Turn Machine On first!",machine.addMoney(30));
    }
    @Test
    public void test6(){
        var machine = new CoffeeMachine();

        assertEquals("Power On!" + "Lights On!",machine.openMachine());
        assertEquals("Successfully added money",machine.addMoney(30));
    }
    @Test
    public void test7(){
        var machine = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",machine.openMachine());
        assertEquals("Successfully added money",machine.addMoney(30));
        assertEquals("Lights Off!" + "Power Off!",machine.closeMachine());
    }
    @Test
    public void test8(){
        var machine = new CoffeeMachine();
        assertEquals("Turn on the machine first!",machine.makeCoffee(2));
    }
    @Test
    public void test9(){
        var machine = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",machine.openMachine());
        assertEquals("Successfully added money",machine.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",machine.makeCoffee(3));
    }
    @Test
    public void test10(){
        var machine = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",machine.openMachine());
        assertEquals("Successfully added money",machine.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",machine.makeCoffee(4));
    }
    @Test
    public void test11(){
        var machine = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",machine.openMachine());
        assertEquals("Successfully added money",machine.addMoney(30));
        assertEquals(1+ " Cup Of coffee Made!",machine.makeCoffee(1));
    }
    @Test
    public void test12(){
        var machine = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",machine.openMachine());
        assertEquals("Successfully added money",machine.addMoney(30));
        assertEquals(2+ " Cup Of coffee Made!",machine.makeCoffee(2));
        assertEquals("Lights Off!" + "Power Off!",machine.closeMachine());
    }

}