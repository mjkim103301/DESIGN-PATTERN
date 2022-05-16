package a03.decorator_pattern.beverage;

public class CaramelMacchiato extends Beverage {
    public CaramelMacchiato() {
        description = "카라멜 마끼야또";
    }

    @Override
    public double cost() {
        return 4000;
    }
}
