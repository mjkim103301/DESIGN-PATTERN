package a04.abstract_factory_pattern;

import a04.abstract_factory_pattern.ingredient.Cheese;
import a04.abstract_factory_pattern.ingredient.Dough;
import a04.abstract_factory_pattern.ingredient.FrozenClams;
import a04.abstract_factory_pattern.ingredient.MozzarellaCheese;
import a04.abstract_factory_pattern.ingredient.PlumTomatoSauce;
import a04.abstract_factory_pattern.ingredient.Sauce;
import a04.abstract_factory_pattern.ingredient.Clams;
import a04.abstract_factory_pattern.ingredient.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }



    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
