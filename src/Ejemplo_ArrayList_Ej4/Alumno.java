package Ejemplo_ArrayList_Ej4;

public class Alumno extends Persona{
	
	double notamedia;
	
	public Alumno(String dni, String nombre, double notamedia) {
		super(dni, nombre);
		this.notamedia = notamedia;
	}

	/**
	 * @return the notamedia
	 */
	public double getNotamedia() {
		return notamedia;
	}

	/**
	 * @param notamedia the notamedia to set
	 */
	public void setNotamedia(double notamedia) {
		this.notamedia = notamedia;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [notamedia=" + notamedia + "]";
	}
	
	
	
}
