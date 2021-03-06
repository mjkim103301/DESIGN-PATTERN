package a09.composite_pattern;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(" " + getName());
        if (isVegetarian()) {
            sb.append("(채식주의자용)");
        }
        sb.append(", 가격: " + getPrice()).append("  -- ").append(getDescription());
        System.out.println(sb);
    }
}
