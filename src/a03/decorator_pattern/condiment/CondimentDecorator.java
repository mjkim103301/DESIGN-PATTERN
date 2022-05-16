package a03.decorator_pattern.condiment;

import a03.decorator_pattern.beverage.Beverage;

/**
 * 첨가물
 */
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDescription();
}
