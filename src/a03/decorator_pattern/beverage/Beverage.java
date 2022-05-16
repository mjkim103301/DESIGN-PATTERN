package a03.decorator_pattern.beverage;

public abstract class Beverage {
    String description = "기본 음료";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
