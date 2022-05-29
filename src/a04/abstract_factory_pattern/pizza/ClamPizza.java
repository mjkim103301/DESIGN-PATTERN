package a04.abstract_factory_pattern.pizza;

import a04.abstract_factory_pattern.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {

        this.ingredientFactory = ingredientFactory;

    }

    @Override
    public void prepare() {

        this.dough = ingredientFactory.createDough();

        this.sauce = ingredientFactory.createSauce();

        this.cheese = ingredientFactory.createCheese();

        this.clams = ingredientFactory.createClams();

    }

}
