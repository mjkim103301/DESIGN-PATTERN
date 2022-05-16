package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);

    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " + 휘핑크림";
    }

    public double cost() {
        return getBeverage().cost() + 500;
    }
}
