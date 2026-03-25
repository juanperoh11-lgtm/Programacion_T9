package Has_map_2;

import java.util.HashMap;
import java.util.Map;

import Ordenar_Objetos.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Empleado> hmEmpleados = new HashMap<String, Empleado> ();
		
		for(String clave:hmEmpleados.keySet())
			System.out.println(hmEmpleados.get(clave));
		
	}

}
