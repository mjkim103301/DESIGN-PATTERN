package a10.state_pattern.gumballstate.state;

import a10.state_pattern.gumballstate.GumballMachine;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("동전을 넣었습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("동전을 넣지 않았기 때문에 동전을 꺼낼 수 없습니다.");
	}
 
	public void turnCrank() {
		System.out.println("동전이 없기 때문에 손잡이를 돌릴 수 없습니다.");
	 }
 
	public void dispense() {
		System.out.println("알맹이를 내보내기 전에 동전을 먼저 넣어주세요.");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "동전을 기다리는 상태";
	}
}
