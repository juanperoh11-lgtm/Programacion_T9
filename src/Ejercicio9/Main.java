package Ejercicio9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Alejandro");
		lista.add("Avelino");
		lista.add("Rodrigo");
		lista.add("Santiago");
		lista.add("Álvaro");
		lista.add("Christian");
		
		System.out.println("Lista de compañeros");
		for(String nombre:lista)
			System.out.println("- "+ nombre);
	}

}
