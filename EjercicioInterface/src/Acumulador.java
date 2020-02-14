
public class Acumulador implements Actualizacion {

	private int valor; 
	
	
	public Acumulador (int i)  // Este es el metodo set que le asigna un valor a i, FIJA el valor
		{this.valor= i; // usamos this.valor porque, hace referencia al metodo 
	}
	
	public int daValor() { // aca creamos otro metodo, getter, este RECUPERA el valor
		return this.valor; // esto es lo que hace el metodo
	}
	
	public void incremento (int a) { // este es OTRO metodo OBLIGATORIO, porque estamos implementando la
													// interface actualizacion. 
		this.valor += a; // el valor de " a " se le incrementara al valor de antes que es definido por " i "
	}
}
