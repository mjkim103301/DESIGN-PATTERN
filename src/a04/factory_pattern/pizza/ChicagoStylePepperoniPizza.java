package a04.factory_pattern.pizza;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza() {

        this.name = "Chicago Style CheesePizza";

        this.dough = "Extra Thick Crust Dough";

        this.sauce = "Plum Tomato Sauce";

        this.toppings.add("Shredded mozzarella Cheese");

    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into square slices");

    }
}
