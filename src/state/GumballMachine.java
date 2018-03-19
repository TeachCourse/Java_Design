package state;

import state.impl.HasQuarterState;
import state.impl.NoQuarterState;
import state.impl.SoldOutState;
import state.impl.WinnerState;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldOutState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;
		if (numberGumballs > 0)
			state = noQuarterState;
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

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0)
			count--;
	}

	public State getNoQuarterState() {

		return noQuarterState;
	}

	public State getSoldState() {

		return soldState;
	}

	public int getCount() {
		return count;
	}

	public State getSoldOutState() {

		return soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

}
