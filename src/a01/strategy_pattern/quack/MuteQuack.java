package a01.strategy_pattern.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("이 오리는 소리가 나지 않습니다.");
    }
}
