import java.util.Scanner;

public class Principal {

	 public static Scanner keyboard;

	  private static int peso;
     private int opc;
	 private static String cadena="";
	 private static char seguir = 'S';
  
	public static void main(String[] args) {
		
		while ((seguir=='s') | (seguir=='S')){
			
			System.out.println("\n EL JUEGO DE LA BOA");
			System.out.println("\n       MENU");
			System.out.println("------------------");
			System.out.println("1. Crear una Boa");
			System.out.println("2. Alimentar a la Boa");
			System.out.println("3. Jugar con la Boa");
			System.out.println("4. Dormir a la Boa");
			System.out.println("5. Salir");
			
			int opc;
		    Scanner keyboard = new Scanner(System.in);
		    System.out.print("\nIngrese una opción:");
		    opc = keyboard.nextInt();

			switch (opc){ 
         	case 1:
         		System.out.println("Eligio crear una Boa");
           		System.out.print("\nIngrese el nombre de la Boa: ");
           		String nom = keyboard.next();
       			System.out.println("El nombre de la Boa es: " +nom); 
       			
       			break;
       			
       		case 2:
       			System.out.println("Eligio alimentar  Boa");
       			Boa_Esmeralda c = new Boa_Esmeralda();
       			System.out.println("alimentar: " +c.alimentar);
       			peso=peso+c.alimentar;
       			       			
       			break;
       			
       		case 3:
       			System.out.println("Eligio jugar con la Boa");
       			Boa_Esmeralda d = new Boa_Esmeralda();
       			System.out.println("jugar es: " +d.jugar);
       			peso=peso+d.jugar;
       			
       			break;
       			
       		case 4:
       			System.out.println("Eligio dormir a la Boa");
       			Boa_Esmeralda b= new Boa_Esmeralda();
       			System.out.println("dormir es: " +b.dormir);
       			peso=peso+b.dormir;
       			     			
                break;
       			
       		case 5:
       			keyboard.nextLine();
	    	    keyboard = new Scanner(System.in);  
				System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
				cadena=keyboard.nextLine();
			    seguir=cadena.charAt(0);
			    System.out.printf("\n\n\n");  		    		       			
	}
			System.out.println("La suma es: "+peso );
		
		}
		 if (peso>=15)
			 System.out.println("MURIO LA BOA");
		 else if(peso<2)
			 System.out.println("MURIO LA BOA");
		 System.out.println("\n********************"); 
	}
}