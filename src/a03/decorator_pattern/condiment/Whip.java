package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 휘핑크림";
    }

    public double cost() {
        return beverage.cost() + 500;
    }
}
