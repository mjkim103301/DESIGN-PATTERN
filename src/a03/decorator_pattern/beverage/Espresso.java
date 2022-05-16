package a03.decorator_pattern.beverage;

public class Espresso extends Beverage {
    public Espresso() {
        this.setDescription("에스프레소 TALL");
    }

    public Espresso(Size size) {
        this.setDescription("에스프레소 " + size);
        this.setSize(size);
    }

    @Override
    public double cost() {
        double cost = switch (this.getSize()) {
            case VENTI -> 3500;
            case GRANDE -> 4000;
            default -> 3000;
        };
        return cost;
    }
}
