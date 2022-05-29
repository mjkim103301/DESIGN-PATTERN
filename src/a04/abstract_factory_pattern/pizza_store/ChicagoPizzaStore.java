package a04.abstract_factory_pattern.pizza_store;

import a04.abstract_factory_pattern.ChicagoPizzaIngredientFactory;
import a04.abstract_factory_pattern.PizzaIngredientFactory;
import a04.abstract_factory_pattern.pizza.CheesePizza;
import a04.abstract_factory_pattern.pizza.ClamPizza;
import a04.abstract_factory_pattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		}  else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		}
		return pizza;
	}
}
