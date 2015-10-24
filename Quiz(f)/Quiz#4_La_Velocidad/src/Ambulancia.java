import java.util.Scanner;
import java.util.Locale;


public class Ambulancia {
	
	    public static Scanner keyboard;
	    
	   private int velo, dis;
	   private static int t;
	   private 	static String cadena="";
	   private static char seguir='S';
	    
	    public static void main(String[] args) {
	    	Locale.setDefault(Locale.US);
	    	
	    	while ((seguir=='s') | (seguir=='S')){
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
	    	
	    	    keyboard.nextLine();
	    	    keyboard = new Scanner(System.in);  
				System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
				cadena=keyboard.nextLine();
			    seguir=cadena.charAt(0);
			    
			    System.out.printf("\n\n\n");
			    
			  
	    	}
	    	

	    	  }
	    	}

	   


			
			
			
	
	
		
			
		
	

	


