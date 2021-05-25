import java.io.File;
import java.util.Scanner;

public class ComplexNumberTest {

	public static void main(String[] args) throws Exception{
		File f = new File("compnum");
		ComplexNumber[] ComplexArray = new ComplexNumber[5];
		
		// Accepting Parameters of 1st Complex No. as input from keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter real part of the complex number:");
		int real = Integer.valueOf(keyboard.nextLine());
		System.out.println("Enter imaginary part of the complex number:");
		int img = Integer.valueOf(keyboard.nextLine());
		
		// Creation of Complex Number as parameterized constructor
		ComplexArray[0] = new ComplexNumber(real, img);
		System.out.println("~~~~~~~~~\nFrom Keyboard :\n"+ComplexArray[0]);
		
		// Remaining 4 Complex Nos. as copy constructor
		System.out.println("~~~~~~~~~\nUsing Copy Constructor :");
		for (int i=1; i<5;i++) {
			ComplexArray[i] = new ComplexNumber(ComplexArray[0]);
			System.out.println(ComplexArray[i]);
		}
		
		// Object cn with default constructor
		ComplexNumber cn = new ComplexNumber();
		
		// Adding the complex numbers present in the array to cn
		for (int i=0; i< 5; i++) {
			cn.add(ComplexArray[i]);
		}
		
		// Add the parameters of complex numbers present in the file to cn
		Scanner parser = new Scanner(f);
		System.out.println("~~~~~~~~~\nFrom File :");
		while (parser.hasNextLine()) {
			real = parser.nextInt();
			img = parser.nextInt();
			System.out.println(real + " + " + img + " i");
			cn.add(real, img);
		}
		
		// Printing the complex number cn.
		System.out.println("~~~~~~~~~\nFinal Sum : ");
		System.out.println(cn);
		
		// close scanners to prevent resource leak
		keyboard.close();
		parser.close();
	}
}
