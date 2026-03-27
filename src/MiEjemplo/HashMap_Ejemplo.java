package MiEjemplo;

import java.util.HashMap;

public class HashMap_Ejemplo {

	public static void main(String[] args) {

		/// HashMap implementa la interfaz Map que permite almacenar pares del tipo  key/value.
		/// La clave (key) permite acceder al valor. No puede haber claves duplicadas.

		// Declaración del HasMap
		HashMap<String, Double> map = new HashMap<>();

		// Añadir elementos
		map.put("Apple", 0.5);
		map.put("Orange", 0.75);
		map.put("Movistar", 0.25);
		System.out.println(map.get("Apple"));

		// En este caso si es posible sobreescribir un valor de un hashMap
		map.put("Apple", 1000.2);

		// Eliminar elemtos se hace con en remove al igual que en los arrayLists

		// Ver el codigo de los elementos
		System.out.println(map.get("Apple"));

		// Ver todo
		System.out.println(map);

		// Ver si algun elemtto existente o no tenga un código
		// En caso afirmativo devueve true, en caso negativo devuelve false
		System.out.println(map.containsKey("Apple"));

		/// Ver si un elementos esta dentro del hash map y si tiene un códgio y en caso contrario decir que no esta dentro
		if (map.containsKey("Vodafone")) {
			System.out.println(map.get("Vodafone"));
		} else {
			System.out.println("El lemento no esta dentro del HashMap");
		}
		
		//Ver con un valor el producto
		System.out.println(map.containsValue(0.5));
		
		//Tamaño del map
		System.out.println(map.size());
	}

}
