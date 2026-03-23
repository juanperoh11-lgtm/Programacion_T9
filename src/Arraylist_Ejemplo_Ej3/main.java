package Arraylist_Ejemplo_Ej3;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Rectangulo> rectangulos = new ArrayList<Rectangulo>();
		
		rectangulos.add(new Rectangulo (new Punto(2,3), new Punto(4,4)));
		
		if(rectangulos.contains(new Rectangulo (new Punto(2,3), new Punto(4,4))))
			System.out.println("El rectangulo ya existe");
		else
			System.out.println("El rectangulo ya exsite");
		
		System.out.println(rectangulos.size());
		//Para que se pueda borrar un punto se necesita un equals pera si fuese un doble o un int no 
		rectangulos.remove(new Rectangulo(new Punto(2,3), new Punto(4,4)));
		System.out.println(rectangulos.size());
				
	}

}
