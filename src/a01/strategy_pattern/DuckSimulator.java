package a01.strategy_pattern;

import a01.strategy_pattern.duck.*;

public class DuckSimulator {
    public static void main(String[] args) {
        duckInformation(new MallardDuck());
        duckInformation(new RedheadDuck());
        duckInformation(new RubberDuck());
        duckInformation(new DecoyDuck());
    }

    public static void duckInformation(Duck duck){
        System.out.println("============ start ==========");
        duck.display();
        duck.performQuack();
        duck.performFly();
        System.out.println("============ end ==========");
    }
}
