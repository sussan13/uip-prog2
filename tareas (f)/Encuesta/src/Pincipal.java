import java.util.InputMismatchException;

public class Pincipal {

	public static void main(String[] args) {
		try{
			
		Deporte p = new Deporte();
		p.lista();
		
		} catch(InputMismatchException ex){
		System.out.println("\n    ATENCI�N, ha ingresado un car�cter NO num�rico, porfavor vuelva a intentarlo.....");
		}
	}
}