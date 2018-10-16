import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction attraction;
    Stall stall;

    @Before
    public void before() {
        attraction = new Dodgems("Dodgems");
        stall = new TobaccoStall("name", "ownerName");
        themePark = new ThemePark();
    }

    @Test
    public void countAttractions() {
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void countStalls() {
        assertEquals(0, themePark.countStalls());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(stall);
        assertEquals(1, themePark.countStalls());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(attraction);
        assertEquals(1, themePark.countAttractions());
    }


}
