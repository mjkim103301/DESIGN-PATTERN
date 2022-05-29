package a04.abstract_factory_pattern;

import a04.abstract_factory_pattern.ingredient.Cheese;
import a04.abstract_factory_pattern.ingredient.Clams;
import a04.abstract_factory_pattern.ingredient.Dough;
import a04.abstract_factory_pattern.ingredient.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clams createClams();

}