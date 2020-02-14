
public class carro { // Esta clase es la que pensas asociar luego a la clase principal


		
		
		private int velocidad;   	// atributo privado
		private int aceleracion;	// atributo privado
		private String nombre;		// atributo privado
		
		
		
		
		
		
		
		// set y get
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
					this.velocidad=velocidad ;
		}
		
		
		public int getAceleracion() {
			return aceleracion;
		}
		public void setAceleracion(int aceleracion) {
					this.aceleracion = aceleracion ;
		}
		
		
		
		public String getNombre() {
			return nombre ;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre ;
			}
		
		public void acelerar(int aceleracion) { // void porque no devuelve nada, lo que hara es acelerar el carro
			this.aceleracion = aceleracion ;
			velocidad += this.aceleracion;
		}
		
		// de ahi creamos otro metodo que lo unico que hace es frenar 
		public void frenar() {
			velocidad= 0 ;
		}
	}
		
		
		

