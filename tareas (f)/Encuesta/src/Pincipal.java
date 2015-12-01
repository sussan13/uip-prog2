import java.util.InputMismatchException;

public class Pincipal {

	public static void main(String[] args) {
		try{
			
		Deporte p = new Deporte();
		p.lista();
		
		} catch(InputMismatchException ex){
		System.out.println("\n    ATENCIÓN, ha ingresado un carácter NO numérico, porfavor vuelva a intentarlo.....");
		}
	}
}