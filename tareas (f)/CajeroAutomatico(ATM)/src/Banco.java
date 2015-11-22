import java.util.Scanner;

public class Banco {
	 private static String cadena="";
	 private static char seguir = 'S';

	public void transacción(){
		
		while ((seguir=='s') | (seguir=='S')){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Ingrese el numero de cuenta de la transacción (10 dígitos): ");
	    int transa = keyboard.nextInt();
	 
	    System.out.print("La cantidad de dinero a retirar: ");
		float dine = keyboard.nextFloat();
		
		System.out.println("\nHEMOS LLEVADO A CABO LA TRANSACCION A LA CUENTA "+transa +" con "+dine+" $");
		
		keyboard.nextLine();
	    keyboard = new Scanner(System.in);  
		System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
		cadena=keyboard.nextLine();
	    seguir=cadena.charAt(0);
	    System.out.printf("\n\n\n"); 
	    
	    Principal p = new Principal();
	    String[] args = null;
		Principal.main(args);
		}	
	}
	public void mal(){
		System.out.println("Su cuenta a sido bloqueada por 1 día, notifiquele al banco.");
	
	 
		
}
	}
	
