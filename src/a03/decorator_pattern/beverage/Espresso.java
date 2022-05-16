package a03.decorator_pattern.beverage;

public class Espresso extends Beverage {
    public Espresso() {
        this.setDescription("에스프레소");
    }

    @Override
    public double cost() {
        return 3000;
    }
}
