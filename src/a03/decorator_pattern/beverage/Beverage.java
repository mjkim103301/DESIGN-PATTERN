package a03.decorator_pattern.beverage;

public abstract class Beverage {
    private String description = "기본 음료";

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
