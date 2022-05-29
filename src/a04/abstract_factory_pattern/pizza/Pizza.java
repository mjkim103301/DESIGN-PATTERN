package a04.abstract_factory_pattern.pizza;

import a04.abstract_factory_pattern.ingredient.Cheese;
import a04.abstract_factory_pattern.ingredient.Clams;
import a04.abstract_factory_pattern.ingredient.Dough;
import a04.abstract_factory_pattern.ingredient.Sauce;

public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;

	Cheese cheese;

	Clams clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
