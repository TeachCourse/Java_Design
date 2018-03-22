package template.impl;

import template.CaffeineBeverage;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
