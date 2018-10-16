import java.util.ArrayList;

public abstract class Stall implements IReviewed{

    private String name;
    private String ownerName;
    private ArrayList<String> parkingSpot;
    private int rating;

    public Stall(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = new ArrayList<>();
        this.rating = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int countParkingSpots() {
        return this.parkingSpot.size();
    }

    @Override
    public int getRating() {
        return this.rating;
    }
}
