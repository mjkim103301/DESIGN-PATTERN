package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 모카";
    }

    public double cost() {
        return beverage.cost() + 2000;
    }
}
