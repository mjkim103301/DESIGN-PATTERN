package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

public class Ice extends CondimentDecorator {
    public Ice(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 얼음";
    }

    public double cost() {
        return beverage.cost() + 1000;
    }
}
