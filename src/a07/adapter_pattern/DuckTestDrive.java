package a07.adapter_pattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("===========칠면조===========");
        turkey.gobble();
        turkey.fly();

        System.out.println("===========오리===========");
        duck.quack();
        duck.fly();

        System.out.println("===========칠면조 어댑터===========");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
