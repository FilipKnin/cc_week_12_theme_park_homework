public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 2.80;
    }
}
