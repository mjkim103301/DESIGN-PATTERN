package a01.strategy_pattern.duck;

import a01.strategy_pattern.fly.FlyNoWay;
import a01.strategy_pattern.quack.MuteQuack;
import a01.strategy_pattern.quack.Squeak;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("이 오리는 오리 유인용으로 만들어진 나무 오리입니다.");
    }
}
