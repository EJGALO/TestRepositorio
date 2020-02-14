import java.util.Scanner;

public class Ejecutadora {

	public static void main(String[] args) {
	
	
		
		System.out.println("Ingrese el nombre ");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		
		
		
		Profesor pepito =  new Profesor("Pepito", 18);
		
		pepito.setIdProfesor("001_Profesor");
		pepito.mostrarNombre(); // este metodo muestra en pantalla un string 
		pepito.mostrarEdad();
		pepito.mostrarIDprofesor();
				
				
	
		
		
		
	}

}
