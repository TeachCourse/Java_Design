package singleton;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class ChocolateBoiler {
	private volatile ChocolateBoiler instance;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public ChocolateBoiler getInstance() {
		if (instance == null) {
			synchronized (ChocolateBoiler.class) {
				if (instance == null) {
					instance = new ChocolateBoiler();
				}
			}
		}
		return instance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 在锅炉内填满巧克力和牛奶的混合物
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// 排出煮沸的巧克力和牛奶
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 将炉内物煮沸
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
