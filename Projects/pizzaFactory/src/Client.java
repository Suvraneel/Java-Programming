import java.util.Scanner;
/*
 * @author 
 * Suvraneel Bhuin
 */

//////////////////////////////// Client Method
public class Client {
	//main driver method
	public static void main(String args[]){
		System.out.println("\n\n\t Simple Pizza Menu ");
        System.out.println("\t ================\n");
        System.out.println("\t1. Chicken Pizza ");
        System.out.println("\t2. Paneer Pizza ");
        System.out.println("\t3. Corn Pizza ");
        System.out.print("\n Which pizza would you fancy? =>\t");
		Scanner keyboard = new Scanner(System.in);
		int ch = keyboard.nextInt();
		Pizza p = null;
		switch(ch) {
	      case 1:
	    	  p = new ChickenPizza();
	          break;
	      case 2:
	          p = new PaneerPizza();
	          break;
	      case 3:
	          p = new CornPizza();
	          break;
	      default:
	    	  System.out.println("Invalid Order");
	    	  break;
		}
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		System.out.println("Order Successful ! Enjoy your "+ p.type +" Pizza\n\n");
		keyboard.close();
	}
}
