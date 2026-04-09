package Ejercicio14;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, String> plantilla = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		int opcción;

		do {
			System.out.println("Gestión de Plantilla");
			System.out.println("1. Añadir jugador");
			System.out.println("2. Eliminar jugador");
			System.out.println("3. Mostrar plantilla");
			System.out.println("4. Buscar por número");
			System.out.println("5. Salir");
			opcción = sc.nextInt();

			switch (opcción) {
			case 1:
				System.out.println("Introduce un Jugador para añadir");
				int dorsal = sc.nextInt();
				sc.nextLine();

				// Comprovación de la clave(dorsal) para saber ya existe en el mapa
				if (plantilla.containsKey(dorsal)) {
					System.out.println("El jugador ya existe");
				} else {
					System.out.println("Introduce el nombre del jugador");
					String nombre = sc.nextLine();
					// El dorsal no puede cambiar, pero si el nombre
					plantilla.put(dorsal, nombre);
				}
				break;

			case 2:
				System.out.println("Selecciona al jugador a eliminar");
				int borrar = sc.nextInt();
				// .remove(clave) devuelve el valor eliminado o null si no existía
				if (plantilla.remove(borrar) != null)
					System.out.println("Jugador borrado");
				else
					System.out.println("Jugador no borrado");
				break;

			case 3:
				mostrarTodos(plantilla);
				break;

			case 4:
				System.out.print("Introduce dorsal a buscar: ");
				int buscar = sc.nextInt();
				// containsKey verifica si la llave está en el diccionario
				if (plantilla.containsKey(buscar)) {
					// .get(clave) nos devuelve el nombre asociado a ese dorsal
					System.out.println("El dorsal " + buscar + " pertenece a: " + plantilla.get(buscar));
				} else {
					System.out.println("No hay ningún jugador con el dorsal " + buscar);
				}

			case 5:
				System.out.println("Saliendo del programa...");
				break;

			}
		} while (opcción != 5);
		sc.close();
	}

	//Mas limpio si se usan Metodos
	private static void mostrarTodos(HashMap<Integer, String> plantilla) {
		System.out.println("Lista de Jugadores");
		if (plantilla.isEmpty())
			System.out.println("No hay jugadores dentro de la lista");
		else {
			//Recorrer el Hash map
			for (HashMap.Entry<Integer, String> entrada : plantilla.entrySet()) {
				System.out.println("Dorsal: " + entrada.getKey() + " - Nombre: " + entrada.getValue());
			}
		}
		
	}

}
