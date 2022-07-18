package a10.state_pattern.gumballstate.state;

import a10.state_pattern.gumballstate.GumballMachine;

public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전이 이미 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.releaseBall();
            System.out.println("축하합니다! 보너스 알맹이에 당첨돼어 하나 더 드립니다.");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        if (gumballMachine.getCount() == 0) {
            System.out.println("알맹이가 품절됐습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "보너스 알맹이 당첨 상태";
    }
}
