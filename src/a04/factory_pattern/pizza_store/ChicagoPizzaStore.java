package a04.factory_pattern.pizza_store;

import a04.factory_pattern.pizza.ChicagoStyleCheesePizza;
import a04.factory_pattern.pizza.ChicagoStylePepperoniPizza;
import a04.factory_pattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();

        if (type.equals("peper"))
            pizza = new ChicagoStylePepperoniPizza();


        return pizza;

    }

}
