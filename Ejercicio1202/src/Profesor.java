
public class Profesor extends Persona {
	
		private String IdProfesor;
		
		public Profesor(String nombre, int edad)
					{super(nombre,edad);}
		
		public void setIdProfesor (String IdProfesor) 
		{this.IdProfesor = IdProfesor;}
		
		public String getIdProfesor() 
		{return IdProfesor;}
		
		
		public void mostrarNombre() {System.out.println("Nombre del  profesor:" +getNombre());
		}
		
		public void mostrarEdad() {System.out.println("Edad del  profesor:" +getEdad());	
		}
		
		public void mostrarIDprofesor() {System.out.println("El ID del profesor es :" +getIdProfesor());
		
		}
		
}

