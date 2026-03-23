package Ejemplo_ArrayList_Ej4;

public class Persona {
	
	private String dni,nombre;

	
	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Persona))
			return false;
		if (this == obj)
			return true;
		Persona P =  (Persona) obj;
		return this.dni.equals(P.dni) && (this.nombre.equalsIgnoreCase(P.nombre));
	}
	
}
