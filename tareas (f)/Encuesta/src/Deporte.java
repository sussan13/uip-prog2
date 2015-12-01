import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deporte {
	private int opc;
	private static String cadena="";
	private static char seguir = 'S';
	private int i=0;
	private int conta=0;
	private int re=0;
	private int a=0;
	private int b=0;
	private int c=0;
	private int d=0;
	private int e=0;
	private int f=0;
	private int g=0;
	 
	public void lista(){
    for(i=0; i<=9;++i){			
	List<String> lista;
	lista = new ArrayList<>();
	lista.add(1+"."+"Ajedrez.");
	lista.add(2+"."+"Atletismo.");
	lista.add(3+"."+"Baloncesto.");
	lista.add(4+"."+"Fútbol.");
	lista.add(5+"."+"Karate.");
	lista.add(6+"."+"Natación.");
	lista.add(7+"."+"Volleyball.");
	lista.add(8+"."+"Flag.");
	lista.add(9+"."+"Ping Pong.");
	
	System.out.println("\n*********************************************");
	System.out.println("\n\tENCUESTA DE DEPORTES PARA 10 PERSONAS\n");
	System.out.println("   MENU");
	System.out.println("-------------\n");
	System.out.println(lista.get(0));
	System.out.println(lista.get(1));
	System.out.println(lista.get(2));
	System.out.println(lista.get(3));
	System.out.println(lista.get(4));
	System.out.println(lista.get(5));
	System.out.println(lista.get(6));
	System.out.println(lista.get(7));
	System.out.println(lista.get(8));
 
	int opc;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nIngrese una opción:");
    opc = keyboard.nextInt();

	switch (opc){ 
	case 1:
		conta++;
		System.out.println("Le gusta el Ajedres. ");
		break;
		
	case 2:
		re++;
     	System.out.println("Le gusta el Atletismo. ");
	    break;
	
	case 3:
		a++;
     	System.out.println("Le gusta el Baloncesto. ");
	    break;
	    
	case 4:
		b++;
     	System.out.println("Le gusta el Fútbol. ");
	    break;
	    
	case 5:
		c++;
     	System.out.println("Le gusta el Karate. ");
	    break;
	    
	case 6:
		d++;
     	System.out.println("Le gusta el Natación. ");
	    break;
	    
	case 7:
		e++;
     	System.out.println("Le gusta el Volleyball. ");
	    break;
	    
	case 8:
		f++;
     	System.out.println("Le gusta el Flag.");
	    break;

	case 9:
		g++;
     	System.out.println("Le gusta el Ping Pong.");
	    break;
	}
    }
	System.out.println("\nPersonas que le gusta el Ajedres: "+conta+".");
	System.out.println("Personas que le gusta el Atletismo: "+re+".");
	System.out.println("Personas que le gusta el Baloncesto: "+a+".");
	System.out.println("Personas que le gusta el Fútbol: "+b+".");
	System.out.println("Personas que le gusta el Karate: "+c+".");
	System.out.println("Personas que le gusta el Natación: "+d+".");
	System.out.println("Personas que le gusta el Volleyball: "+e+".");
	System.out.println("Personas que le gusta el Flag: "+f+".");
	System.out.println("Personas que le gusta el Ping Pong: "+g+".");
	
	if ((conta>re)&&(conta>a)&&(conta>b)&&(conta>c)&&(conta>d)&&(conta>e)&&(conta>f)&&(conta>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es Ajedres.");
		}
	if ((re>conta)&&(re>a)&&(re>b)&&(re>c)&&(re>d)&&(re>e)&&(re>f)&&(re>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es Atletismo.");
		}
	if ((a>conta)&&(a>re)&&(a>b)&&(a>c)&&(a>d)&&(a>e)&&(a>f)&&(a>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es baloncesto.");
		}
	if ((b>conta)&&(b>re)&&(b>a)&&(b>c)&&(b>d)&&(b>e)&&(b>f)&&(b>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es Fútbol.");
		}
	if ((c>conta)&&(c>re)&&(c>a)&&(c>b)&&(c>d)&&(c>e)&&(c>f)&&(c>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es Karate.");
		}
	if ((d>conta)&&(d>re)&&(d>a)&&(d>b)&&(d>c)&&(d>e)&&(d>f)&&(d>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es Natación.");
		}
	if ((e>conta)&&(e>re)&&(e>a)&&(e>b)&&(e>c)&&(e>d)&&(e>f)&&(e>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es  Volleyball.");
		}
	if ((f>conta)&&(f>re)&&(f>a)&&(f>b)&&(f>c)&&(f>d)&&(f>e)&&(f>g)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es  Flag.");
		}
	if ((g>conta)&&(g>re)&&(g>a)&&(g>b)&&(g>c)&&(g>d)&&(g>e)&&(g>f)){
		System.out.println("\nEl deporte con mayor preferencia de los encuestados es Ping Pong.");	
		}
	}
}