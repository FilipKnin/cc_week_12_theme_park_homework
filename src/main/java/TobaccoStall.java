public class TobaccoStall extends Stall implements ISecurity {

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
}
