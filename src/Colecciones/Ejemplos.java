package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplos {

	public static void main(String[] args) {
		
		//Programa para introducir nombres hasta que se escriba salir
		Scanner sc = new Scanner(System.in);
		//Este arrayList es de Strings
		ArrayList<String> nombres = new ArrayList<String>();
		boolean parar = false;
		
		
		while(!parar) {
			System.out.println("Introduce un nombre o escribe PARAR para salir");
			String dato = sc.nextLine();
			
			if(dato.equalsIgnoreCase("parar"))
				break;
			
			//El contains sirve para recorrer el array, funciona porque dato es un String
			//Hace la función de un for each
			if(!(nombres.contains(dato)))
				nombres.add(dato);
			
			else
				System.out.println("El nombre ya existe");
		}
		
	}

}
