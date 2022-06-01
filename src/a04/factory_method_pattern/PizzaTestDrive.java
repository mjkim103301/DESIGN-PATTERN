package a04.factory_method_pattern;

import a04.factory_method_pattern.pizza.Pizza;
import a04.factory_method_pattern.pizza_store.ChicagoPizzaStore;
import a04.factory_method_pattern.pizza_store.NYPizzaStore;
import a04.factory_method_pattern.pizza_store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nySytpePizza = nyStore.orderPizza("cheese");

        System.out.println(nySytpePizza.getname());

        System.out.println();

        Pizza chicagoStypePizza = chicagoStore.orderPizza("cheese");

        System.out.println(chicagoStypePizza.getname());

    }

}
