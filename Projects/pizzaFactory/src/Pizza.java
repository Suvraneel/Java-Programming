/*
 * @author 
 * Suvraneel Bhuin
 */


//////////////////////////////// Pizza
public abstract class Pizza {
	String style, type;

	public void prepare(){
		System.out.println("\n\tGathering & preparing " + this.type);
		System.out.println("\tFlipping & tossing dough...");
		System.out.println("\tAdding Oregano masala...");
		System.out.println("\tDecorating with toppings: ");
	}
	
	public void bake() {
		System.out.println("\tBake @30 mins at 350");
	}
	
	public void cut() {
		System.out.println("\tSlicing the pizza in triangles");
	}
	
	public void box() {
		System.out.println("\tPackaging in PizzaStore box\n");
	}
	
}

//Concrete pizza classes
class ChickenPizza extends Pizza
{
	public ChickenPizza() { 
		this.type = "Chicken";
	}
}

class PaneerPizza extends Pizza
{
	public PaneerPizza() { 
		this.type = "Paneer";
	}
}

class CornPizza extends Pizza
{
	public CornPizza() { 
		this.type = "Corn";
	}
}