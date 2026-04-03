package Ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		char opcion = sc.next().toLowerCase().charAt(0);

		do {
			System.out.println("---Menú---");
			System.out.println("a)");
			System.out.println("b)");
			System.out.println("c)");
			System.out.println("d)");
			System.out.println("Selecciona  una obción, selecciona la d para salir");

			
			switch (opcion) {
			case 'a':
				if (lista.isEmpty()) {
					System.out.println("La lista está vacía.");
				} else {
					System.out.println("Valores en la lista: " + lista);
				}
				break;

			case 'b':
				System.out.print("Introduce el valor (V) a añadir al final: ");
				int Final = sc.nextInt();
				lista.add(Final);
				System.out.println("Valor añadido.");
				break;

			case 'c':
				System.out.print("Introduce un valor: ");
				int v = sc.nextInt();
				System.out.print("Introduce la posición (P) (Empezando desde 0): ");
				int p = sc.nextInt();

				
				if (p >= 0 && p <= lista.size()) {
					lista.add(p, v);
					System.out.println("Valor añadido en la posición " + p);
				} else {
					System.out.println("Error: Posición fuera de rango. El tamaño actual es " + lista.size());
				}
				break;

			case 'd':
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida, intenta de nuevo.");
			}

		} while (opcion != 'd');

		sc.close();
	}
}