import java.util.Scanner;

public class Digitos {
	static int suma;
	int num1;
	int num2;
	private static Scanner keyboard;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
			System.out.print("\nIngrese el primer número menor a 1000: ");
			int num1 = keyboard.nextInt();
			System.out.print("El número ingresado es: " +num1);
			
			
			System.out.print("\nIngrese el segundo número menor a 1000: ");
			int num2 = keyboard.nextInt();
			System.out.print("El número ingresado es: " +num2);
			
			if (num1<=9 && num2<=9){
				suma = (1+1);
				System.out.print("\nLa suma de ambos dígitos es: " +suma);	
			}
			else if((num1>=10 && num1<=99)&&(num2>=10 && num2<=99)) {
				suma = (2+2);
				System.out.print("\nLa suma de ambos dígitos es: " +suma);	
			}
			else if ((num1>=100 && num1<=999)&&(num2>=100 && num2<=999)){
				suma =(3+3);
				System.out.print("\nLa suma de ambos dígitos es: " +suma);
			}
			else if(num1<=99 && num2>1){
	        	suma =(1+2);
			System.out.print("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num1<=9 && num1<=999){
	        	suma =(3);
			System.out.print("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num2<=999 && num2>=1){
	        	suma =(4);
			System.out.print("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num1>=10 && num1<=99){
	        	suma =(4);
			System.out.print("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num2>=10 && num2<=99){
	        	suma =(4);
			System.out.print("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num1<=999 && num2>=999) {
	        	suma =(3+2);
	        	System.out.println("\nLa suma de ambos dígitos es: " +suma);
	        }
			else if(num1>=10 && num2<=999){
	        	suma =(2+3);
	        	System.out.println("\nLa suma de ambos dígitos es: " +suma);
			
			}
	}
	
}
