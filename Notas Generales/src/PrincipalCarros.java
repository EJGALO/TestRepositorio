
public class PrincipalCarros {

	public static void main(String[] args) {
		carro citroen = new carro();

		citroen.setAceleracion(0);
		citroen.setVelocidad(20);
		citroen.setNombre("Picasso");
		
		System.out.println("El nombre del carro es " + citroen.getNombre() + " y tiene una velocidad de : " + citroen.getVelocidad()) ;
	}

}
