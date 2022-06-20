package a07.adapter_pattern.duck_turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고 있어요!");
    }
}
