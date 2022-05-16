package a03.decorator_pattern.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.setDescription("하우스 블렌드 커피 TALL");
    }

    public HouseBlend(Size size) {
        this.setDescription("하우스 블렌드 커피 " + size);
        this.setSize(size);
    }

    @Override
    public double cost() {
        double cost = switch (this.getSize()) {
            case VENTI -> 3500;
            case GRANDE -> 4000;
            default -> 3000;
        };
        return cost;
    }
}
