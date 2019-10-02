package copy.constructor;
/*
 * @Author Ashwini kamath
 * 
 * Assigning the value of Object to new object simply makes the reference of the object point to the same object
 * Hence, when a new object needs to be created, so that the original object is not modified.
 * Copy Constructor or Clone Method needs to be used.
 * This creates an new object and assigns it to the new reference created by the constructor/method
 */
class Complex implements Cloneable{ 
	  
    private double re, im; 
  
    public Complex(double re, double im) { 
        this.re = re; 
        this.im = im; 
        System.out.println(re +" + " + im + "i");
    } 
    //Copy Constructor
    public Complex(Complex c){
    	re = c.re;
    	im = c.im;
    	 System.out.println(re +" + " + im + "i");
    }
    @Override
    //If Cloneable interface is not implemented @ runtime the class can throw CloneNotSupportedException.
    //Hence, need to handle the scenario
    protected Object clone() throws CloneNotSupportedException{
    	
		return super.clone();
    	
    }
} 
  
public class Main { 
      
    public static void main(String[] args) { 
       Complex c1 = new Complex(10, 15);   
       Complex c2 = new Complex(c1);  // Copy Constructor invoked
       Complex c3 = null;
       Complex c4 = c1;
       try {
    	   c3 = (Complex)c1.clone();
       } catch (CloneNotSupportedException e) {
    	   // Thrown by Complex class needs to be handled
    	   e.printStackTrace();
       }
       if(c1.equals(c2))
    	   System.out.println("Is value of c1 and c2 equal? -> Yes ");
       else
    	   System.out.println("Is value of c1 and c2 equal? -> No");
       
       
       if(c1.equals(c3))
    	   System.out.println("Is value of c1 and c3 equal? -> Yes ");
       else
    	   System.out.println("Is value of c1 and c3 equal? -> No");
       
       if(c1.equals(c4))
    	   System.out.println("Is value of c1 and c4 equal? -> Yes ");
       else
    	   System.out.println("Is value of c1 and c4 equal? -> No");
    } 
} 