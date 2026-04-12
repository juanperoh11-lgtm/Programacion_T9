package Ejercicio16;

public class Jugador {

	private String nombre, posicion;

	public Jugador(String nombre, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
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
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + "]";
	}
	
	
	
}
