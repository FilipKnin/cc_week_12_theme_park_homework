import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("park");
    }

    @Test
    public void hasName() {
        assertEquals("park", park.getName());
    }
}
