import java.util.Locale;
import java.util.Scanner;

public class Ambulancia {
	
	    public static Scanner keyboard;
	    
	   private int velo, dis;
	   private static int t;
	    
	    public void Operacion() {
	    	
	    		System.out.println("\n\tCalcular la velocidad de la ambulancia");
				keyboard = new Scanner(System.in);
				System.out.print("\nIngrese la velocidad: ");
				int velo = keyboard.nextInt();
				System.out.print("Ingrese la distancia: ");
				int dis = keyboard.nextInt();
				System.out.print("La velocidad ingresada es: " +velo +" Km/h");
				System.out.print("\nLa distancia ingresada es: " +dis +" Km");
				t = (dis*velo);
				System.out.print("\nEl tiempo de recorrido de la ambulancia es: " +t +" H");		    
	    }
}