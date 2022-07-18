package a10.state_pattern.gumballstate;

import a10.state_pattern.gumballstate.state.HasQuarterState;
import a10.state_pattern.gumballstate.state.NoQuarterState;
import a10.state_pattern.gumballstate.state.SoldOutState;
import a10.state_pattern.gumballstate.state.SoldState;
import a10.state_pattern.gumballstate.state.State;
import a10.state_pattern.gumballstate.state.WinnerState;

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("알맹이가 리필됐습니다. 현재 알맹이 개수 : " + this.count);
        state.refill();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n알맹이 뽑기 기계 시작.");
        result.append("\n현재 알맹이 개수: " + count);
        if (count != 1) {
            result.append("개");
        }
        result.append("\n");
        result.append("현재 기계 상태 : " + state + "\n");
        return result.toString();
    }
}
