package a10.state_pattern.gumballstate.state;

import a10.state_pattern.gumballstate.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;
    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("동전을 이미 넣었습니다.");
    }

    public void ejectQuarter() {
        System.out.println("동전을 반환합니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("손잡이를 돌렸습니다.");
        if (randomWinner.nextInt(5) == 0 && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
            return;
        }
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }

    public void refill() {
    }

    public String toString() {
        return "동전이 들어온 상태";
    }
}
