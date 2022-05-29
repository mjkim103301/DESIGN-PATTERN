package a04.factory_pattern.pizza_store;

import a04.factory_pattern.pizza.NYStyleCheesePizza;
import a04.factory_pattern.pizza.NYStylePepperoniPizza;
import a04.factory_pattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new NYStyleCheesePizza();

        if (type.equals("peper"))
            pizza = new NYStylePepperoniPizza();


        return pizza;

    }

}
