package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

/**
 * 첨가물
 */
public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();
}
