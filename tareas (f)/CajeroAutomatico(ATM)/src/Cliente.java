import java.io.InputStream;
import java.util.Scanner;

public class Cliente {

	 int contra =1313;
	 int numeroint = 3;
     int conta=0 ;
     
	 
	public void digitos1(){

		while(true){
	    Scanner teclado = new Scanner(System.in);
        System.out.print("\nIngrese su contrase�a la de cuatro d�gitos: ");
        int num1 = teclado.nextInt(); 
        
        if(num1==contra){
          System.out.println("Contrase�a correcta");
          Banco b = new Banco();
          b.transacci�n();
           } 
        
        else if(conta>=3){
            Banco u= new Banco();
            u.mal();
            
            break;
        }
       
        else if (contra!=num1){
        	System.out.println("Contrase�a incorrecta");      
            System.out.println("Vuelva a ingresarla");
            conta++;
            System.out.println("Numero de ingreso invalido es: "+conta);
        }
  	}  	   
    }
	}

	    	   	  