import java.util.Scanner;

/* Dada una cadena ej Talento digital, mostrar por pantalla la 
 * cantidad de vocales que tiene 
 * Ejemplo: 
 * Entrada: Talento digital
 * Salida: La cantidad de vocales es 6
 * *tiempo aproximado 20min*
 */
public class Clase5Febrero {
	
	public static void main(String[] args) {
	
		String[] vocales; // definimos las vocales como string
		vocales = new String[]{"a","e","i", "o", "u"}; // creamos un arreglo con 5 vocales
		int cont= 0 ;
		
				System.out.println("Ingrese una frase") ;
		Scanner lector = new Scanner (System.in) ;
		
		int letrasEnString = lector.length() ; // FIXME tenes que crear una nueva variable y no lector
		
		System.out.println("El String ingresado contiene" + letrasEnString + "caracteres");
		
		
		String[] palabras; // definimos 	palabras a ingresar como string
		palabras = new String[] {} ;
		
		
				

	}

}
