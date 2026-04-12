package Ejercicio17;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Integer> numeros = new HashMap<>();

		numeros.put(1, 10);
		numeros.put(2, 20);
		numeros.put(3, 30);
		numeros.put(4, 40);
		numeros.put(5, 50);

		System.out.println("Contenido del ArrayList");
		for (Map.Entry<Integer, Integer> entrada : numeros.entrySet()) {
			System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue());
		}
		
		// 3. Modificar valores con clave PAR (multiplicar por 2)
		for (Integer clave : numeros.keySet()) {
			if (clave % 2 == 0) {
				numeros.put(clave, numeros.get(clave) * 2);
			}

		}
		
		// Tras la modificación
		System.out.println("Contenido del ArrayList tras la modificación de los números pares");
		for (Map.Entry<Integer, Integer> entrada : numeros.entrySet()) {
			System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue());
		}

		for (Integer clave : numeros.keySet()) {
			if (clave % 2 != 0) {
				numeros.put(clave, numeros.get(clave) + 10);
			}
		}

		// Tras la modificación
		System.out.println("\n Tras modificar claves impares (+10) ");
		for (Map.Entry<Integer, Integer> entrada : numeros.entrySet()) {
			System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue());
		}
	}
}
