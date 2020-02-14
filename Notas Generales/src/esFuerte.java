import java.util.Scanner;

public class esFuerte {
	/*5 numeros
	2 mayusculas
	mas de 1 minuscula
	*/
	public static void main(String[] args) {
		
			int contMinus = 0;
		 	int contMayus = 0;
	        int contNum = 0;
	         int longitud_pass = 8;
	        
	       

		System.out.println("Favor ingrese su nueva contraseña");
		
		Scanner input = new Scanner (System.in) ;
		
		String user_pass = input.nextLine() ;
	
		
		 for (int i = 0; i < 7; i++) {

	            char ch = password.charAt(i);

	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }
		 
		 System.out.println("Su contraseña tiene" + contMinus + " minusculas");
		 System.out.println("Su contraseña tiene" + contMayus + " mayusculas");
		 System.out.println("Su contraseña tiene" + contNum + " numeros");

		
	}

}
