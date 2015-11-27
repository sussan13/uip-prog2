import java.util.Scanner;
     public class El_Emperador {
    	 
    	 private static Scanner keyboard;
	     private float  t;
	     private static float ope, des;
	     private static float mon;
			
	   public void ope() {
	
		keyboard = new Scanner (System.in);
		System.out.print("\nIngrese el monto de la compra: ");
		float mon = keyboard.nextFloat();
		System.out.println("\nEl Monto de la compra es: " + mon);
	    
	     if (mon>=500)	  {
	    	 ope=(float)(mon*0.30);
	    	 des=(float)(mon-ope);
	    	 System.out.println("\nEl descuento de la compra del 30% es: " +ope);
	    	 System.out.println("\nEl total de la compra es : " +des); 	 
	     }
	     
	     else if (mon<500 && mon>=200){
	    	 ope=(float)(mon*0.20);
	    	 des=(float)(mon-ope);
	    	 System.out.println("\nEl descuento de la compra del 20% es: " +ope);
	    	 System.out.println("\nEl total de la compra es : " +des);                 
	    }
	     else if (mon<200 && mon>=100){
	    	 ope=(float)(mon*0.10);
	    	 des=(float)(mon-ope);
	    	 System.out.println("\nEl descuento de la compra del 10% es: " +ope);
	    	 System.out.println("\nEl total de la compra es : " +des);
	     }
	   }
     }