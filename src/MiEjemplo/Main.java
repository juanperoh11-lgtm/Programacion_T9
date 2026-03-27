package MiEjemplo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		// Creación de un array list
		/// Dentro de las llaves se establece el tipo de datos que vas a introducir,
		/// En caso de introducir uno erronio no funcionara el código
		ArrayList<String> comida = new ArrayList<String>();

		// Añadir Elementos
		comida.add("Pizza");
		comida.add("Macarrones");
		comida.add("Jamón");

		// Recorrer el array
		for (int i = 0; i < comida.size(); i++) {
			// Mostrar el array
			System.out.println(comida.get(i));
		}

		System.out.println();

		// Mostrar el numero de elementos de un arrayList, En este caso lo muesra tres
		// veces porque esta dentro de un for
		for (int i = 0; i < comida.size(); i++) {
			System.out.println(comida.size());
		}

		System.out.println();

		// Cambiar un elemento, el cero es la posicón del elemento que quieres cambiar y
		// el nombre es el nuevo elemento
		comida.set(0, "Pan");
		for (int i = 0; i < comida.size(); i++) {
			System.out.println(comida.get(i));
		}

		System.out.println();

		// Ordenar un arrayList
		Collections.sort(comida);
		System.out.println(comida);

		System.out.println();

		// Borrar un elemeto
		comida.remove(0);
		for (int i = 0; i < comida.size(); i++) {
			System.out.println(comida.get(i));
		}

		System.out.println();

		// Eliminar completamente un arrayList, en el cual ya no se muestra por pantalla
		comida.clear();
		for (int i = 0; i < comida.size(); i++) {
			System.out.println(comida.get(i));
		}

		System.out.println();
		System.out.println("-----------------------------------");

		/**
		 * Ejemplo 2: Dos atributos: nombre (String) y cantidad (int). n constructor con
		 * parámetros. Métodos get y set asociados a los atributos. Sobrescritura del
		 * método toString()
		 */

		ArrayList<Producto> lista = new ArrayList<Producto>();

		Producto p1 = new Producto("Pan", 6);
		Producto p2 = new Producto("Leche", 2);
		Producto p3 = new Producto("Fresas", 20);
		Producto p4 = new Producto("Col", 1);
		Producto p5 = new Producto("Carne", 3);

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);

		System.out.println("La lista contiene " + lista.size() + "productos: ");
		for (Producto producto : lista) {
			System.out.println("\t" + producto);
		}

	}

}
