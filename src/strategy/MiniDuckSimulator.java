package strategy;

import strategy.impl.FlyRocketPowered;
import strategy.impl.MallarDuck;
import strategy.impl.ModelDuck;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallarDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
