import java.util.Scanner;

public class ClaseResuelta {

	public static void main(String[] args) {
//Dada una palabra (cad=cadena) y una vocal (caracter=car), verificar cuantas
// veces se repite el caracter car en la cadena cad 
//cad = "casa blanca"    car = a



System.out.println("Escribir una palabra o frase");   
Scanner cad = new Scanner (System.in); // se crea un scanner nuevo llamado cad
		String palabra = cad.nextLine(); // se crea un string llamado palabra, definido 
																	// por el texto ingresado por el usuario
		
		System.out.println("Ingresar la letra que desea buscar");   
		Scanner scan2 = new Scanner (System.in);
		char letra = scan2;
		
		
		
		// se crea un string llamado nuevoString, que tendra la palabra ingresada en minusculas
		String nuevoString = palabra.toLowerCase() ; // Se transforma todo en minusculas 
	
		int cont = 0;
		  
		for (int i = 0; i < nuevoString.length(); i++) {
		    if (nuevoString.charAt(i) == letra) {
		        cont++;
		    }
		}
		
		System.out.println("La letra A se repite " + cont  + "veces" );
		
	}

}
