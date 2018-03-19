package template;

public abstract class CaffeineBeverageWithHook {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments())
			addCondiments();
	}

	public boolean customerWantsCondiments() {

		return true;
	}

	public abstract void brew();

	public abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

}
