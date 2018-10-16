import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;

    public ThemePark() {
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.reviews = new ArrayList<>();
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

    public String visit(Visitor visitor, Attraction attraction) {
        return "Visitor has visited " + attraction.getName();
    }

    public int countReviews() {
        return this.reviews.size();
    }

    public void addReview(IReviewed review) {
        this.reviews.add(review);
    }

    public void getAllReviewed() {

        for (int i = 0; i <this.attractions.size() ; i++) {
            Attraction attraction = this.attractions.get(i);
            if (attraction instanceof IReviewed) {
                addReview(attraction);
            }
        }

        for (int i = 0; i <this.stalls.size() ; i++) {
            Stall stall = this.stalls.get(i);
            if (stall instanceof IReviewed) {
                addReview(stall);
            }
        }
    }
}
