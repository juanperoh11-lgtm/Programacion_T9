package Colecciones;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String> (4);
		//Lo mismo que hacer
		String nomb[] = new String [4];
		
		//Introducir elementos
		nombres.add("Ana");
		nombres.add("Maria");
		nombres.add("Paula");
		nombres.add("Teresa");
		
		
		for(String n:nombres)
			System.out.println(n);
		
		//Borrar Nombres
		
		//Primera forma
		nombres.remove("Maria");
		
		//Segunda forma, borra el que esta en la posición 2 borrar a Maria
		nombres.remove(2);
		
		System.out.println("//////////");
		
		for(int i=0; i<nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		
		
		
	}

}
