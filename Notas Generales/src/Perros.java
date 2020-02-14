
public class Perros {

	public static void main(String[] args) {
		String raza  ;
		int peso ;
		
		
		Perros Scooby = new Perros() ;
		
	
		peso = 10 ;
		raza= "sharpei" ;
		
		
		
		Perros Fido= Scooby ;
		
		
		System.out.println(Fido);
		System.out.println(Scooby);

	}

}
