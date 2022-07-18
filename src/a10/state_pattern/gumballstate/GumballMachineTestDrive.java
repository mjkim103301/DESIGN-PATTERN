package a10.state_pattern.gumballstate;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println("\n1번째 - " + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\n2번째 - " + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\n3번째 - " + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.refill(5);

        System.out.println("\n4번째 - " + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\n5번째 - " + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
