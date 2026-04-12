package Ejercicio16;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Jugador> plantilla = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\n--- Gestión de Plantilla ---");
			System.out.println("1. Añadir jugador");
			System.out.println("2. Eliminar jugador");
			System.out.println("3. Mostrar plantilla");
			System.out.println("4. Buscar por número");
			System.out.println("5. Modificar nombre");
			System.out.println("6. Modificar posición");
			System.out.println("7. Salir");
			opcion = sc.nextInt();

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
					System.out.print("Posición: ");
					String pos = sc.nextLine();
					plantilla.put(dorsal, new Jugador(nombre, pos));
					System.out.println("Jugador añadido con éxito.");
				}
				break;

			case 2:
				System.out.print("Dorsal a eliminar: ");
				if (plantilla.remove(sc.nextInt()) != null)
					System.out.println("Jugador eliminado.");
				else
					System.out.println("No se encontró el jugador.");
				break;

			case 3:
				System.out.println("--- Lista de Jugadores ---");
				if (plantilla.isEmpty()) {
					System.out.println("No hay jugadores.");
				} else {
					// Recorrer el hashMap
					for (Entry<Integer, Jugador> entrada : plantilla.entrySet()) {
						System.out.println("Dorsal: " + entrada.getKey() + " -> " + entrada.getValue());
					}
				}
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
				sc.nextLine();
				if (plantilla.containsKey(dNombre)) {
					System.out.print("Nuevo nombre: ");
					plantilla.get(dNombre).setNombre(sc.nextLine());
					System.out.println("Nombre actualizado.");
				} else {
					System.out.println("Jugador no encontrado.");
				}
				break;

			case 6:  
				System.out.print("Dorsal del jugador a cambiar de posición: ");
				int dPos = sc.nextInt();
				sc.nextLine();
				if (plantilla.containsKey(dPos)) {
					System.out.print("Nueva posición: ");
					plantilla.get(dPos).setPosicion(sc.nextLine());
					System.out.println("Posición actualizada.");
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

}
