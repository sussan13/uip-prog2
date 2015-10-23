
import java.util.Scanner;
 

public class Lata {
	private static Scanner keyboard;
	
     private float radio, diam, v, superf; 
	 private static float altu;
	 private  static float PI=(float)3.14;

	public static void main(String[] args) {
		
		    class lata{
		    	
			float altu = (float)4.8;
			float diam = (float)2.5;
			
			}
		
	    Scanner keyboard = new Scanner(System.in);
		System.out.print("\nIngrese el radio de una lata: ");
		float radio = keyboard.nextFloat();
		System.out.print("El radio ingresado es: " +radio);
	
	
	    float v =  ((PI * radio) + (radio * altu));
	    float superf = (2*PI)*(radio*radio)+(2*PI)*(radio*altu);
	    	
	   System.out.println("\nEl volumen de la lata es: " +v);
	   System.out.println("El superficie de la lata es: " +superf);
	}
}

