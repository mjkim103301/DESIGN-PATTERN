package a04.abstract_factory_pattern.pizza_store;

import a04.abstract_factory_pattern.NYPizzaIngredientFactory;
import a04.abstract_factory_pattern.PizzaIngredientFactory;
import a04.abstract_factory_pattern.pizza.CheesePizza;
import a04.abstract_factory_pattern.pizza.ClamPizza;
import a04.abstract_factory_pattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		}else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		}
		return pizza;
	}
}
