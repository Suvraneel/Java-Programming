package progLab;
//Importing the Swing JOptionPane Library
import javax.swing.*;

public class factorial_joption {
	public static void main(String[] args) {
		
		FactUtil test = new FactUtil(); // Instantiating the Object of class "FactUtil"
				
		// Taking the Input from the User through JOptionPnae
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(
				null, 									// set the Default frame
				"Enter Number to calculate Factorial",  // Input Message
				"Factorial Test",
				null						// Header Message
				//JOptionPane.               // Type of Input Box is Plane Message Box
				));
		
		// Display the Factorial result using JOptionPane, Message Dialog
		
		/*JOptionPane.showMessageDialog(
				null, 
				"Factorial is => "+test.factorial(n)
				);*/
	}
}
