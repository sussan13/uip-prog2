import java.util.Scanner;

public class Principal {
	
	 private static String cadena="";
	 private static char seguir='S';
	 private static Scanner keyboard;
	
	public static void main(String[] args) {
		
		while ((seguir=='s') | (seguir=='S')){
		  
			Ambulancia llamar = new Ambulancia();
			llamar.Operacion();
			
		
		    keyboard = new Scanner(System.in);  
		    System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
		    cadena=keyboard.nextLine();
		    seguir=cadena.charAt(0);
		    
		    System.out.printf("\n\n\n");
		}
	}
}