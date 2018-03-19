package factory.simple;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    
    protected ArrayList<String> toppings=new ArrayList<String>();
    
    protected void prepare(){
    	System.out.println("Preparing "+name);
    	System.out.println("Tossing dough...");
    	System.out.println("Adding sauce...");
    	System.out.println("Adding toppings: ");
    	for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  "+toppings.get(i));
		}
    }
    
    protected void bake(){
    	System.out.println("Bake for 25 minutes at 350");
    	
    }
    
    protected void cut(){
    	System.out.println("Cutting the pizza into diagonal slices");
    }
    
    protected void box(){
    	System.out.println("Place pizza in offical PizzaStore box");
    }
    
    public String getName(){
    	return name;
    }
    
}
