import java.util.Scanner;

public class Principal {
	
	 private static int opc;
	 private static String cadena="";
	 private static char seguir = 'S';

	public static void main(String[] args) {
		while ((seguir=='s') | (seguir=='S')){
			System.out.println("\n\t Cajero áutomático (ATM).");
			System.out.println("\n Ha iniciado sesion.");
			System.out.println("\n       MENU");
			System.out.println("------------------");
			System.out.println("1. Hacer una transaccion y retiro.");
			System.out.println("2. salir");
	
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("\nIngrese una opción:");
	    opc = keyboard.nextInt();

		switch (opc){ 
     	case 1:
     		Cliente b = new Cliente();
       		b.digitos1();
      
   			break;
   			
   		case 2:
   			keyboard.nextLine();
    	    keyboard = new Scanner(System.in);  
			System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
			cadena=keyboard.nextLine();
		    seguir=cadena.charAt(0);
		    System.out.printf("\n\n\n");  
   			break;
   			}
		 System.out.println("\n********************"); 
		}
	}
}