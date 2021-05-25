public class ComplexNumber {
    private int real, imaginary;
    
    // Default constructor
    public ComplexNumber () {
        this (0, 0);
    }
    
    // Parameterized constructor
    public ComplexNumber (int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Copy constructor 
    ComplexNumber(ComplexNumber cn) { 
        real = cn.real; 
        imaginary = cn.imaginary; 
    } 
    
    // Method to add the parameters to the current object
    public void add (int real_new, int img) {
        real += real_new;
        imaginary += img;
    }
    
    // Method to add the real and imaginary of the cn object to the current object
    public void add (ComplexNumber cn) {
        real += cn.real;
        imaginary += cn.imaginary;
    }
    
    // Overwrite toString() method
    public String toString () {
        String string;
        string = String.format ("%d + %d i", real, imaginary);
        return (string);
    }
}