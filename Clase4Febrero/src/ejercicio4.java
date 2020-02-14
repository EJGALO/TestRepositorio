import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
/* Realice un programa el cual ingresada una cadena :
 *1. Devuelva el largo	 total
 *2. El caracter, ingresado un indice
 *3. La cadena resultante, cortandola desde un indice
 *4. La cadena resultante, cortandola desde dos indices
 *5.La cadena concatenada
 *6. El indice dentro de un caracter ingresado a partir de un indice definido
 *7. Comprobar la igualdad de cadenas (Talentos y talentos, talenTOS y talentos, talentos y talentos)
 *8. Convertir a minusculas
 *9. Convertir a mayusculas
 *10. Reemplazar caracteres por una letra ingresada
 * 
 */
		String acumulador_palabra = "";
		String acumulador_palabra2= "";
		System.out.println("Ingrese una cadena ");
		
		Scanner scan = new Scanner(System.in);
		
		String palabraIngresada = scan.nextLine();
		
		int largo = palabraIngresada.length() ;
		String minuscula = palabraIngresada.toLowerCase() ;
		String mayus = palabraIngresada.toUpperCase() ;
	            
		System.out.println("1. El largo total de la cadena ingresada es de " + largo + " caracteres");
		
		System.out.println(" Elija un valor entre 0 y " + (largo-1) );
				int indice= scan.nextInt();
		
		System.out.println("2. El valor ingresado equivale a la letra:   " + palabraIngresada.charAt(indice) ) ;
		
		
		for (int i = indice; i < largo; i++) {
          
           char acumulador_p = palabraIngresada.charAt(i) ;
           acumulador_palabra += acumulador_p;
		}
		 System.out.println( "3. La cadena resultante, cortada desde el indice " + indice + " es " + acumulador_palabra) ;
		
		
		System.out.println("Ingrese un nuevo primer indice");
		int indice_primero= scan.nextInt();
		System.out.println("Ingrese un segundo indice");
		int indice_segundo= scan.nextInt();
		
		for (int i = indice_primero; i < indice_segundo; i++) {
	          
	           char acumulador_p2 = palabraIngresada.charAt(i) ;
	           acumulador_palabra2 += acumulador_p2;
		}
		
	           
	  		 System.out.println( "4. La cadena resultante, cortada desde el indice " + indice_primero + 
	  				 												" hasta " + indice_segundo + " es " + acumulador_palabra2) ;
	  		 
	  		 
	  		 System.out.println( "5. Concatenando los resultados, el String seria: " + acumulador_palabra + acumulador_palabra2) ; // TODO, aca seria bueno un nuevo acumulador, no 
	  		 																																																// un solo mostrar los resultados pegados 
		
		
		System.out.println(" ");
		
		
		// 7. Comprobar la igualdad de cadenas (Talentos y talentos, talenTOS y talentos, talentos y talentos) 
		
		String tal1 = "Talentos" ;
		String tal2 = "talentos" ;
		String tal3= "talenTOS" ;
		
		if (tal1 == tal2) {
			System.out.println("Los strings son identicos") ;
			else { System.out.println("Los valores no son identicos") ;
			
			}
		}
		
		
		
		
		
		
		System.out.println("8. Convertido a minusculas,  la palabra ingresada seria " + minuscula );
		System.out.println("9. Convertido a mayuscula,  la palabra ingresada seria " + mayus );
	

}
}
