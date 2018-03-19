package strategy.impl;

import strategy.Duck;

public class MallarDuck extends Duck {
    public MallarDuck(){
    	quackBehavior=new Quack();
    	flyBehavior=new FlyWithWings();
    }
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
		
	}

}
