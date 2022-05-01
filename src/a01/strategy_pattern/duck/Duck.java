package a01.strategy_pattern.duck;

import a01.strategy_pattern.fly.FlyBehavior;
import a01.strategy_pattern.quack.QuackBehavior;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("오리가 물에 뜨고 있습니다.");
    }

    public void display() {
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
