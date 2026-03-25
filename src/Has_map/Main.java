package Has_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> empleados = new HashMap<Integer, String>();
		
		empleados.put(1537, "PEPE");
		empleados.put(1527, "ANA");
		empleados.put(1537, "Juan");
		empleados.put(1567, "Gonzalo");
		empleados.put(1587, "Alejandro");
		
		//Busquedas rápidas
		System.out.println(empleados.get(1537));
		System.out.println(empleados.get(1487));
		
		if(empleados.containsKey(2)) {
			System.out.println(empleados.get(2));
		}
		
		ArrayList<Integer> todasLasClaves = new ArrayList<Integer> (empleados.keySet());
		
		for(int a:todasLasClaves)
			System.out.println(empleados.get(a));
		
		// Esto da todas las claves
		for(Entry<Integer, String> par: empleados.entrySet()) {
			System.out.println("La clave es: "+ par.getKey()+  " y el valor asociado es: " + par.getValue());
		}
		
		// Esto da todos los nombres
		System.out.println();
		for(Integer clave:empleados.keySet()) {
			System.out.println(empleados.get(clave) + "");
		}
		System.out.println();
		
		for(String valor:empleados.values()) {
			System.out.println(valor + "");
		}
		
	}

}
