package a10.state_pattern.gumballstate.state;

import a10.state_pattern.gumballstate.GumballMachine;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("동전이 이미 있습니다.");
    }

    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았습니다.");
    }

    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려주세요.");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("알맹이가 품절됐습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() {
    }

    public String toString() {
        return "알맹이를 내보내는 상태";
    }
}


