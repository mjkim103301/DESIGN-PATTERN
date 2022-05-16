package a03.decorator_pattern.beverage;

public class CaramelMacchiato extends Beverage {
    public CaramelMacchiato() {
        this.setDescription("카라멜 마끼야또 TALL");
    }

    public CaramelMacchiato(Size size) {
        this.setDescription("카라멜 마끼야또 " + size);
        this.setSize(size);
    }

    @Override
    public double cost() {
        double cost = switch (this.getSize()) {
            case VENTI -> 4000;
            case GRANDE -> 4500;
            default -> 3500;
        };
        return cost;
    }
}
