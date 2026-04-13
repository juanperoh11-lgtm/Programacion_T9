package Ejercicio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Jugador> plantilla = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int opcion;

		plantilla.put(6, new Jugador("Guti", "Medio_Centro"));
		plantilla.put(10, new Jugador("Cristiano Ronaldo", "Delantero"));
		plantilla.put(9, new Jugador("Lionel Messi", "Delantero"));

		do {
			System.out.println("\n--- Gestión de Plantilla ---");
			System.out.println("1. Añadir jugador");
			System.out.println("2. Eliminar jugador");
			System.out.println("3. Mostrar plantilla");
			System.out.println("4. Buscar por número");
			System.out.println("5. Modificar nombre");
			System.out.println("6. Modificar posición");
			System.out.println("7. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.print("Introduce dorsal: ");
				int dorsal = sc.nextInt();
				sc.nextLine();

				if (plantilla.containsKey(dorsal)) {
					System.out.println("El dorsal ya está ocupado.");
				} else {
					System.out.print("Nombre: ");
					String nombre = sc.nextLine();
					System.out.print("Posición (Delantero, Defensa, Portero, Medio_Centro): ");
					String pos = sc.nextLine();
					if (esCorrecta(pos)) {
						plantilla.put(dorsal, new Jugador(nombre, pos));
						System.out.println("Jugador añadido con éxito.");
					} else {
						System.out.println("Posición incorrecta.");
					}
				}
				break;

			case 2:
				System.out.print("Dorsal a eliminar: ");
				int dEliminar = sc.nextInt();
				if (plantilla.remove(dEliminar) != null)
					System.out.println("Jugador eliminado.");
				else
					System.out.println("No se encontró el jugador.");
				break;
				
			case 3:
					mostrarTodosOrdenados(plantilla);
				break;

			case 4:
				System.out.print("Introduce dorsal: ");
				int b = sc.nextInt();
				if (plantilla.containsKey(b))
					System.out.println("Ficha: " + plantilla.get(b));
				else
					System.out.println("No existe ese dorsal.");
				break;

			case 5:
				System.out.print("Dorsal del jugador a renombrar: ");
				int dNombre = sc.nextInt();
				sc.nextLine(); // Limpiar buffer
				if (plantilla.containsKey(dNombre)) {
					System.out.print("Nuevo nombre: ");
					plantilla.get(dNombre).setNombre(sc.nextLine());
					System.out.println("Nombre actualizado.");
				} else {
					System.out.println("Jugador no encontrado.");
				}
				break;

			case 6:
				System.out.print("Dorsal para cambiar posición: ");
				int dPos = sc.nextInt();
				sc.nextLine(); // Limpiar buffer
				if (plantilla.containsKey(dPos)) {
					System.out.print("Nueva posición: ");
					String nuevaPos = sc.nextLine();
					if (esCorrecta(nuevaPos)) {
						plantilla.get(dPos).setPosicion(nuevaPos);
						System.out.println("Posición actualizada.");
					} else {
						System.out.println("Posición no válida.");
					}
				} else {
					System.out.println("Jugador no encontrado.");
				}
				break;

			case 7:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 7);
		sc.close();
	}

	private static boolean esCorrecta(String pos) {
		// Corregido "Porteto" y simplificado
		return pos.equals("Delantero") || pos.equals("Defensa") || pos.equals("Portero") || pos.equals("Medio_Centro");
	}

	private static void mostrarTodosOrdenados(HashMap<Integer, Jugador> plantilla) {
		List<Integer> alNumeros = new ArrayList<Integer>(plantilla.keySet());
		Collections.sort(alNumeros);
		for(Integer num: alNumeros) {
			System.err.println("Jugador número " + num + " " + plantilla.get(num));
		}
		
		///Mostrar todos
		/*
		System.out.println("--- Lista de Jugadores ---");
		if (plantilla.isEmpty()) {
			System.out.println("No hay jugadores.");
		} else {
			for (Entry<Integer, Jugador> entrada : plantilla.entrySet()) {
				System.out.println("Dorsal: " + entrada.getKey() + " -> " + entrada.getValue());
			}
		}
		*/
	}
}