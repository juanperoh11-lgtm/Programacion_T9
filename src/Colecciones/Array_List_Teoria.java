package Colecciones;

import java.util.ArrayList;

public class Array_List_Teoria {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String> ();
		//Lo mismo que hacer (no se puede poner el mismo nombre a un array que a un array.list
		///String nombres[] = new String [4];s
		
		//Introducir elementos
		nombres.add("Ana");
		nombres.add("Maria");
		nombres.add("Paula");
		nombres.add("Teresa");
		nombres.add("Pepe");
		nombres.add("Alberto");
		
		//Mostrar el array
		for(String n:nombres)
			System.out.println(n);
		
		//Borrar Nombres
		
		//Primera forma
		nombres.remove("Maria");
		
		//Segunda forma, borra el que esta en la posición 2(Teresa) pero como la hemos borrado antes, ahora borra 
		//El siguiente nombre
		nombres.remove(2);
		
		System.out.println("//////////");
		
		//Para recorrer el arra.list se usa size en lugar de length
		for(int i=0; i<nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		
		
		
	}

}
