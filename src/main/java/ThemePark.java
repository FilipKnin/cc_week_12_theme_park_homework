import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
    }

    public int countAttractions() {
        return this.attractions.size();
    }

    public int countStalls() {
        return this.stalls.size();
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }
}
