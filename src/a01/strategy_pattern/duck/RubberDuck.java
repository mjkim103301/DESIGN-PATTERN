package a01.strategy_pattern.duck;

import a01.strategy_pattern.fly.FlyNoWay;
import a01.strategy_pattern.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    public void display() {
        System.out.println("이 오리는 고무 오리입니다.");
    }
}
