import java.util.ArrayList;

public abstract class Stall {

    private String name;
    private String ownerName;
    private ArrayList<String> parkingSpot;

    public Stall(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = new ArrayList<>();
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
}
