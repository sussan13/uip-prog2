import java.util.Scanner;

public class Nueva {
	

	private static Scanner keyboard;
	private static Scanner keyboard1;
	private static Scanner keyboard11;
	

	public static void main(String[] args) {
	char seguir = 's';
	int conta = 0;
	
	      System.out.print("\n\t DEPORTIVO ARABE UNIDO\n");
	      System.out.print("\nANTES DEL PARTIDO");
	      System.out.print("\n------------------\n");
	
	       Entrenador bb = new Entrenador();
	       bb.planificarEntrenamiento();
	       
	       SeleccionFutbol cc = new SeleccionFutbol();
	       cc.entrenar();
	       
	       Masajista dd = new Masajista();
	       dd.darMasaje();
	
		for(int i = 1; i<=15; i++){
			keyboard = new Scanner(System.in);
			System.out.print("\nIngrese el nombre y apellido del "+i +" jugador" +" :");
			SeleccionFutbol.nombre= keyboard.next();
			SeleccionFutbol.apellido=keyboard.next();
			System.out.print("íngrese la edad del "+i +" jugador"+" :");
			SeleccionFutbol.edad=keyboard.nextInt();
			
		}
		
		keyboard = new Scanner(System.in);
		System.out.print("\nIngrese nombre del entrenador: ");
		Entrenador.idFederacion=keyboard.next();
		System.out.print("Ingrese nombre del primer masajista: ");
		Masajista.masajista1=keyboard.next();
		System.out.print("Ingrese nombre del segundo masajista: ");
		Masajista.masajista2=keyboard.next();
		
	while ((seguir=='s') | (seguir=='S')){
		System.out.println("\n EMPIEZA EL PARTIDO");
	    System.out.println("\n       MENU");
	    System.out.println("------------------");
	    System.out.println("1. Penal");
	    System.out.println("2. Uno contra uno ( delantero, portero)");
     	System.out.println("3. tiro libre");
    	System.out.println("4. Saque de esquina (izquierda o derecha)");
    	System.out.println("5. Fuera)");
    	System.out.println("6. Falta)");
    	System.out.println("7. Salir");
	
	int opc;
	keyboard1 = new Scanner(System.in);
    System.out.print("\nIngrese una opción:");
    opc = keyboard1.nextInt();
    		    
	String cadena;
	
	
	switch (opc){ 
 	    case 1:
 	    	System.out.println("Eligio Penal");
 		    Portero c = new Portero();
 		    System.out.println("Penal: " +c.Penal);
		    conta=conta+c.Penal;
			
	    break;
			
		case 2:
			System.out.println("Eligio Uno contra uno ( delantero, portero)");
			Portero b = new Portero();	
			System.out.println(" Uno contra uno ( delantero, portero): "+b.Unocontrauno);
			conta=conta+b.Unocontrauno;
			break;
			
		case 3:
			System.out.println("Eligio tiro libre");
			Portero d = new Portero();	
			System.out.println(" Tiro libre: "+d.tirolibre);
			conta=conta+d.tirolibre;
			break;
			
		case 4:
			System.out.println("Eligio Saque de esquina (izquierda o derecha)");
			Portero e = new Portero();	
			System.out.println(" Saque de esquina (izquierda o derecha): "+e.Saquedeesquina);
			conta=conta+e.Saquedeesquina;
 		
        break;
        
		case 5:
			System.out.println("Eligio Fuera");
			Portero f = new Portero();
			System.out.println(" Fuera: "+f.fuera);
			conta=(conta+f.fuera);
 		
		break;
        
		case 6:
			System.out.println("Eligio Falta");
			Portero g = new Portero();	
			System.out.println("Falta: "+g.falta);
 		    conta=conta+g.falta;
 		    
        break;
			
		case 7:
			keyboard1.nextLine();
	        keyboard1 = new Scanner(System.in);  
		    System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
		    cadena=keyboard1.nextLine();
	        seguir=cadena.charAt(0);
	        System.out.printf("\n\n\n");  		    
}
	System.out.println("La suma es: "+conta );    
}
	 
     if (conta>=10){
    	 System.out.println("\nGanaron el partido");
    	 System.out.println("\nCOMENTARIOS");
         System.out.println("\nPORTERO " + "Mi equipo jugó muy bien.");
         System.out.println("JUGADORES QUE METIERON GOL: " +"Confío en mí y en mi trabajo, y espero seguir ayudando al equipo con goles.");
	     System.out.println("ENTRENADOR: "+ "Confió en mis jugadores pierdan o ganen estaré feliz del trabajo que hacen en la cancha.");	
	     }
     if(conta<=5){
    	 System.out.println("\nPerdieron el Partido");
         Masajista mases = new Masajista();
         mases.darMasaje();
         System.out.println("\nCOMENTARIOS");
         System.out.println("\nPORTERO: " +"Mi equipo jugó pésimo.");
         System.out.println("JUGADORES QUE METIERON GOL: " +"Confío en mí y en mi trabajo, y espero seguir ayudando al equipo con goles");
         System.out.println("ENTRENADOR: "+ "Confió en mis jugadores pierdan o ganen estaré feliz del trabajo que hacen en la cancha.");	
        }
 System.out.println("\n***********************");
}


}
