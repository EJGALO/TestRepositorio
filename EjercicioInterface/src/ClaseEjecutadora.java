//Esta es la 
public class ClaseEjecutadora {

	public static void main(String[] args) {
	
		
		Acumulador acum = new Acumulador(1000) ; // inicalizamos una nueva clase  y definimos el " i " 
		
		acum.incremento(5) ; // acum es el nombre de la clase que vos mismo definiste genio, y cuando pones 
										// .incremento es llamar al metodo que TAMBIEN ya habias definido en la clase acumulador.
										// por lo tanto, el 5, es simplemente asignarle el valor al " a " de esa clase, e incremento
										// ejecuta el metodo, que lo unico que hace es this.valor += a, o sea, sumarle el 5 al valor
		
		System.out.println("El valor es de " + acum.daValor() ); // aca muestra en pantalla el valor de 
																//

				
	}

}
