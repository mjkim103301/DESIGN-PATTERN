package a01.strategy_pattern.duck;

import a01.strategy_pattern.fly.FlyWithWings;
import a01.strategy_pattern.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("이 오리는 청둥오리입니다.");
    }
}
