package decorator.impl;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Mocha extends CondimentDecorator {
   Beverage beverage;
   
   public Mocha(Beverage beverage){
	   this.beverage=beverage;
   }
	@Override
	public String getDescription() {
		
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		
		return 0.20+beverage.cost();
	}

}
