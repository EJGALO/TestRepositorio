import java.util.Scanner;

public class HelloWorld {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in) ;
							System.out.println("Ingrese un numero");
			int numero_usuario = scan.nextInt() ;
							System.out.println("El valor ingresado es de" );
							System.out.println(numero_usuario) ;
									
	Scanner scan1= new Scanner(System.in) ;
							System.out.println("Ingrese un valor decimal");
	double numero_usuario_double = scan1.nextDouble() ;
							System.out.println("El valor ingresado es de "); 
							System.out.println(numero_usuario_double);
							
	@SuppressWarnings("resource")
	Scanner scan2 = new Scanner(System.in) ;
	System.out.println("Ingrese un string");
	String usuario_palabra = scan2.nextLine() ;

	System.out.println("El string ingresado es");
	System.out.println(usuario_palabra);
		}

	}


