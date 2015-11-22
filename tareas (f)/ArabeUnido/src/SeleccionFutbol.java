public  class SeleccionFutbol implements IntegranteSeleccionFutbol {

	int id;
	static int edad;
	static String nombre;
	static String apellido;
	
	public SeleccionFutbol(){	
	}
	public SeleccionFutbol(int id, int edad,String nombre, String apellido){
		this.id= id;
		this.edad=edad;
		this.nombre=nombre;
		this.apellido=apellido;
	}

	public void concentarse(){
		System.out.println("Todos se concentran");
	}
	public void viaja(){
		System.out.println("Viaja");
	}
	public void entrenar(){
		System.out.println("Todos Entrenan");}
	public void jugarPartidos(){
		System.out.println("Asistio al partido");
	}

	@Override
	public void concentrarce() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub		
	}
}