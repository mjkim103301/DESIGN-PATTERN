package a01.strategy_pattern.duck;

import a01.strategy_pattern.fly.FlyWithWings;
import a01.strategy_pattern.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("이 오리는 붉은 머리 오리입니다.");
    }
}
