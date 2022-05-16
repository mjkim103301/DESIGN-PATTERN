package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);

    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " + 모카";
    }

    public double cost() {
        return getBeverage().cost() + 2000;
    }
}
