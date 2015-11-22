
public class Portero {

	int Penal=10;
	int Unocontrauno= 10;;
	int tirolibre= 5;
	int Saquedeesquina= 5;
    int fuera = -7;
	int falta = -3;

	private static int conta;
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		Portero.conta = conta;
	}

	public void Penal(){
		Penal= +10;
   }

	public void Unocontrauno(){
	   Unocontrauno= +10;
	}

	public void tirolibre(){
		tirolibre = +5;
	}
	public void Saquedeesquina(){
		Saquedeesquina = +5;
	}

	public void Fuera(){
		fuera = -7;
	}

    public void Falta(){
		falta = -3;
	}		
}