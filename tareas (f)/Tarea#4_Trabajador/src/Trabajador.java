/*A un trabajador le pagan segun sus horas y una tarifa de pago por horas. Si la cantidad de horas trabajadas es
 *  mayor a 40 horas, la tarifa se incrementa en un 50% para las horas extras. Usted debe calcular el salario para 
 *  5 trabajadores, obteniendo su nombre y tarifa por teclado. Finalmente debe mostrar un reporte en pantalla que indique 
 *  el nombre y el salario neto para cada uno de los trabajadores.
 */
import java.util.Scanner;


public class Trabajador {
private static Scanner keyboard;

private static String mon;
private static float sala;
private static float ope, t;
private int ho;
private int ex;
private static int i;


	public static void main(String[] args)
	{

	   for(int i=1; i<=5; i++){
			   
			    keyboard = new Scanner (System.in);
			    System.out.print("\nIngrese nombre del trabajador " +i +": ");
			   String mon = keyboard.next();
			    System.out.print("Ingrese el salario del trabajador " +i +": ");
			    float sala = keyboard.nextFloat();
			    System.out.print("Ingrese las horas trabajadas del trabajador " +i +": ");
			    int ho = keyboard.nextInt();
			   
	         if(ho<=40){
	        	 System.out.print("Su salario es: "+sala);
	        	 System.out.print("\n\n ");

	         }
	         else if (ho>40){
	        	 ope = (float) (sala*0.50);
	        	 t = (float) (ope+sala);
	        	 
	        	 System.out.print("su salario incrementado del 50% es: " +ope);
	        	 System.out.print("\n\n ");
	        	 
	         }
	        
	 
	}



}
	

	   
}

	        	 
	        	 
	   
