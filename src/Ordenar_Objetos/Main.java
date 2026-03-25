package Ordenar_Objetos;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		empleados.add(new Empleado ("Juan", "111k", 32));
		empleados.add(new Empleado ("Pepe", "115k", 13));
		empleados.add(new Empleado ("Alberto", "118k", 27));
		empleados.add(new Empleado ("Alejandro", "141k", 23));
		empleados.add(new Empleado ("Jaime", "171k", 25));
		
		Collections.sort(empleados);
			
		for(Empleado e:empleados)
			System.out.println(e);
	}

}
