import java.io.InputStream;
import java.util.Scanner;

public class Cliente {

	 int contra =1313;
	 int numeroint = 3;
     int conta ;
     
	 
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
        
        else if (contra!=num1){
        	System.out.println("Contrase�a incorrecta");      
            System.out.println("Vuelva a ingresarla");
            conta=conta+1;
        }
        while (conta==3){
               if(conta!=contra){
        		Banco u= new Banco();
           		u.mal(); 	
        	}  	
              
        }
		}
	}
}	    	   	  