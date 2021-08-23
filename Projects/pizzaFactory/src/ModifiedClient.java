import java.util.Scanner;
/*
 * @author 
 * Suvraneel Bhuin
 */

//////////////////////////////// Modified Client Method
public class ModifiedClient {
	//main driver method
	public static void main(String args[]){
		
		PizzaStore ps=null;
		Scanner keyboard = new Scanner(System.in);	
		System.out.println("\n\n\t Stores ");
        System.out.println("\t ======\n");
        System.out.println("\t1. Pizza Store 1");
        System.out.println("\t2. Pizza Store 2");
        System.out.println("\t3. Pizza Store 3");
        System.out.print("\n Select Store =>\t");
        int ch = keyboard.nextInt();
		switch(ch) {
	      case 1:
	    	  ps = new PizzaStore1();
	          break;
	      case 2:
	    	  ps = new PizzaStore2();
	          break;
	      case 3:
	    	  ps = new PizzaStore3();
	          break;
	      default:
	    	  System.out.println("\tInvalid Store No. entered");
	    	  break;
		}
		
		ps.orderMenu();
		int pref = keyboard.nextInt();
		ps.setPreference(pref);
		Pizza pizza=ps.orderPizza(ps.style, ps.type);
		System.out.println("Order Successful ! Enjoy your " + ps.style + " " + pizza.type +" Pizza");
		System.out.println("\t- Regards Pizza Store " + ch + " :)\n\n");
		keyboard.close();
	}
}
