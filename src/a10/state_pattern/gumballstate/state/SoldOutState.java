package a10.state_pattern.gumballstate.state;

import a10.state_pattern.gumballstate.GumballMachine;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("알맹이가 품절됐기 때문에 동전을 넣을 수 없습니다.");
    }

    public void ejectQuarter() {
        System.out.println("내보낼 동전이 없습니다.");
    }

    public void turnCrank() {
        System.out.println("손잡이를 돌렸지만, 알맹이가 품절됐습니다.");
    }

    public void dispense() {
        System.out.println("내보낼 알맹이가 없습니다.");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "품절 상태";
    }
}
