package a01.strategy_pattern.duck;

import a01.strategy_pattern.fly.FlyBehavior;
import a01.strategy_pattern.quack.QuackBehavior;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public void swim(){}
    public void display(){}
    public void performQuack(){}
    public void performFly(){}
    public void setFlyBehavior(){}
    public void setQuackBehavior(){}
}
