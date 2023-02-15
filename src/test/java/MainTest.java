import org.example.Main;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    Main ob = new Main();
    @Test
    public void factorialPositive() {
        assertEquals("Finding factorial for true positive", 120, ob.fact(5));
        assertEquals("Finding factorial for -ve ", 1, ob.fact(-1));
    }

}
