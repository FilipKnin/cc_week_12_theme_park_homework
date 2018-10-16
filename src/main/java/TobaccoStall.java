public class TobaccoStall extends Stall implements ISecurity, ITicketed {

    public TobaccoStall(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
            return false;
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 6.60;
    }
}
