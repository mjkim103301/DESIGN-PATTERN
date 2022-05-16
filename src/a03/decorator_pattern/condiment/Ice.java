package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

public class Ice extends CondimentDecorator {
    public Ice(Beverage beverage) {
        super(beverage);

    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " + 얼음";
    }

    public double cost() {
        return getBeverage().cost() + 1000;
    }
}
