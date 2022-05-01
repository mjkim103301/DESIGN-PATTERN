package a01.strategy_pattern.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("이 오리는 날 수 있습니다.");
    }
}
