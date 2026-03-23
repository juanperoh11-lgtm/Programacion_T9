package Ejemplo_ArrayList_Ej4;

import java.util.Arrays;

public class Profesor extends Persona {

	private String [] asignaturas;
	public Profesor(String dni, String nombre, String[] asignaturas) {
		super(dni, nombre);
		this.asignaturas = asignaturas;
	}
	@Override
	public String toString() {
		return super.toString() + "Profesor [asignaturas=" + Arrays.toString(asignaturas) + "]";
	}

	
}
