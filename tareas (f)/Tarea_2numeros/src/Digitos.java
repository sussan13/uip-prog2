import java.util.Scanner;

public class Digitos {
	private static int suma;
	private int num1;
	private int num2;
	private static String cadena="";
    private static char seguir = 'S';
	private static Scanner keyboard;

	public static void main(String[] args) {
		while ((seguir=='s') | (seguir=='S')){
			
		System.out.print("\n\tINGRESE LOS DATOS\n");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nIngrese el primer número menor a 1000: ");
		int num1 = keyboard.nextInt();
		System.out.print("El número ingresado es: " +num1);
						
		System.out.print("\nIngrese el segundo número menor a 1000: ");
		int num2 = keyboard.nextInt();
		System.out.print("El número ingresado es: " +num2);
			
			if (num1<=9 && num2<=9){
				suma = (1+1);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);	
			}
			else if((num1>=10 && num2<=99)&&(num2>=10 && num1<=99)) {
				suma = (2+2);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);	
			}
			else if(num1<=9 && num2<=99) {
				suma = (2+1);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);	
			}
			else if(num2<=9 && num1<=99){
				suma = (2+1);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
			}
			else if ((num1>=100 && num2<=999)&&(num2>=100 && num1<=999)){
				suma =(3+3);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
			}
			else if ((num1>=100 && num2<=999)&&(num2>=100 && num1<=999)){
				suma =(3+3);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
			}
			else if ((num1<=9 && num2<=99)&&(num2<=9 && num1<=99)){
				suma =(3);
				System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
			}
			
			else if((num1<=9 && num2<=999)&&(num2<=9 && num1<=999)){
	        	suma =(1+3);
	            System.out.print("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num1<=999 && num2<=9){
	        	suma =(3+1);
			    System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num2<=999 && num1<=9){
	        	suma =(3+1);
			    System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
			}
			else if((num1>=10 && num2<=99)&&(num2>=10 && num1<=99)){
	        	suma =(2+2);
			    System.out.print("\n\nLa suma de ambos dígitos es: " +suma);
	        }
			else if((num1<=999 && num2>=10)&& (num2<=999 && num1>=10)) {
	        	suma =(3+2);
	        	System.out.println("\n\nLa suma de ambos dígitos es: " +suma);
			}
	        	keyboard.nextLine();
	    	    keyboard = new Scanner(System.in);  
				System.out.printf("\n\n\t\t¿Desea continuar? s/n : ");
				cadena=keyboard.nextLine();
			    seguir=cadena.charAt(0);
			    System.out.printf("\n\n");  	
	        	System.out.println("*****************************");    		
	}	
}
}