package a03.decorator_pattern.beverage;

public abstract class Beverage {
    private String description = "그냥 맹물";
    private Size size = Size.TALL;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
