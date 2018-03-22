package state.impl;

import state.GumballMachine;
import state.State;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Sorry,gumball has been sold out!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("no gumball can be dispensed");

	}

	@Override
	public void turnCrank() {
		System.out.println("turnCrank failed");

	}

	@Override
	public void dispense() {
		System.out
				.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall();

		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops,out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
