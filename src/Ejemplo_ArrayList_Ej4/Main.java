package Ejemplo_ArrayList_Ej4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("111k", "Ana");
		ArrayList<Persona> personas = new ArrayList<Persona>();
		/*
		/// En este momento se pueden meter elementos repetidos
		personas.add(new Persona ("111k", "Ana"));
		personas.add(new Persona ("111k", "Ana"));
		personas.add(p1);
		
		/// Como no esta creado el metodo equals del objeto, no es posible borrar ningun elemento del ArrayList
		personas.remove(new Persona ("111k", "Ana"));
		/// Pero si yo creo una nueva persona, esta se puede borrar sin el método equals
		personas.remove(p1);
		
		if(personas.contains(new Persona ("111k", "Ana")))
			System.out.println("La persona ya eciste");
		else {
			System.out.println("SE insertará");
			personas.add(new Persona ("111k", "Ana"));
		}
		for(Persona p:personas)
			System.out.println(p);
			*/
		
		personas.add(new Profesor("111k", "Ana", new String[] { "Programación", "BD"}));
		personas.add(new Alumno ("222h", "Juan", 8.9));
		
		for(Persona p:personas)
			System.out.println(p);
		
		//Pare ordenar
		Collections.sort(null);
	}

}
