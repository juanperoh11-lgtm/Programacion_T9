package Ordenar_Objetos;

public class Empleado implements Comparable<Empleado> {
	private String nombre, dni;
	private int edad;
	
	public Empleado(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		
		return this.nombre.compareTo(o.nombre);
	}
	
	
}
