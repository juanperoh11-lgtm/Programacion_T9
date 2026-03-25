package Ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> miLista = Libreria_ArrayLits.generaArrayListInt(10, 20, 30);

		System.out.println("Lista generada: " + miLista);
		System.out.println("Mínimo: " + Libreria_ArrayLits.minimoArrayListInt(miLista));
		System.out.println("Máximo: " + Libreria_ArrayLits.maximoArrayListInt(miLista));
		System.out.printf("Media: %.2f\n", Libreria_ArrayLits.mediaArrayListInt(miLista));
		System.out.println("El número 14 esta ?" + Libreria_ArrayLits.estaEnArrayListInt(miLista, 14));
		System.out.println("El número 14 esta ?" + Libreria_ArrayLits.posicionEnArrayList(miLista, 14));
		System.out.println("Array volteado: " +  Libreria_ArrayLits.volteaArrayListInt(miLista)) ;
	}
}