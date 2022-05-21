import junit.framework.TestCase;
import org.junit.Test;


public class ATMmachineTest extends TestCase {

    @Test
    public void test1(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
    }

    @Test
    public void test2(){
        var a = new ATMmachine();
        a.isValidatedCard = false;
        assertEquals("Card not validated",a.enterCard());
    }

    @Test
    public void test3(){
        var a = new ATMmachine();
        assertEquals("Successful login",a.enterPassword());
    }
    @Test
    public void test4(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        a.isValidPassword = false;
        assertEquals("Wrong password",a.enterPassword());
    }
    @Test
    public void test5(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());

        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test6(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(20));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test7(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(50));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test8(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test9(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(50001));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test10(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(500));
        assertEquals("Successful withdraw",a.withdraw(500));
    }
    @Test
    public void test11(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(1000));
        assertEquals("Successful withdraw",a.withdraw(500));
        assertEquals("Not enough balance",a.withdraw(501));
    }
    @Test
    public void test12(){
        var a = new ATMmachine();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());

        assertEquals("Successful deposit",a.deposit(3000));
        assertEquals("Successful withdraw",a.withdraw(1000));
        assertEquals("Not enough balance",a.withdraw(4000));
        assertEquals("Successful withdraw",a.withdraw(2000));
    }
}