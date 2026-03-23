package Ejemplo_ArrayList_Ej5;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(4);
		numeros.add(8);
		
		// El set cambia el 8 por 9
		numeros.set(1, 9);
		
		// Y el add añade en la posiión 1 el 8 y desplace el 9 a la posición 2
		numeros.add(1, 8);
		
		
		if (!numeros.isEmpty())
			System.out.println("no esta vacio");
		else
			System.out.println("Esta vacio");
		
		//Recorer el array
		for(int n:numeros)
			System.out.println(n);
		//Segunda forma
		for(int i =0; i<numeros.size();i++)
			System.out.println(numeros.get(i));
		//Tercera forma
		Iterator iterator = numeros.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
