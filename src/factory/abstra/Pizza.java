package factory.abstra;

import factory.abstra.impl.Pepperoni;
import factory.abstra.impl.Veggies;

public abstract class Pizza {
	protected String name;
     protected Dough dough;
     protected Sauce sauce;
     protected Veggies veggies[];
     protected Cheese cheese;
     protected Pepperoni pepperoni;
     protected Clams clam;
     
     public abstract void prepare();
     
     protected void bake(){
     	System.out.println("Bake for 25 minutes at 350");
     	
     }
     
     protected void cut(){
     	System.out.println("Cutting the pizza into diagonal slices");
     }
     
     protected void box(){
     	System.out.println("Place pizza in offical PizzaStore box");
     }
     
     
     public void setName(String name) {
		this.name = name;
	}

	public String getName(){
     	return name;
     }
     
	@Override
	public String toString() {
		return super.toString();
	}
}
