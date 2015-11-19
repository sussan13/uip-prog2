import java.util.Scanner;

public class Curso {
	
	private static float promedio;
	private static float n1, n2, n3, n4, n5 ;
	private static int baja;
    static int i;
	
	private static Scanner keyboard;

	public static void main(String[] args) {
	
		for (i=1; i<=3; i++){
		keyboard = new Scanner(System.in);
		System.out.printf("\n\n***********************************\n");
		System.out.println("\n\tCALIFICACIONES Y PROMEDIO DE LAS NOTAS DE LOS LABORATORIOS\n");
		System.out.print("Estudiante: "+i);
		System.out.print("\n\nIngrese la primera nota de la calificación: ");
		float n1 = keyboard.nextFloat();
		System.out.print("Ingrese la segunda nota de la calificación: ");
		float n2 = keyboard.nextFloat();
		System.out.print("Ingrese la tercera nota de la calificación: ");
		float n3 = keyboard.nextFloat();
		System.out.print("Ingrese la cuarta  nota de la calificación: ");
		float n4 = keyboard.nextFloat();
		System.out.print("Ingrese la quinta  nota de la calificación: ");
		float n5 = keyboard.nextFloat(); 
	
	if((n1>=n2 && n2<=n3) && (n3>=n4 && n4>n5)){
		promedio = ((n1+n2+n3+n4)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n5);
	    }
	else if((n1>=n2 && n2>=n3 && n3>=n4 && n4>n5)){
		promedio = ((n1+n2+n3+n4)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n5);
	}
	else if((n1<=n2 && n2<=n3 && n3<=n4 && n4>n5)){
		 promedio = ((n1+n2+n3+n4)/4);
			System.out.print("\nEl promedo es: "+promedio);
			System.out.print("\nLa calificación mas baja es: "+n5);
	
	}
	else if ((n1<=n2 && n2>n3)&&(n3>n4 && n4<=n5)){
		promedio = ((n1+n2+n3+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n4);
	}
	else if ((n1>=n2 && n2<=n3 && n3>=n4 && n4<=n5)){
		promedio = ((n1+n2+n3+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n4);
	}
	else if ((n1>=n2 && n3>=n4 && n4<=n5)){
		promedio = ((n1+n2+n3+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n4);
	}
	
	else if ((n1<=n2 && n2>n3 && n3<n4 && n4<=n5)){
		promedio = ((n1+n2+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n3);
	}

	else if ((n1>=n2 && n2>n3 && n3<n4 && n4>=n5)){
		promedio = ((n1+n2+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n3);
	}
	else if ((n1<=n2 && n2>=n3 && n3<n4 && n4>=n5)){
		promedio = ((n1+n2+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n3);
	}
	else if ((n1>=n2 && n2<n3 && n3<=n4 && n4<=n5)){
		promedio = ((n1+n3+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n2);
	}
	else if ((n1>n2 && n2<n3 && n3<=n4 && n4>=n5 )){
		promedio = ((n1+n3+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n2);
	}
	else if ((n1>n2 && n3>=n4 && n4>=n5 )){
		promedio = ((n1+n3+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n2);
	}
	else if ((n1<=n2 && n2<=n3)&&(n3<=n4 && n4<=n5)){
		promedio = ((n2+n3+n4+n5)/4);
		System.out.print("\nEl promedo es: "+promedio);
		System.out.print("\nLa calificación mas baja es: "+n1);
	}
	else if ((n1<n2 && n2>=n3 && n3<=n4 && n4>=n5)){
			promedio = ((n2+n3+n4+n5)/4);
			System.out.print("\nEl promedo es: "+promedio);
			System.out.print("\nLa calificación mas baja es: "+n1);
			
			
			 	
		}
		  
		}
		
		
}
}