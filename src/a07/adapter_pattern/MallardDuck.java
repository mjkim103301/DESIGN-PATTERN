package a07.adapter_pattern;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("꽥");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
