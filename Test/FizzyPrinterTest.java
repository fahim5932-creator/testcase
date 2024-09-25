import org.junit.Test;



import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FizzyPrinterTest {
    @Test
    public void testFizz() {
        FizzyPrinter fizz = new FizzyPrinter();
        assertEquals("Fizz", fizz.printFizzy(3));
    }
    @Test
    public void testBuzz() {
        FizzyPrinter buzz = new FizzyPrinter();
        assertEquals("Buzz", buzz.printFizzy(5));
    }
    @Test
    public void testBang() {
        FizzyPrinter bang = new FizzyPrinter();
        assertEquals("Bang", bang.printFizzy(7));
    }
    @Test
    public void testFizzBuzz() {
        FizzyPrinter fizzbuzz = new FizzyPrinter();
        assertEquals("Fizzbuzz", fizzbuzz.printFizzy(15));
    }
    @Test
    public void testFizzBuzzBang() {
        FizzyPrinter fizzbuzzbang = new FizzyPrinter();
        assertEquals("Fizzbuzzbang", fizzbuzzbang.printFizzy(105));
    }
}