package a01.strategy_pattern.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
