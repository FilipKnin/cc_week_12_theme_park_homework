public class CandyFlossStall extends Stall implements ITicketed{

    public CandyFlossStall(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 4.20;
    }
}
