
import static org.junit.Assert.*;

public class MinstackTest {
    public void Minstacktest(){
        Minstack MInstack = new Minstack();
        MInstack.push(3);
        MInstack.push(5);
        MInstack.push(2);
        MInstack.push(1);
        assertEquals(1, MInstack.getMin());
        MInstack.pop();
        assertEquals(2, MInstack.getMin());
        MInstack.pop();
        assertEquals(3, MInstack.getMin());
    }
}