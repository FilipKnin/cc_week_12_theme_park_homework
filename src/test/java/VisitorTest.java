import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;

    @Before
    public void before() {
        visitor1 = new Visitor(18, 180, 240.00);
    }

    @Test
    public void hasAge() {
        assertEquals(18, visitor1.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(180, visitor1.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(240.00, visitor1.getMoney(), 0.01);
    }
}
