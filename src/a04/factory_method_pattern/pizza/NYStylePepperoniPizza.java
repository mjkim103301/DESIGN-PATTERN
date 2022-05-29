package a04.factory_method_pattern.pizza;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza() {

        this.name = "NY Style CheesePizza";

        this.dough = "Thin Crust Dough";

        this.sauce = "Marinara Sauce";

        this.toppings.add("Grated Reggiano Cheese");

    }
}
